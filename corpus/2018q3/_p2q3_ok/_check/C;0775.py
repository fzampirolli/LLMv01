int a=27
GeraMatriz(A,a,a)
imprimeMatriz(A,a,a)
matrizTransposta(A,a,a)
maiorElemento(A,a,a)
def GeraMatriz(int Mat[][], int L, int C):
    for i=0 in range(0, L):
        for j=0 in range(0, C):
def imprimeMatriz(int M[][], int l, int c):
    for i=0 in range(0, l):
        for j=0 in range(0, c):
            print(M[i][j]+" ")
        print()
def matrizTransposta(int M[][], int l, int c):
    for i=0 in range(0, l):
        for j=0 in range(0, c):
    return Mat[l][c]
def maiorElemento(int M[][], int l, int c):
    int maior=0
    for i=0 in range(0, l):
        maior=0
        for j=0 in range(0, c):
            if M[i][j]>maior:
    return maior