
public class Questao3 {

    public static void main(String[] args) {
        char Mat[][]=new char[150][5];
        double Matvet[]=new double[150];
        GeraMat(Mat,150,4);
        GeraMedia(Mat, 150, 4);
        ImprimeConceitoFinal(Mat, Matvet, 150, 4);
    }
    public static void GeraMat (char Mat[][], int nlinhas, int ncolunas){
        char conceitos [] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i=0; i<nlinhas;i++){
            for (j=0; j<ncolunas; j++){
                valor= (int)(Math.random()*5);
                Mat[i][j]=conceitos[valor];            }
        }
    }
    public static void GeraMedia (char Mat[][], int MatVet, int nlinhas, int ncolunas) {
        int i, j;
        for (i=0; i<nlinhas;i++){
            for (j=0; j<ncolunas; j++){
                if (Mat[i][j]=='A'){
                    Mat[i][j]=4;
                }
                if (Mat[i][j]=='B'){
                    Mat[i][j]=3;
                }
                if (Mat[i][j]=='C'){
                    Mat[i][j]=2;
                }
                if (Mat[i][j]=='D'){
                    Mat[i][j]=1;
                }
                if (Mat[i][j]=='F'){
                    Mat[i][j]=0;
                }
            }
        for (i=0; i<nlinhas;i++){

            Matvet[i]=(Mat[i][0]*0.38)+(Mat[i][0]*0.10)+(Mat[i][0]*0.15)+(Mat[i][0]*0.37);
    }

}
    public static void ImprimrConceitoFinal (char Mat[][], int nlinhas, int ncolunas)
}
