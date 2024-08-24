import os
from transformers import AutoTokenizer, AutoModelForCausalLM
import torch

# Definir o nome do modelo e o caminho para salvá-lo
model_name = "EleutherAI/gpt-j-6B"
model_path = "./models/gpt-j-6B"

# Verificar se o modelo já está salvo localmente
if os.path.exists(model_path):
    print("Carregando modelo do diretório local...")
    tokenizer = AutoTokenizer.from_pretrained(model_path)
    model = AutoModelForCausalLM.from_pretrained(model_path, low_cpu_mem_usage=True)
else:
    print("Baixando modelo e salvando localmente...")
    # Criar o diretório se não existir
    os.makedirs(model_path, exist_ok=True)
    
    # Baixar e salvar o tokenizador e o modelo
    tokenizer = AutoTokenizer.from_pretrained(model_name)
    model = AutoModelForCausalLM.from_pretrained(model_name, torch_dtype=torch.float16, low_cpu_mem_usage=True)
    
    # Salvar o tokenizador e o modelo localmente
    tokenizer.save_pretrained(model_path)
    model.save_pretrained(model_path)

# Mover o modelo para GPU se disponível
device = "cuda" if torch.cuda.is_available() else "cpu"
model = model.to(device)

# Definir o prompt
prompt = "What is the result of 8 multiplied by 5?"

# Tokenizar o prompt
input_ids = tokenizer.encode(prompt, return_tensors="pt").to(device)

# Gerar a resposta
output = model.generate(
    input_ids,
    max_length=15,
    num_return_sequences=1,
    do_sample=True,
    top_k=50,
    top_p=0.95,
    num_beams=5,
    early_stopping=True
)

# Decodificar e imprimir a resposta
generated_text = tokenizer.decode(output[0], skip_special_tokens=True)
print(generated_text)