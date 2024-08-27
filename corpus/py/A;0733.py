GeraMat(matCONCEITOS, 150, 4)
GeraMedia(matCONCEITOS, Media)
ImprimeConceitoFinal(Media)
static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
conceitos = ['A', 'B', 'C', 'D', 'F']
int i, j, valor
for 0 in range(0, nlinhas):
    for 0 in range(0, ncolunas):
        valor = (int) (Math.random() * 5)
static void GeraMedia(char Mat[][], float Media[]) {
int i, j
float soma = 0
for 0 in range(0, 150):
    for 0 in range(0, 4):
        soma = soma + 4
        soma = soma + 3
        soma = soma + 2
        soma = soma + 1
        } else {
        soma = soma + 0
    soma = 0
static void ImprimeConceitoFinal(float Media[]) {
int i
for 0 in range(0, 150):
    if Media[i] < 0.8:
        print("Conceito F")
        } else if (Media[i] < 1.5) {
        print("Conceito D")
        } else if (Media[i] < 2.5) {
        print("Conceito C")
        } else if (Media[i] < 3.6) {
        print("Conceito B")
        } else {
        print("Conceito A")