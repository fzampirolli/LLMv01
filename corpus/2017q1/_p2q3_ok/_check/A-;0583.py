int C, L
Scanner scan = new Scanner (System.in)
print("Digite quantas linhas sua matriz terá (número par):")
L = int(input())
print("\nDigite quantas colunas sua matriz terá (número par):")
C = int(input())
LeituraMatriz(A,L,C)
CriarMatriz (A,B,L,C)
imprimirMatriz (A,L,C)
imprimirMatriz (B,L,C)
def LeituraMatriz(int M1[][], int L, int C):
    int i, j
    Scanner scan = new Scanner (System.in)
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            print("\nDigite um número:")
def CriarMatriz(int M2[][],int M3[][], int L,int C):
    int i, j, k=0
    for i=0 in range(0, L/2):
        for j=0 in range(0, C/2):
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            if i<=L/2 && j<=C/2:
                } else{
def imprimirMatriz(int M4 [][],int L, int C):
    int i,j
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            print(M4[i][j])