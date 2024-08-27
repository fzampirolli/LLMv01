
import java.util.Scanner;

public class P2Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[tam];
        int i;
        int matrizes;

        System.out.println("Informe o tamnaho do vetor: ");
        int tam = input.nextInt();

        for (i = 0; i < tam; i++) {
            System.out.println("Informe o elemento " + i + " do vetor:");
            vetor[i] = input.nextInt();
        }
        for (i = 0; i < tam; i++) {
            System.out.println("O elemento " + i + " do vetor é: " + vetor[i]);

        }
        matrizes = CriarMatriz(vetor[tam]);

        ImprimirMatriz(matrizes);

        CalcularMedia(matrizes);

    }

    public static int[][] CriarMatriz(int vetor[], int tam) {
        int i, j;
        int matriz[][] = new int[tam][tam];

        Scanner input = new Scanner(System.in);

        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                System.out.println("Informe o valor da linha " + i + " e da coluna " + j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;

    }

    public static int ImprimirMatriz(int matrizes[][], int tam) {
        int i, j;
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                System.out.println(matrizes[i][j]);

            }
        }
        return 0;
    }

    public static int CalcularMedia(int matrizes[][], int tam) {
        int i, j, media = 0, soma = 0;
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                if (matrizes[i][i] % 5 != 0) {
                    soma += matrizes[i][i];

                }
            }
            media = soma / tam;
        }
        return media;

    }
