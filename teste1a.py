# !pip install transformers torch
# python3 teste1a.py

from transformers import AutoTokenizer, AutoModelForCausalLM
import os

# Diretório para salvar o modelo
model_dir = os.path.expanduser("./models/gpt-j-6B")

# Carregue o modelo GPT-J e o tokenizador
model_name = "EleutherAI/gpt-j-6B"
tokenizer = AutoTokenizer.from_pretrained(model_name)

# Se o modelo já estiver salvo, ele será carregado a partir do diretório
# Caso contrário, ele será baixado e salvo no diretório
model = AutoModelForCausalLM.from_pretrained(model_name, cache_dir=model_dir)

# Prepare o texto de entrada
text = "Exemplos de uso do comando de loop em python3"
input_ids = tokenizer.encode(text, return_tensors='pt')

# Gere o texto usando o gerador padrão
output_ids = model.generate(
    input_ids,
    max_length=150,
    num_return_sequences=1,
    do_sample=True,
    top_k=50,
    top_p=0.95,
    num_beams=5,
    early_stopping=True,
    no_repeat_ngram_size=2,
    eos_token_id=tokenizer.eos_token_id,
    bos_token_id=tokenizer.bos_token_id,
    use_cache=True,
    attention_mask=torch.ones_like(input_ids)
)

# Decodifique o texto gerado
decoded = tokenizer.decode(output_ids[0], skip_special_tokens=True)

# Imprima o texto gerado
print(decoded)