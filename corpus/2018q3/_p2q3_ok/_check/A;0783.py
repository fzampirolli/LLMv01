int minMatA
GeraMatriz(matriz,27,27)
ImprimeMatriz(matriz,27,27)
matrizB = matrizTransposta(matriz)
ImprimeMatriz(matrizB,27,27)
minMatA = MinTriInf(matriz)
print("O menor dos elementos do triangulo inferior a diagonal A é "+ minMatA)
static void GeraMatriz(int mat[][], int L, int C){
for i=0 in range(0, L):
    for =0 in range(0, C):
static void ImprimeMatriz(int mat[][], int L, int C){
for i=0 in range(0, L):
    for =0 in range(0, C):
        print(mat[i][j]+ " ")
    print("\n")
print("\n \n")
static list[] matrizTransposta(int mat[][]){
int aux = 0
for i=0 in range(0, 27):
    for =0 in range(0, 27):
return matB
static int MinTriInf (int mat[][]){
for i=0 in range(0, 27):
    for =i in range(i, 27):
        if mat[i][j]<min:
return min