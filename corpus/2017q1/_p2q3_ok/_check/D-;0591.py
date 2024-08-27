int l,c,lt=0,ct=0
print("Digite o número de linhas da matriz :")
l=int(input())
if l%2!=0:
    while l%2!=0:
        print("Digite apenas números pares")
        print("Digite o número de linhas da matriz :")
        l=int(input())
print("Digite o número de colunas da matriz :")
c=int(input())
if c%2!=0:
    while c%2!=0:
        print("Digite apenas números pares")
        print("Digite o número de colunas da matriz :")
        c=int(input())
LerMatriz(A,l,c)
for il=0 in range(0, l):
    for ic=0 in range(0, c):
        print("Digite o valor do quadrante da linha "+(il +1)+" e coluna "+(ic +1))
def LerMatriz(int Vet1[][],int l, int c):
    int ll=l, cc=c
    for il=0 in range(0, l):
        for ic=0 in range(0, c):
            print("Digite o valor do quadrante da linha "+(il +1)+" e coluna "+(ic +1))