int t
int i=0
print("Qual o tamanho do seu vetor?")
t = int(input())
while i<t:
    print("Digite o próximo número do seu vetor: ")
    i ++
if comparaVetor(A,t,30:
    print("Existe número menor do que 30 neste vetor.")
else:
    print("Não existe número menor do que 30 neste vetor.")
def comparaVetor(int v[], int n, int k):
    int x=0
    bool maior = false
    while x<n:
        if v[x]<k:
            maior = true
        x ++
    return maior