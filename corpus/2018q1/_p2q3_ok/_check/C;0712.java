
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor tam: ");
        int n = entrada.nextInt();

        int[] tam = new int[n];

        System.out.println("Digite os " + n + " elementos da matriz tam em ordem decrescente.");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento da matriz tam: ");
            tam[i] = entrada.nextInt();
        }

        System.out.print("Vetor tam: ");
        for (int i = 0; i < tam.length; i++) {
            System.out.print(tam[i] + " ");
        }
        System.out.println();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor da posição " + i + j + " da matriz: ");
                matriz[i][j] = entrada.nextInt();

                if (i == j){
                    matriz[i][j] = tam[i];
                }
            }
        }

        int qtdnaomultiplos = 0;
        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] % 5 != 0) {
                    soma += matriz[i][j];
                    qtdnaomultiplos++;
                }
            }
        }

        double media = soma / qtdnaomultiplos;

        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("A média é: " + media);

    }
}