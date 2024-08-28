import os, re, shutil

import torch
from torch.utils.data import Dataset
from transformers import AutoTokenizer, AutoModelForSequenceClassification, Trainer, TrainingArguments

# Defina seu tokenizer e modelo
tokenizer = AutoTokenizer.from_pretrained("bert-base-uncased", clean_up_tokenization_spaces=True)
model = AutoModelForSequenceClassification.from_pretrained("bert-base-uncased", num_labels=5)

# Função para ler arquivos de texto e Java em subpastas recursivas
label_mapping = {
    'F': 0,
    'D-': 1, 'D': 1, 'D+': 1,
    'C-': 2, 'C': 2, 'C+': 2,
    'B-': 3, 'B': 3, 'B+': 3,
    'A-': 4, 'A': 4, 'A+': 4
}

def java2py(java_code):
    def parse_block(code, indent=0):
        lines = code.strip().split('\n')
        python_code = []
        i = 0
        while i < len(lines):
            line = lines[i].strip()
            
            # Ignore empty lines and comments
            if not line or line.startswith('//'):
                i += 1
                continue
            
            # Handle class definition and main method
            if line.startswith('public class') or 'public static void main' in line:
                i += 1
                continue
            
            # Handle method definitions
            if line.startswith('public static') or line.startswith('public'):
                method_name = re.search(r'\w+\s+(\w+)\s*\(', line).group(1)
                args = re.search(r'\((.*?)\)', line).group(1)
                python_code.append(('    ' * indent) + f"def {method_name}({args}):")
                
                block_start = i + 1
                block_end = find_matching_brace(lines, block_start)
                block_code = '\n'.join(lines[block_start:block_end])
                python_code.extend(parse_block(block_code, indent + 1))
                i = block_end + 1
                continue
            
            # Handle array declarations
            if '[' in line and ']' in line and '=' in line:
                var_name = line.split('[')[0].split()[-1]
                values = re.search(r'\{(.*?)\}', line)
                if values:
                    python_line = f"{var_name} = [{values.group(1)}]"
                    python_code.append(('    ' * indent) + python_line)
                i += 1
                continue
            
            # Handle control structures (for, while, if, else)
            if line.startswith(('for', 'while', 'if', 'else')):
                if line.startswith('for'):
                    condition = re.search(r'\((.*?)\)', line)
                    if condition:
                        init, cond, incr = [x.strip() for x in condition.group(1).split(';')]
                        var_name = init.split()[-1]
                        start = init.split('=')[-1].strip()
                        end = cond.split('<')[-1].strip()
                        python_line = f"for {var_name} in range({start}, {end}):"
                elif line.startswith('while'):
                    condition = re.search(r'\((.*?)\)', line)
                    if condition:
                        python_line = f"while {condition.group(1)}:"
                elif line.startswith('if'):
                    condition = re.search(r'\((.*?)\)', line)
                    if condition:
                        python_line = f"if {condition.group(1)}:"
                else:  # else
                    python_line = "else:"
                
                python_code.append(('    ' * indent) + python_line)
                
                block_start = i + 1
                block_end = find_matching_brace(lines, block_start)
                block_code = '\n'.join(lines[block_start:block_end])
                python_code.extend(parse_block(block_code, indent + 1))
                i = block_end + 1
                continue
            
            # Handle simple statements
            python_line = translate_line(line)
            if python_line.strip() and python_line.strip() != '}':  # Ignore closing braces and empty lines
                python_code.append(('    ' * indent) + python_line)
            i += 1
        
        return python_code

    def find_matching_brace(lines, start):
        brace_count = 1
        for i, line in enumerate(lines[start:], start):
            brace_count += line.count('{') - line.count('}')
            if brace_count == 0:
                return i
        return len(lines) - 1

    def translate_line(line):
        # Apply simple translations
        line = re.sub(r'System\.out\.print(ln)?', 'print', line)
        line = re.sub(r'boolean', 'bool', line)
        line = re.sub(r'int\[\]', 'list', line)
        line = re.sub(r'Scanner\s+\w+\s*=\s*new\s+Scanner\(System\.in\);', '', line)
        line = re.sub(r'(\w+)\.nextInt\(\)', 'int(input())', line)

        line = line.replace(';', '')
        
        # Handle string concatenation
        line = re.sub(r'(\w+)\s*\+', r'\1 +', line)

        return line

    # Remove imports and package declarations
    java_code = re.sub(r'import.*?;', '', java_code)
    java_code = re.sub(r'package.*?;', '', java_code)

    try:
        python_code = parse_block(java_code)
        return '\n'.join(filter(lambda x: x.strip(), python_code))  # Remove empty lines
    except Exception as e:
        # print(java_code)
        # print(f"# Error parsing Java code: {str(e)}")
        # exit(0)
        return f"#ERROR Java code: {str(e)}"

def remove_comments(text):
    # Padrão para remover comentários de bloco
    block_comment_pattern = r'/\*.*?\*/'
    # Padrão para remover linhas em branco (com ou sem espaços/tabs)
    blank_line_pattern = r'^\s*$'
    # Padrão para remover linhas que começam com // e têm apenas espaços ou tabs
    full_line_comment_pattern = r'^\s*//.*$'
    # Padrão para remover o que estiver à direita de //
    inline_comment_pattern = r'//.*$'
    
    # Remover comentários de bloco
    text = re.sub(block_comment_pattern, '', text, flags=re.DOTALL)
    # Remover linhas que começam com // e têm apenas espaços ou tabs
    text = re.sub(full_line_comment_pattern, '', text, flags=re.MULTILINE)
    # Remover o que estiver à direita de //
    text = re.sub(inline_comment_pattern, '', text, flags=re.MULTILINE)
    # Remover linhas em branco
    text = re.sub(blank_line_pattern, '', text, flags=re.MULTILINE)
    
    return text

