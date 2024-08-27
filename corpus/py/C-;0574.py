Scanner scan = new Scanner (System.in)
print ("Digite quantas linhas tem a matriz A:")
int L = int(input())
print ("Digite quantas colunas tem a matriz A:")
int C = int(input())
LerMatrizA (A, L, C)
ImprimeMatrizA (A, L, C)
print ("Digite quantas linhas tem a matriz B:")
int K = int(input())
print ("Digite quantas colunas tem a matriz B:")
int M = int(input())
ImprimeMatrizB (B, K, M)
def LerMatrizA( int A[][], int L, int C ):
    Scanner scan = new Scanner (System.in)
    print ("Digite os valores da matriz:")
    for i=0 in range(0, L):
        for j=0 in range(0, C):
def ImprimeMatrizA(int A [][], int L, int C):
    Scanner scan = new Scanner (System.in)
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            print (A[i][j]+ " ")
        print(" ")
def ImprimeMatrizB(int B [][], int K, int M):
    Scanner scan = new Scanner (System.in)
    for i=0 in range(0, K):
        for j=0 in range(0, M):
            print (B[i][j]+ " ")
        print(" ")