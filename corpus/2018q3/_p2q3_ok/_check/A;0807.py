static void GeraMatriz (int Mat[][], int L, int C){
for i=0 in range(0, L):
    for j=0 in range(0, C):
static void imprimeMatriz (int A[][]){
int n = A.length
for i=0 in range(0, n):
    for j=0 in range(0, n):
        print(A[i][j]+"  ")
    print("\n")
print("\n")
static list[] matriztransposta (int A[][]){
int n = A.length
int aux=1
int ajuda
for i=0 in range(0, n):
    for j=aux in range(aux, n):
    aux ++
return A
static int maiorElementoT (int A[][]){
int n = A.length
int aux=1
int maiorElemento=0
for i=0 in range(0, n):
    for j=aux in range(aux, n):
        if A[j][i]>maiorElemento:
    aux ++
return maiorElemento
int n
int maiorElemento
print("Digite o valor de n")
n =int(input())
print("\n")
GeraMatriz(A,n,n)
print("Matriz A:")
imprimeMatriz (A)
B = matriztransposta(A)
print("Matriz B:")
imprimeMatriz (B)
maiorElemento = maiorElementoT(A)
print("Maior Elemento do triangulo em A")
print(maiorElemento)