def rename_classes(text):
    # Padrão para encontrar e renomear classes
    class_pattern = r'public class \w+_(\w+) {'
    # Substituir pelo novo nome da classe
    text = re.sub(class_pattern, r'public class \1 {', text)
    
    return text

def rename_file(subdir, file, label_str, contador, text):
    # Obter a extensão do arquivo original
    file_extension = os.path.splitext(file)[1]
    new_filename = f"{label_str};{contador:04d}{file_extension}"
    
    # Caminho completo para o novo arquivo
    new_file_path = os.path.join(subdir, new_filename)
    
    # Renomear o arquivo
    os.rename(os.path.join(subdir, file), new_file_path)
    
    # Escrever o novo conteúdo no arquivo renomeado
    with open(new_file_path, 'w', encoding='utf-8') as f:
        f.write(text)
    
    return new_filename

def read_files_from_subfolders(root_folder):
    texts = []
    labels = []
    contador = 1
    # Definindo a ordem das pastas
    priority_folders = ['q1_ok', 'q2_ok', 'q3_ok']
    
    for priority_folder in priority_folders:
        for subdir, _, files in sorted(os.walk(root_folder)):
            if priority_folder in subdir:
                for file in files:
                    if file.endswith('.class'):
                        os.remove(os.path.join(subdir, file))
                    # if file.endswith('.por'):    
                    #     os.rename(os.path.join(subdir, file), os.path.join(subdir, file)[:-3]+'.txt')
                    #     continue
                        
                    if file.endswith('.java') or file.endswith('.por') or file.endswith('.txt'): 
                        # print(file)
                        label_str = file.split(';')[0]
                        label_str = label_str.split(',')[0]
                        label = label_mapping.get(label_str, -1)  # Use -1 for unknown labels
                        # if label!=4:
                        #     continue
                        try:
                            with open(os.path.join(subdir, file), 'r', encoding='utf-8') as f:
                                text = f.read()
                        except UnicodeDecodeError:
                            try:
                                with open(os.path.join(subdir, file), 'r', encoding='latin-1') as f:
                                    text = f.read()
                            except UnicodeDecodeError:
                                print(f"Skipping file {file} due to decoding error")
                                continue
                        text = remove_comments(text)


                        texts.append(text)
                        labels.append(label)
                        if file.endswith('.java'):

                            ######################### MELHORAR CONVERSOR !!!!
                            text_py = java2py(text)
                            #########################

                            if not "#ERROR Java code:" in text_py:
                                texts.append(text_py)
                                labels.append(label) 
                                # Escrever o novo conteúdo no arquivo renomeado
                                with open(os.path.join(subdir, file)[:-4]+"py", 'w', encoding='utf-8') as f:
                                    f.write(text_py)
                            else:
                                print("#ERROR Java code:",file)


                        print("================================================ENTRADA:")
                        #print(label_str, label)
                        print(text)
                        if file.endswith('.java'):
                            print("======SAÍDA:")
                            text = rename_classes(text)
                            print(text)

                        # new_filename = rename_file(subdir, file, label_str, contador, text)
                        #contador += 1
                        #print(f"Arquivo renomeado para: {new_filename}")

    return texts, labels

# Exemplo de uso
root_folder = './corpus'
texts, labels = read_files_from_subfolders(root_folder)

# exit(0)

# Exemplo de conjunto de dados
class CustomDataset(Dataset):
    def __init__(self, texts, labels):
        self.texts = texts
        self.labels = labels
        self.tokenizer = tokenizer

    def __len__(self):
        return len(self.texts)

    def __getitem__(self, idx):
        text = self.texts[idx]
        label = self.labels[idx]
        
        encoding = self.tokenizer(text, truncation=True, padding='max_length', max_length=128)
        
        return {
            'input_ids': torch.tensor(encoding['input_ids'], dtype=torch.long),
            'attention_mask': torch.tensor(encoding['attention_mask'], dtype=torch.long),
            'labels': torch.tensor(label, dtype=torch.long)
        }

# Crie o conjunto de dados
dataset = CustomDataset(texts, labels)

# Defina o data collator
def data_collator(batch):
    input_ids = torch.stack([item['input_ids'] for item in batch])
    attention_mask = torch.stack([item['attention_mask'] for item in batch])
    labels = torch.stack([item['labels'] for item in batch])
    
    return {
        'input_ids': input_ids,
        'attention_mask': attention_mask,
        'labels': labels
    }

# Defina os argumentos de treinamento
training_args = TrainingArguments(
    output_dir='./results',
    num_train_epochs=3,
    per_device_train_batch_size=8,
    per_device_eval_batch_size=8,
    warmup_steps=500,
    weight_decay=0.01,
    logging_dir='./logs',
)

# Crie o Trainer
trainer = Trainer(
    model=model,
    args=training_args,
    train_dataset=dataset,
    data_collator=data_collator,
)

# 354/354 [1:22:48<00:00, 14.04s/it
# Inicie o treinamento
trainer.train()
