GeraMatriz(Mat, 27, 27)
ImprimeMatriz(Mat)
print("")
B = MatrizTransposta(Mat)
print("O menor elemento do triangulo inferior de A é: " + RetornaMenor(Mat))
static void GeraMatriz(list[] Mat, int l, int co) {
for 0 in range(0, l):
    for 0 in range(0, co):
static void ImprimeMatriz(int Mat[][]) {
for 0 in range(0, Mat.length):
    for 0 in range(0, Mat.length):
        print(Mat[i][j] + "\t")
    print()
static list[] MatrizTransposta(int Mat[][]) {
int aux
for 0 in range(0, Mat.length):
    for 0 in range(0, Mat.length):
        if i != j && i > j:
return Mat
static int RetornaMenor(int Mat[][]) {
int menor = 11
for 0 in range(0, Mat.length):
    for 0 in range(0, Mat.length):
        if i != j && i < j:
            if Mat[i][j] < menor:
return menor