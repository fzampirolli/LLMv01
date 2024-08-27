int x, y
print("Digite o numero de linhas:")
x = int(input())
print("Digite o numero de colunas:")
y = int(input())
int A[][]
if x%2==0:
    if y%2==0:
        LerMatriz(A, x, y)
    else:
        print("Digite um numero par.")
def LerMatriz(int Mat[][],int x, int y):
    for i=0 in range(0, x):
        for j=0 in range(0, y):
            print(" ")
            print("   " + Mat[i][j])
        print(" ")
def ImprimirMatriz(int Mat[][],int x, int y):
    for i=0 in range(0, x):
        for j=0 in range(0, y):
            print("   " + Mat[i][j])
        print(" ")