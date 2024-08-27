GeraMat(matCONCEITOS, 150, 4)
GeraMedia(matCONCEITOS, medias)
ImprimeConceitoFinal(medias)
static void GeraMat(char Mat[][], int nlinhas, int ncolunas){
conceitos = ['A', 'B', 'C', 'D', 'F']
int i, j, valor
for i=0 in range(0, nlinhas):
    for j=0 in range(0, ncolunas):
        valor = (int)(Math.random()*5)
static void GeraMedia(char[][] mat, double[] medias){
double nota_p1, nota_atv, nota_proj, nota_p2
for i=0 in range(0, 150):
static double convertConceito(char conceito){
double conceitoNumerico = 0
if conceito=='A':
    conceitoNumerico=4
    } else if(conceito=='B'){
    conceitoNumerico=3
    } else if(conceito=='C'){
    conceitoNumerico=2
    } else if(conceito=='D'){
    conceitoNumerico=1
    } else if(conceito=='F'){
    conceitoNumerico=0
return conceitoNumerico
static void ImprimeConceitoFinal(double[] medias){
for i=0 in range(0, 150):
    if medias[i]<0.8:
        print("Aluno:" + i)
        print("Conceito Final: F")
        } else if (medias[i]<1.5){
        print("Aluno:" + i)
        print("Conceito Final: D")
        } else if (medias[i]<2.5){
        print("Aluno:" + i)
        print("Conceito Final: C")
        } else if (medias[i]<3.6){
        print("Aluno:" + i)
        print("Conceito Final: B")
        } else {
        print("Aluno:" + i)
        print("Conceito Final: A")