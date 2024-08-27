
import java.util.Scanner;

public class Questao3 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String x;
        String matConceitos[][] = new String[140][4];

        matConceitos[1][0] = "PrimeiraProva";
        matConceitos[1][0] = "Atividades";
        matConceitos[1][0] = "projeto";
        matConceitos[1][0] = "SegundaProva";

        x = GeraMat(char conceitos[]);
        for (int i = 0; i < 140; i++) {
            for (int j = 0; j < 4; j++) {
                matConceitos[i][j] = x;
            }
        }
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

}
