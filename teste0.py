# pip install -r requirements.txt

from transformers import AutoTokenizer, AutoModelForCausalLM
import torch

# Load the GPT-2 model and tokenizer
model_name = "gpt2"
tokenizer = AutoTokenizer.from_pretrained(model_name)
model = AutoModelForCausalLM.from_pretrained(model_name)

# Prepare the text prompt
text = "What is the result of 8 multiplied by 5?"
input_ids = tokenizer.encode(text, return_tensors='pt')

# Generate text using the default generator
output_ids = model.generate(
    input_ids,
    max_length=50,
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

# Decode the generated text
decoded = tokenizer.decode(output_ids[0], skip_special_tokens=True)

# Print the generated poem
print(decoded)