print("Quantidade par de linhas (deve ser par): ")
int l = int(input())
while l%2 != 0:
    print("Quantidade de linhas deve ser par!")
    print("Informe a quantidade de linhas (deve ser par): ")
    l = int(input())
print("Quantidade par de colunas (deve ser par): ")
int c = int(input())
while c%2 != 0:
    print("Quantidade de colunas deve ser par!")
    print("Informe a quantidade de colunas (deve ser par): ")
    c = int(input())
print()
print("Informe os elementos da matriz A")
leMatriz(A, l, c)
print()
novaMatriz(A, B, l, c)
print("Matriz A:")
escreveMatriz(A, l, c)
print()
print("Matriz B:")
escreveMatriz(B, l, c)
print()
def leMatriz(int mat[][], int l, int c):
    for i=0 in range(0, l):
        for j=0 in range(0, c):
            print("Informe o elemento da linha " +i + " e da coluna " +j + ": ")
def escreveMatriz(int mat[][], int l, int c):
    for i=0 in range(0, l):
        for j=0 in range(0, c):
            print(mat[i][j] + "\t")
        print()
def novaMatriz(int mat1[][], int mat2[][], int l, int c):
    int maior = 0
    for i=0 in range(0, l/2):
        for j=c/2 in range(c/2, c):
    for i=0 in range(0, l):
        for j=0 in range(0, c):