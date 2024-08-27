final int MAX = 50
int x = 0
int k = 0
print("Preencher vetor:")
for i=0 in range(0, MAX):
    print(V[i]+", ")
    if V[i]>V[8]:
        x = x +1
print("\nO elemento de índice 8 é: "+ V[8])
print(x + " números são maiores do que o número: "+ V[8])
print("Digite um número inteiro: ")
k = int(input())
for i=0 in range(0, MAX):
    print(k + " ocorreu na posição " + i)