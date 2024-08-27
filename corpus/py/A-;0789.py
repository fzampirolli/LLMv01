int l=27,c=27
GeraMatriz(A,l,c)
imprimeMatriz(A,l,c)
matrizTransposta(A,l,c)
MenorElemento(A,l,c)
static void GeraMatriz (int Mat[][], int L, int C){
for i=0 in range(0, L):
    for j=0 in range(0, C):
static void imprimeMatriz (int Mat[][],int l,int c){
for i=0 in range(0, l):
    print()
    for j=0 in range(0, c):
        print(Mat[i][j]+ " ")
static void matrizTransposta (int Mat[][],int l, int c){
int i,j
for i=0 in range(0, l):
    for j=0 in range(0, c):
        if j>i:
static int MenorElemento (int Mat[][], int l, int c){
for i=0 in range(0, l):
    for j=0 in range(0, l):
        if i>j && Mat[i][j]<menor:
return menor