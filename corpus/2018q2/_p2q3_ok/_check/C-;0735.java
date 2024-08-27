
import java.util.Scanner;
import java.util.Random;
public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        Random rand = new Random ();

        char matCONCEITOS[][] = new char[150][4];
        GeraMat(matCONCEITOS, 150, 2);

        double vetMEDIA[] = new double[150];
        for (int i = 0; i<150; i++) {
            vetMEDIA[i] = GeraMedia(matCONCEITOS, 150));
        }

    }
    static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
        char conceitos[] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i=0; i<nlinhas; i++) {
            for (j=0; j<ncolunas; j++) {
                valor = (int)(Math.random()*5);
                Mat[i][j] = conceitos[valor];
            }
        }
    }
    public static double[] GeraMedia(char matriz[][], float elementos) {
        double s1, s2, s3, s4;
        double Vet[] = new double [150];
        for(int i=1; i<elementos; i++) {
                if(matriz[i][0] == 'A' ) {
                    s1 = 4*0.32;
                } else if (matriz[i][0] == 'B' ) {
                    s1 = 3*0.32;
                } else if (matriz[i][0] == 'C' ) {
                    s1 = 2*0.32;
                } else if (matriz[i][0] == 'D' ) {
                    s1 = 1*0.32;
                } else {
                    s1 = 0;
                }
                if(matriz[i][1] == 'A' ) {
                    s2 = 4*0.1;
                } else if (matriz[i][1] == 'B' ) {
                    s2 = 3*0.1;
                } else if (matriz[i][1] == 'C' ) {
                    s2 = 2*0.1;
                } else if (matriz[i][1] == 'D' ) {
                    s2 = 1*0.1;
                } else {
                    s2 = 0;
                }
                if(matriz[i][2] == 'A' ) {
                    s3 = 4*0.15;
                } else if (matriz[i][2] == 'B' ) {
                    s3 = 3*0.15;
                } else if (matriz[i][2] == 'C' ) {
                    s3 = 2*0.15;
                } else if (matriz[i][2] == 'D' ) {
                    s3 = 1*0.15;
                } else {
                    s3 = 0;
                }
                if(matriz[i][3] == 'A' ) {
                    s4 = 4*0.43;
                } else if (matriz[i][3] == 'B' ) {
                    s4 = 3*0.43;
                } else if (matriz[i][3] == 'C' ) {
                    s4 = 2*0.43;
                } else if (matriz[i][3] == 'D' ) {
                    s4 = 1*0.43;
                } else {
                    s4 = 0;
                }
        Vet[i] = s1+s2+s3+s4;
        }  

        return(Vet);
    }

}
