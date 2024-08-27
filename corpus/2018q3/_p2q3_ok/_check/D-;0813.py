def GeraMatriz(int Mat[][],int L,int C):
    for i=0 in range(0, L):
        for j=0 in range(0, C):
def Imprime_MatrizA(int Mat[][]):
    for l=0 in range(0, Mat.length):
        for c=0 in range(0, Mat.length):
            print(Mat[l][c]+" ")
        print()
def matriz_TranspostaA(int Mat[][], int MatB[][]):
    for i=0 in range(0, Mat.length):
        for j=0 in range(0, Mat.length):
            if i==j:
                } else {
        print()
def media(int MatA[][],int media):
    int n=0
    for i=0 in range(0, MatA.length):
        for j=0 in range(0, MatA.length):
            if i==j-1:
                n=n +1
    return media
int L=21,C=21
int media = 0
print("Matriz A")
Imprime_MatrizA(MatA)
print("Matriz transposta de A")
matriz_TranspostaA(MatA,MatB)
print("Média")
media(MatA,media)