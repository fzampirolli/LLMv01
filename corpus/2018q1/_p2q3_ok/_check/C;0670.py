static final 
int tam,k = 20,i
print("Digite o tamanho do vetor")
tam = int(input())
for i=0 in range(0, tam):
    print("Digite o valor da posição"+i)
CriarMatriz(vetor,tam)
ImprimirMatriz(matriz,tam)
def CriarMatriz(int v[], int tam):
    int i,j
    for i=0 in range(0, tam):
        for j=0 in range(0, tam):
            if i==j:
            else:
                print("Digite o valor da linha "+i +" e coluna " +j)
    return matriz[tam][tam]
def ImprimirMatriz(int m[][], int tam):
    int i,j
    for i=0 in range(0, tam):
        for j=0 in range(0, tam):
            print("Digite o valor da matriz"+m[i][j])