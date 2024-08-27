int alunos = 150, avaliacoes = 4
GeraMat(matConceitos, alunos, avaliacoes)
GeraMedia(matConceitos, alunos, avaliacoes, MEDIA)
ImprimeConceitoFinal(alunos,MEDIA)
static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
conceitos = ['F', 'D', 'C', 'B', 'A']
int i, j, valor
for 0 in range(0, nlinhas):
    for 0 in range(0, ncolunas):
        valor = (int)(Math.random()*5)
static void GeraMedia(char Mat[][], int nlinhas, int ncolunas, double MEDIA[]) {
for 0 in range(0, nlinhas):
    for 0 in range(0, ncolunas):
        else:
            else:
                else:
                    else:
for 0 in range(0, nlinhas):
static void ImprimeConceitoFinal(int ncolunas, double MEDIA[]) {
print("CONCEITOS")
for 0 in range(0, ncolunas):
    if MEDIA[j] < 0.8:
        print("\nAluno " + (j +1) + ": F")
    else:
        if MEDIA[j] < 1.5:
            print("\nAluno " + (j +1) + ": D")
        else:
            if MEDIA[j] < 2.5:
                print("\nAluno " + (j +1) + ": C")
            else:
                if MEDIA[j] < 3.6:
                    print("\nAluno " + (j +1) + ": B")
                else:
                    print("\nAluno " + (j +1) + ": A")