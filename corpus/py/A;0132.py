Scanner entrada=new Scanner (System.in)
int n=135,k=20
bool resultado
for i=0 in range(0, n):
    print("Insira um valor para o vetor: ")
resultado= comparaVetor(vetor,n,k)
if resultado==true:
    print("Existe um número maior a 20 neste vetor.")
else:
    print("Não há um número maior que 20 nesse vetor.")
def comparaVetor(int v[], int n,int k):
    bool result=true
    int a=0
    for i=0 in range(0, n):
        if v[i]>k:
            result=true
            a ++
        else:
            result=false
    if a!=0:
        result=true