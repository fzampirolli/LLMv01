
public class Questao3 {

    public static void main(String[] args) {
        int nlinhas = 150;
        int ncolunas = 4;
        char Mat[][] = new char [nlinhas][ncolunas];
        GeraMat(Mat, nlinhas, ncolunas);
        double Vet[] = new double [nlinhas]; 
        GeraMedia (Vet, Mat, nlinhas, ncolunas);
        ImprimeConceitoFinal (Vet, nlinhas);
    }

    static void GeraMat (char Mat[][], int nlinhas, int ncolunas) {
        char conceitos[] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i = 0; i < nlinhas; i++){
            for (j = 0; j < ncolunas; j++) {
            valor = (int) (Math.random() * 5); 

            Mat[i][j] = conceitos[valor];
            }
        }
    }
    static void GeraMedia (double Vet[], char Mat[][], int nlinhas, int ncolunas) {
        int i, j;
        double c = 0;
        for (i = 0; i < nlinhas; i++) {
            for (j = 0; j < ncolunas; j++) {
                switch (Mat[i][j]) {
                    case 'A':
                        c = 4;
                        break;
                    case 'B':
                        c = 3;
                        break;
                    case 'C':
                        c = 2;
                        break;
                    case 'D':
                        c = 1;
                        break;
                    case 'F':
                        c = 0;
                        break;
                    default:
                        break;
                }
                Vet[i] = ((c * 34) + (c * 10) + (c * 15) + (c * 41)) /100;
            }
        }

    }
    static void ImprimeConceitoFinal (double Vet[], int nlinhas) {
        int i;
        for (i = 0; i < nlinhas; i++) {
            if (Vet[i] < 0.8) {
                System.out.println("Conceito final = F");
            }
            else if (Vet[i] < 1.5) {
                System.out.println("Conceito final = D");
            }
            else if (Vet[i] < 2.5) {
                System.out.println("Conceito final = C");
            }
            else if (Vet[i] < 3.6) {
                System.out.println("Conceito final = B");
            }
            else {
                System.out.println("Conceito final = A");
            }
        }
    }
}
