int cont=0, k, aux=0
final int MAX = 50
print("Preencher vetor: ")
for i=0 in range(0, MAX):
    print(V[i])
print("O elemento de indice 5 e: "+V[4])
for i=0 in range(0, MAX):
    if V[i]>V[4]:
        cont ++
print("Ha "+cont +" numeros maiores do que o elemento de indice 5")
print("Insira um numero para fazer uma busca: ")
k=int(input())
for i=0 in range(0, MAX):
    print("k ocorreu na posicao: "+i)