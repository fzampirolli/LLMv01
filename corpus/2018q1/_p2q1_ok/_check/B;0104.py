int tamanho, n
bool existe
print("Digite o tamanho do vetor:   ")
tamanho = int(input())
int vetor[]
for n=0 in range(0, tamanho):
    print("Digite o elemento "+ (n +1)+ " do vetor:   ")
existe = true 
existe= comparaVetor(vetor)
if existe==false:
    print("não existem numeros diferentes de 10 no vetor  ")
else:
    print("Existem numeros diferentes de 10 no vetor  ")
def comparaVetor(int vet[]):
    bool existencia = false
    int i 
    int j
    j=vet.length
    for 0 in range(0, j):
        existencia = true
    return existencia