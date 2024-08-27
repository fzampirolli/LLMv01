
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        char matCONCEITOS[][] = new char[150][4];
        float Media[] = new float[150];

        Scanner entrada = new Scanner(System.in);

        GeraMat(matCONCEITOS, 150, 4);

        GeraMedia(matCONCEITOS, Media);

        ImprimeConceitoFinal(Media);

    }

    static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
        char conceitos[] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i = 0; i < nlinhas; i++) {
            for (j = 0; j < ncolunas; j++) {
                valor = (int) (Math.random() * 5); 

                Mat[i][j] = conceitos[valor];
            }
        }
    }

    static void GeraMedia(char Mat[][], float Media[]) {
        int i, j;
        float soma = 0;
        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < 150; i++) {
            for (j = 0; j < 4; j++) {
                if (Mat[i][j] == 'A') {
                    soma = soma + 4;
                } else if (Mat[i][j] == 'B') {
                    soma = soma + 3;
                } else if (Mat[i][j] == 'C') {
                    soma = soma + 2;
                } else if (Mat[i][j] == 'D') {
                    soma = soma + 1;
                } else {
                    soma = soma + 0;
                }
            }
            Media[i] = soma / 4;
            soma = 0;
        }
    }

    static void ImprimeConceitoFinal(float Media[]) {
        int i;
        for (i = 0; i < 150; i++) {
            if (Media[i] < 0.8) {
                System.out.println("Conceito F");
            } else if (Media[i] < 1.5) {
                System.out.println("Conceito D");
            } else if (Media[i] < 2.5) {
                System.out.println("Conceito C");
            } else if (Media[i] < 3.6) {
                System.out.println("Conceito B");
            } else {
                System.out.println("Conceito A");
            }
        }
    }

}
