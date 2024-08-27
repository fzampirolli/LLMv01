final int MAX = 50
int i, m=0, k
print("Preencher o vetor: ")
for i=0 in range(0, MAX):
    print(" "+V[i])
    if V[9] < V[i]:
        m = m + 1
print("\nO elemento com o índice 9 é: "+ V[9])
print("\nA quantidade de números maiores do que o elemento "+V[9]+" no vetor é: "+m)
print("Digite um número inteiro k: ")
k = int(input())
for i=0 in range(0, MAX):
    print("k ocorreu na posição "+ V[k] +" do vetor")
    }else{
    print("\nk não foi encontrado no vetor")