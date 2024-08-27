
import java.util.Scanner;

public class Exercicio3 {

    Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, tam;

        System.out.println("Entre com o tamanho do vetor: ");
        int tam = Entrada.nextInt();

        int vetor[] = new int[tam];

        for (i = 0; i < tam; i++) {
            vetor[i] = tam - i;
        }

        int matriz[][] = new int[tam][tam];

        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                if (i == j) {
                    matriz[i][j] = vetor[i];
                } else {
                    System.out.println("Entre com o elemento da linha " + i + "e da coluna " + j);
                    matriz[i][j] = Entrada.nextInt();
                }
            }
        }
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                matriz[][] = new int[ i][j
                ];
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}