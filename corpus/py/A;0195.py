Scanner scan = new Scanner (System.in)
final int MAX = 50
print("Preencher vetor: ")
for i=0 in range(0, MAX):
for i=0 in range(0, MAX):
    print(V[i])
    print(" ")
print(V[9])
int cont=0
for i=0 in range(0, MAX):
    if V[i]>V[9]:
        cont ++
print(cont +" numeros sao maiores que "+V[9])
print("Insira um numero inteiro: ")
int k
k = int(input())
int x= 0
for i=0 in range(0, MAX):
    x=i +1
    print(k +" ocorreu na posição "+x)
if x==0:
    print(k +" nao foi encontrado no vetor")