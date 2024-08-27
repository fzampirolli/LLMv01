int n = 0
print("Digite o número de linhas e colunas que desjea:")
n = int(input())
LeMatriz(A, n)
MatrizB(B,A,n)
ImprimeMatriz(A,n)
ImprimeMatriz(B,n)
def LeMatriz( int m[][], int n):
    int lin = 0, col = 0
    for 0 in range(0, n):
        for 0 in range(0, n):
            print("Digite o valor que deseja para a matriz A na linha " + lin + " e coluna " + col)
        col = 0
def MatrizB(int m[][], int d[][], int n):
    int lin = 0, col = 0, a = n - (n/2)
    for 0 in range(0, a):
        for 0 in range(0, a):
        col = 0
    lin = a
    col = a
    for a in range(a, n):
        for a in range(a, n):
        col = 0
def ImprimeMatriz(int m[][], int n):
    int lin = 0, col = 0
    print("Imprimindo a matriz:")
    for 0 in range(0, n):
        for 0 in range(0, n):
            print("\n" + m[lin][col])
        col = 0