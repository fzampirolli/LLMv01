int n,k,i
print("Insira o tamanho do vetor: \n")
n=int(input())
for i=0 in range(0, n):
    print("Insira o "+(i +1)+"º Valor do vetor. \n")
comparaVetor(v,n,k)
def comparaVetor(int v[],int n, int k):
    int i
    for i=0 in range(0, n):
        if v[i]>20: