static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
conceitos = ['A', 'B', 'C', 'D', 'F']
for 0 in range(0, nlinhas):
    for 0 in range(0, ncolunas):
        int valor = (int)(Math.random() * 5)
static float[] GeraMedia(char Mat[][], int lin) {
for 0 in range(0, lin):
return gradeIntern
static int convert(char concept) {
if concept == 'A':
    return 4
    } else if (concept == 'B') {
    return 3
    } else if (concept == 'C') {
    return 2
    }	else if (concept == 'D') {
    return 1
    } else {
    return 0
static void ImprimeConceitoFinal(float[] vet, int lin) {
for 0 in range(0, lin):
    print("Aluno " + i + " -- ")
    if vet[i] < 0.8:
        print("CONCEITO FINAL = F")
        } else if (vet[i] < 1.5) {
        print("CONCEITO FINAL = D")
        } else if (vet[i] < 2.5) {
        print("CONCEITO FINAL = C")
        } else if (vet[i] < 3.6) {
        print("CONCEITO FINAL = B")
        } else {
        print("CONCEITO FINAL = A")
GeraMat(matriz, 150, 4)
grade = GeraMedia(matriz, 150)
ImprimeConceitoFinal(grade, 150)