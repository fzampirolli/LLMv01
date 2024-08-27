static int L=0,C=0
print ("Insira as dimensões da matriz:")
L = int(input())
C = int(input())
LER(A,L,C)
IMPRIME(A,L,C)
NOVAMATRIZ(A,L,C)
IMPRIME(B,L,C)
def LER(int A[][], int L, int C):
    int i,j, maior=0
    print("Insira os elementos da matriz")
    for i=0 in range(0, L):
        for j=0 in range(0, C):
def NOVAMATRIZ(int A[][], int L, int C):
    int i,j, maior=0
    for i=0 in range(0, L/2):
        for j=0 in range(0, C/2):
    for i=L/2 in range(L/2, L):
        for j=C/2 in range(C/2, C):
    for i=0 in range(0, L/2):
        for j=C/2 in range(C/2, C):
    for i=L/2 in range(L/2, L):
        for j=0 in range(0, C/2):
def IMPRIME(int A[][], int L, int C):
    int i,j
    print("Elementos da matriz")
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            print("\n"+ A[i][j])