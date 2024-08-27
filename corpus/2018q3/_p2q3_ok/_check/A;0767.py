static void GeraMatriz(int Mat[][], int L, int C) {
for 0 in range(0, L):
    for 0 in range(0, C):
static void imprimeMatriz(int Mat[][], int L, int C) {
for 0 in range(0, L):
    for 0 in range(0, C):
        print(Mat[i][j]+" ")
    print("\n")
static list[] matrizTransposta(int Mat[][], int L, int C) {
for 0 in range(0, L):
    for 0 in range(0, C):
        if i == j:
            } else if (j > i) {
            } else if (i > j) {
return aux
static float mediaTriangulo(int Mat[][], int L, int C) {
float media = 0, aux = 0
for 0 in range(0, L):
    for 0 in range(0, C):
        if j > i:
            aux ++
media = media / aux
return media
int L = 21, C = 21
GeraMatriz(A, L, C)
imprimeMatriz(A, L, C)
B = matrizTransposta(A, L, C)
mediaTriangulo(A, L, C)