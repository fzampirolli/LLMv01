static void criarMatriz(int vetor[],int tam,int i,int l, int c){
i=0
for l=0 in range(0, tam):
    for c=0 in range(0, tam):
        if l==c:
            i ++
            }else{
            print("Informe o valor da célula" + (l +1) + "x" + (c +1) + "da matriz.")
static void imprimirMatriz(int matriz[][],int l,int c,int tam){
print("Matriz["+tam +"]["+tam +"]")
for l=0 in range(0, tam):
    print("")
    for c=0 in range(0, tam):
        print(matriz[l][c] + " ")
int tam,i,k=0,l=0,c=0
print("Qual o tamanho do vetor ?")
tam = int(input())
for i=0 in range(0, tam):
    k ++
criarMatriz(vetor,tam,i,l,c)