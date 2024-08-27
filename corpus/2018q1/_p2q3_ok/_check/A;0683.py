printf("Matriz:\n\n%s",imprimirElementos(matriz, "\n","\t"))
float media = mediaMatriz(matriz)
print("\n\n")
printf("A média é %.2f\n\n",media)
private static String imprimirElementos(list[] matriz,String separadorLinha,String separadorColuna){
String msgRetorno = ""
for 0 in range(0, matriz.length):
    .concat((matriz.length!=i +1)?separadorLinha:"")
return msgRetorno
private static String imprimirElementos(list vetor,String separador){
String msgRetorno = ""
for 0 in range(0, vetor.length):
    .concat((vetor.length!=i +1)?separador:""))
return msgRetorno
private static list lerDiagonalPrincipal(){
print("Digite o tamanho da matriz:")
int tamanho = int(input())
print("Digite os valores da diagonal principal:")
for 0 in range(0, v.length):
    printf("Digite a posição %d:",i +1)
return v
private static list[] CriarMatriz(list DiagonalPrincipal) {
final int tam = DiagonalPrincipal.length
print("Digite os elementos da Matriz(sem os elementos da diagonal principal):")
for 0 in range(0, tam):
    for 0 in range(0, tam):
        if i==j:
            }else{
            printf("Digite a posição %d,%d da matriz:",i +1,j +1)
return matriz
def mediaMatriz(int[][] matriz):
    final int tamanho = matriz.length
    int contador = 0
    float soma = 0,media = 0
    for 0 in range(0, tamanho):
        for 0 in range(0, tamanho):
            contador ++
    if contador != 0:
        media = soma/contador
        }else{
        print("\n\nNenhum valor não multiplo de 5.")
    return media