int a =21
int b = 21
GeraMatriz(A,a,b)
imprimeMatriz(A)
print(menorelemento(A))
def GeraMatriz(int Mat[][], int L, int C):
    for i=0 in range(0, L):
        for j=0 in range(0, C):
def imprimeMatriz(int m[][]):
    for i=0 in range(0, 21):
        for j=0 in range(0, 21):
            print(m[i][j]+" ")
        print("")
def menorelemento(int mat[][]):
    int soma=0
    for i=0 in range(0, 21):
        for j=0 in range(0, 21):
            if i>j:
                if mat[i][j]<menor:
    return menor