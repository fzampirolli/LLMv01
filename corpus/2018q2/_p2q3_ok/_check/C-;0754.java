
public class Questao3 {
    public static void main(String[] args) {
        char Mat[][] = new char [150][4];
        double V[] = new double [150];
        GeraMat(Mat, 150, 4);
        GeraMedia(V, 150, 4);
    }
    static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
          char conceitos[] = {'A', 'B', 'C', 'D', 'F'};
          int i, j, valor;
          for (i=0; i < nlinhas; i++) {
             for (j=0; j < ncolunas; j++) {
                 valor = (int) (Math.random()*5);
                 Mat[i][j] = conceitos[valor];
             } 
          }
    }
    static void GeraMedia(double V[], int nlinhas, int ncolunas) {
        int i, j;
        char Mat[][] = new char [150][4];
        double p1, ativ, proj, p2, total;
        for (i=0; i < nlinhas; i++) {
            for (j=0; j < ncolunas; j++) {
            if (Mat[i][j] == 'A') {
                p1 = 4*31/100;
                ativ = 4*10/100;
                proj = 4*15/100;
                p2 = 4*44/100;
                total = p1+ativ+proj+p2;
            }
            else {
                if (Mat[i][j] == 'B') {
                    p1 = 3*31/100;
                    ativ = 3*10/100;
                    proj = 3*15/100;
                    p2 = 3*44/100;
                    total = p1+ativ+proj+p2;
                }
                else {
                    if (Mat[i][j] == 'C') {
                        p1 = 2*31/100;
                        ativ = 2*10/100;
                        proj = 2*15/100;
                        p2 = 2*44/100;
                        total = p1+ativ+proj+p2;
                    }
                    else {
                        if (Mat[i][j] == 'D') {
                            p1 = 31/100;
                            ativ = 10/100;
                            proj = 15/100;
                            p2 = 44/100;
                            total = p1+ativ+proj+p2;
                        }
                        else {
                            total = 0;
                        }
                    }
                }
            }
            }
        }
    }
    static void ImprimeConceitoFinal(double V) {

    }
}
