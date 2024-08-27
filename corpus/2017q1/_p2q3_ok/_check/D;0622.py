int A[][], B[][]
print("Digite um numero par de linhas: ")
int L = int(input())
print("Digite um numero par de colunas: ")
int C = int(input())
Ler(A, L, C)
Imprimir(A, L, C)
def Ler(int Mat[][], int L, int C):
    for i=0 in range(0, L):
        for j=0 in range(0, C):
def Imprimir(int M[][], int L, int C):
    int n=0
    while n<L:
        for j=0 in range(0, C):
            for i=0 in range(0, L):