int v[], n, k, i, p
k=40
print("Insira o tamanho do vetor")
n = int(input())
for i=0 in range(0, n):
    print("Insira um número para o vetor: ")
p=comparaVetor (v, n, k)
if p==1:
    print("Existe número igual a 40 neste vetor.")
else:
    print("Não existe número igual a 40 neste vetor.")
def comparaVetor(int v[], int n, int k):
    int i,j
    j=0
    for i=0 in range(0, n):
        j=1
    return j