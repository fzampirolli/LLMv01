int nlinhas = 150
int ncolunas = 4
GeraMat(Mat, nlinhas, ncolunas)
GeraMedia (Vet, Mat, nlinhas, ncolunas)
ImprimeConceitoFinal (Vet, nlinhas)
static void GeraMat (char Mat[][], int nlinhas, int ncolunas) {
conceitos = ['A', 'B', 'C', 'D', 'F']
int i, j, valor
for 0 in range(0, nlinhas):
    for 0 in range(0, ncolunas):
        valor = (int) (Math.random() * 5)
static void GeraMedia (double Vet[], char Mat[][], int nlinhas, int ncolunas) {
int i, j
double c = 0
for 0 in range(0, nlinhas):
    for 0 in range(0, ncolunas):
        switch (Mat[i][j]) {
        case 'A':
        c = 4
        break
        case 'B':
        c = 3
        break
        case 'C':
        c = 2
        break
        case 'D':
        c = 1
        break
        case 'F':
        c = 0
        break
        default:
        break
static void ImprimeConceitoFinal (double Vet[], int nlinhas) {
int i
for 0 in range(0, nlinhas):
    if Vet[i] < 0.8:
        print("Conceito final = F")
    else:
        print("Conceito final = D")
    else:
        print("Conceito final = C")
    else:
        print("Conceito final = B")
    else:
        print("Conceito final = A")