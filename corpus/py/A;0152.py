final int MAX = 50
print("Preencher vetor:")
for i=0 in range(0, MAX):
print("")
print("Os elementos do vetor são:")
for i=0 in range(0, MAX):
    print(V[i]+" ")
print("")
print("")
int cont=0
for i=0 in range(0, MAX):
    if V[i]>V[11]:
        cont=cont +1
print("Elemento de índice 11: "+V[11])
print("Número de elementos maiores que ele: "+cont)
print("")
int k,num=0
print("Digite um número para buscar sua existência no vetor.")
k = int(input())
print("")
for i=0 in range(0, MAX):
    print("O número "+k +" ocorreu no índice "+i)
    num=num +1
if num==0:
    print("O número "+k +" não foi encontrado no vetor.")