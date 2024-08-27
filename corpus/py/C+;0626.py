int i, j, L, C
print("Informe o número de linhas (par): ")
L=int(input())
print("Informe o número de colunas: ")
C=int(input())
LerMatriz(A, L, C)
print("a) Matriz(A)")
ImprimeQualquer(A, L, C)
LerQuadrante(A, L, C)
print("b) Matriz(B)")
ImprimeQualquer(B, L, C)
def LerMatriz(int mat[][], int LIN, int COL):
    int i, j
    for i=0 in range(0, LIN):
        for j=0 in range(0, COL):
            print("Insira o elemento ["+(i +1)+"]["+(j +1)+"] da matriz: ")
def LerQuadrante(int mat[][], int LIN, int COL):
    int i, j, maior=0
    for i=0 in range(0, LIN):
        for j=0 in range(0, COL):
            if mat[i][j]>maior:
        print("")
def ImprimeQualquer(int mat[][], int LIN, int COL):
    int i, j
    for i=0 in range(0, LIN):
        for j=0 in range(0, COL):
            print(" "+mat[i][j])
        print()