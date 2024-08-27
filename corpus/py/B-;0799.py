int A[][],i,j,B[][]
for i=0 in range(0, 21):
    for j=0 in range(0, 21):
ImprimeMatriz(A)
int c = Menor_Elemento(A)
def ImprimeMatriz(int A[][]):
    for i=0 in range(0, 21):
        print()
        for j=0 in range(0, 21):
            print(A[i][j]+" ")
def Menor_Elemento(int A[][]):
    int m=0,i,j
    for i=0 in range(0, 21):
        for j=0 in range(0, 21):
            if i>j:
                if A[i][j]>m:
    return m