from transformers import pipeline

generator = pipeline('text-generation', model='gpt2')
prompt = "What is the result of 8 multiplied by 5?"
output = generator(prompt, max_length=150, num_return_sequences=1, do_sample=True, top_k=50, top_p=0.95, num_beams=5, early_stopping=True)[0]['generated_text']

print(output)