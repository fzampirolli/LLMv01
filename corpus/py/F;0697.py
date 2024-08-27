Scanner entrada=new Scanner (System.in)
int vetor[], tam,n,elemento, matriz[][]
print("Insira o tamanho do vetor")
tam=int(input())
for n=0 in range(0, tam):
    print("Insira o elemento do vetor: ")
    elemento=int(input())
CriarMatriz(vetor,tam)
int returncriar
returncriar=CriarMatriz(vetor,tam)
print(" "+returncriar +" ")
ImprimirMatriz(matriz,tam)
int returnimprimir
returnimprimir=ImprimirMatriz(matriz,tam)
print(" "+returnimprimir +" ")
MediaMatriz(matriz,tam)
int returnmedia
returnmedia=MediaMatriz(matriz,tam)
print("A média é "+returnmedia)
def CriarMatriz(int vetor[],int tam):
    Scanner entrada=new Scanner (System.in)
    int matriz[][],i,j,k
    for i=0 in range(0, tam):
        for j=0 in range(0, tam):
            print("Insira o elementos para sua matriz: ")
    return (matriz[i][j])
def ImprimirMatriz(int matriz[][],int tam):
    Scanner entrada=new Scanner (System.in)
    int i,j
    for i=0 in range(0, tam):
        for j=0 in range(0, tam):
def MediaMatriz(int matriz[][],int tam):
    Scanner entrada=new Scanner (System.in)
    int i,j,soma=0,media
    for i=0 in range(0, tam):
        for j=0 in range(0, tam):
    media=soma/tam
    return (media)