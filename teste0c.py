from transformers import pipeline

# muitos dados para baixar

# Replace 'google/flan-t5-xxl' with a specific LaMDA model if available
generator = pipeline('text-generation', model='google/flan-t5-xxl')
prompt = "What is the result of 8 multiplied by 5?"
output = generator(prompt, max_length=150, num_return_sequences=1, do_sample=True, top_k=50, top_p=0.95, num_beams=5, early_stopping=True)[0]['generated_text']

print(output)