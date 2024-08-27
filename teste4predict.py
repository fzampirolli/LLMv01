import torch
from transformers import AutoTokenizer, AutoModelForSequenceClassification


# Exemplo de novo texto
new_text = """
import java.util.Scanner;

public class Aluno__Questao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    }
    
    public static boolean comparaVetor(int v[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (v[i] == k) {
                return true;
            }
        }
        return false;
    }
}
"""

# Pré-processar o texto
tokenizer = AutoTokenizer.from_pretrained("bert-base-uncased")
new_encoding = tokenizer(new_text, truncation=True, padding='max_length', max_length=128)

# Criar dicionário de entrada
new_input = {
    'input_ids': torch.tensor([new_encoding['input_ids']], dtype=torch.long),
    'attention_mask': torch.tensor([new_encoding['attention_mask']], dtype=torch.long),
}

# Carregar o modelo treinado (substitua o caminho pelo local real do seu modelo salvo)
trained_model = AutoModelForSequenceClassification.from_pretrained("./results/checkpoint-354", num_labels=5)

# Definir o modelo para modo de avaliação
trained_model.eval()

# Fazer a previsão
with torch.no_grad():
    outputs = trained_model(**new_input)
    logits = outputs.logits

# Obter a classe prevista com base no valor logit mais alto
predicted_class = torch.argmax(logits, dim=1).item()

# Supondo que seus rótulos estejam mapeados para categorias (substitua pela sua lógica real)
label_map = {0: "Negative", 1: "Neutral", 2: "Positive", 3: "Very Positive", 4: "Extremely Positive"}
predicted_label = label_map[predicted_class]

print(f"Predicted Label for '{new_text}': {predicted_label}")
