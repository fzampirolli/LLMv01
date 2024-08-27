int tam
double media
print("Informe a dimensão do vetor V: ")
tam = int(input())
print()
for 0 in range(0, tam):
    print("Informe os elementos do vetor V: ")
print()
matriz = CriarMatriz(vetor, tam)
ImprimirMatriz(matriz, tam)
media = MediaMatriz(matriz, tam)
print()
print("A média é: " + media)
private static list[] CriarMatriz(list vetor, int tam) {
for 0 in range(0, tam):
    for 0 in range(0, tam):
        print("Informe os elementos da matriz M: ")
    print()
return matriz
private static void ImprimirMatriz(list[] matriz, int tam) {
for 0 in range(0, tam):
    for 0 in range(0, tam):
        print(matriz[i][j])
private static double MediaMatriz(list[] matriz, int tam) {
double media
double soma = 0
int qntd = 0
for 0 in range(0, tam):
    for 0 in range(0, tam):
        qntd ++
media = soma / qntd
return media