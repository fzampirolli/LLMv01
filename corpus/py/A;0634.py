def leMatriz(int[][] A,int L,int C):
    for i=0 in range(0, L):
        for j=0 in range(0, C):
        print()
def CriaB(int[][] B, int[][] A, int L, int C):
    int MAX=0
    for i=L/2 in range(L/2, L):
        for j=C/2 in range(C/2, C):
            if A[i][j]>MAX:
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            if j>=C/2 && i>=L/2:
            else:
def imprimMat(int A[][]):
    int L,C
    L=A.length
    for i=0 in range(0, L):
        for j=0 in range(0, C):
            print("["+A[i][j]+"]")
        print()
print("L = ")
int L=int(input())
print("C = ")
int C=int(input())
leMatriz(A,L,C)
CriaB(B,A,L,C)
imprimMat(A)
print()
imprimMat(B)