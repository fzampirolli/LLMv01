static void GeraMatriz(int Mat[][], int L, int C){
for 0 in range(0, L):
    for 0 in range(0, C):
static void imprimeMatriz(int m[][], int l, int c){
for 0 in range(0, l):
    for 0 in range(0, c):
        printf(m[i][j]+" ")
    printf("\n")
static list[] matrizTranposta(int m[][], int l, int c){
for 0 in range(0, l):
    for 0 in range(0, c):
        if i>j:
            }else{
return aux
static int media(int m[][],int l, int c){
int cont=0,soma=0
for 0 in range(0, l):
    for 0 in range(0, c):
        if i>j:
            cont ++
if cont!=0:
    return (int)(soma/cont)
    }else{
    return 0
GeraMatriz(m,23,23)
imprimeMatriz(m,23,23)
printf("\n")
imprimeMatriz( matrizTranposta(m,23,23),23,23)
printf(media(m,23,23)+"\n")