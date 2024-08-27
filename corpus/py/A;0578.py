int L = 1
do {
print("Digite um inteiro par para o número de linhas: ")
L = int(input())
} while (L%2 != 0)
int C = 1
do {
print("Digite um inteiro par para o número de colunas: ")
C = int(input())
} while (C%2 != 0)
LerMatriz(A, L, C)
CriarMatriz(A, B, L, C)
print("\n Matriz A: ")
ImprimeMatriz(A, L, C)
print("\n Matriz B: ")
ImprimeMatriz(B, L, C)
def LerMatriz(int[][] A, int l, int c):
    for 0 in range(0, l):
        for 0 in range(0, c):
            print("Digite o elemento A["+i +"]["+j +"]: ")
def CriarMatriz(int[][] A, int[][] B, int l, int c):
    for 0 in range(0, l/2):
        for 0 in range(0, c/2):
            if maior < A[i][j]:
    for 0 in range(0, l/2):
        for 0 in range(0, c/2):
def ImprimeMatriz(int[][] M, int l, int c):
    for 0 in range(0, l):
        for 0 in range(0, c):
            print(" "+M[i][j])
        print("\n")