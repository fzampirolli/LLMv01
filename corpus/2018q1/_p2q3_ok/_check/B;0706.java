
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tam = input.nextInt();
        int vetor[] = new int[tam];
        int m[][] = null, media = 0;

        Diagonal(m, vetor);
        Imprimir(m, vetor);
        Media(m, media);
    }

    public static void Diagonal(int m[][], int vetor[]) {
        Scanner input = new Scanner(System.in);
        int LIN = 0, COL = 0, l, c;

        System.out.println("Digite o número de linhas: ");
        LIN = input.nextInt();

        System.out.println("Digite o número de colunas: ");
        COL = input.nextInt();

        for (l = 0; l < LIN; l++) {
            for (c = 0; c < COL; c++) {
                System.out.println("Digite o valor da linha " + (l) + " e da coluna " + (c));
                m[l][c] = input.nextInt();
            }
        }

        int tam = input.nextInt();
        for (l = 0; l < LIN; l++) {
            for (c = 0; c < COL; c++) {
                if (l == c) { 
                    m[l][c] = vetor[tam];
                }
            }
        }

    }

    public static void Imprimir(int m[][], int vetor[]) {
        Scanner input = new Scanner(System.in);
        int l = 0, c = 0;
        int tam = input.nextInt();
        m[l][c] = vetor[tam];
        System.out.println(m[l][c]);

    }

    public static float Media(int m[][], int media) {
        Scanner input = new Scanner(System.in);
        int LIN = 0, COL = 0, l, c, soma = 0;
        for (l = 0; l < LIN; l++) {
            for (c = 0; c < COL; c++) {
                m[l][c] = input.nextInt();

            }
            if (soma % 5 == 0) {
                media = soma / (m.length);
            }
        }
        return media;
    }
}
