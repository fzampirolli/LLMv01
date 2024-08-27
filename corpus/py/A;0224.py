Scanner entrada = new Scanner (System.in)
int n
print("Digite um numero positivo ímpar")
n = int(input())
for ind=0 in range(0, n):
    print("Digite o elemento"+ind)
int aux=0, aux1=n-1
for ind=0 in range(0, n/2):
    if V[ind]>V[aux1]:
    aux1=aux1-2
for ind=0 in range(0, n):
    print(V[ind])