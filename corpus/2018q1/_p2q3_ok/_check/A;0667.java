
import java.util.Scanner;

public class 3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tam;
        double media;

        System.out.print("Informe a dimensão do vetor V: ");
        tam = input.nextInt();
        System.out.println();

        int vetor[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe os elementos do vetor V: ");
            vetor[i] = input.nextInt();
        }

        System.out.println();
        int matriz[][] = new int[tam][tam];

        matriz = CriarMatriz(vetor, tam);

        ImprimirMatriz(matriz, tam);

        media = MediaMatriz(matriz, tam);
        System.out.println();
        System.out.println("A média é: " + media);
    }

    private static int[][] CriarMatriz(int[] vetor, int tam) {
        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("Informe os elementos da matriz M: ");
                matriz[i][j] = input.nextInt();
                matriz[i][i] = vetor[i];
            }
            System.out.println();
        }
        return matriz;
    }

    private static void ImprimirMatriz(int[][] matriz, int tam) {
        int matriz2[][] = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    private static double MediaMatriz(int[][] matriz, int tam) {
        double media;
        double soma = 0;
        int qntd = 0;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (matriz[i][j] % 2 == 0) {
                    soma = soma + matriz[i][j];
                    qntd++;
                }
            }
        }
        media = soma / qntd;
        return media;
    }
}
