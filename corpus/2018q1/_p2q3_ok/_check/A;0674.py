int tam
print("Digite o tamanho do vetor: ")
tam = int(input())
for i=0 in range(0, tam):
    print("digite um valor: ")
int matrizRec=criarMatriz(v,tam)
ImprimirMatriz(matrizRec[][],tam)
print(matriz[i][j])
mediaMatriz(matrizRec[][],tam)
print("a media e :"+ mediaimpares)
def criarMatriz(int vetor[],int tamanho):
    for i=0 in range(0, tamanho):
        for j=0 in range(0, tamanho):
            if i==j:
            print("digite um valor: ")
    return matriz[tamanho][tamanho]
def ImprimirMatriz(int matriz[][],int tama):
    for i=0 in range(0, tama):
        for j=0 in range(0, tama):
            print(matriz[i][j])
    return matriz[tama][tama]
def mediaMatriz(int matriz[][],int tamanho):
    int somaimpar=0,mediaimpares,qimpar=0
    for i=0 in range(0, tamanho):
        for j=0 in range(0, tamanho):
            qimpar ++
    mediaimpares=somaimpar/qimpar
    return mediaimpares