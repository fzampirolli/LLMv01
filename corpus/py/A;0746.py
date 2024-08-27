Scanner entrada= new Scanner (System.in)
GeraMat (matCONCEITOS, 150, 4)
for 0 in range(0, 150):
    for 0 in range(0, 4):
GeraMedia(matCONCEITOS1, 150,4, media)
ImprimeConceitoFinal (media)
def GeraMat(char Mat[][], int nlinhas , int ncolunas):
    conceitos = ['A', 'B', 'C', 'D', 'F']
    int i, j, valor
    for 0 in range(0, nlinhas):
        for j=0 in range(0, ncolunas):
            valor = (int)(Math.random()*5)
def GeraMedia(char Mat[][], int nlinhas ,int ncolunas, float media[]):
    for 0 in range(0, nlinhas):
        for 0 in range(0, ncolunas):
    for i=0 in range(0, nlinhas):
def ImprimeConceitoFinal(float media[]):
    for i=0 in range(0, 150):
        if media[i] <0.8:
            print ("Conceito final do aluno "+(i +1) +" é = F")
            } else if (media[i]<1.5){
            print ("Conceito final do aluno "+(i +1) +" é = D")
            } else if (media [i]<2.5){
            print ("Conceito final do aluno "+(i +1) +" é = C")
            } else if (media [i]< 3.6){
            print ("Conceito final do aluno "+(i +1) +" é = B")
        print ("Conceito final do aluno "+(i +1) +" é = A")