
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = 0;
        int tam;

        System.out.println("Insira o tamanho do vetor desejado: ");
        tam = entrada.nextInt();

        int v[] = new int[tam];
        int m[][] = new int[tam][tam];

        while (n < tam) {
            System.out.println("Insira um elemeneto do vetor: ");
            v[n] = entrada.nextInt();
            n++;

        }

        m[][] = CriarMatriz(v[]);

    }

    public static void CriarMatriz(int vetor[]) {
        Scanner entrada = new Scanner(System.in);
        int i = 0, j = 0, p = 0, media;
        int tam;
        tam = vetor[].length;

        int imprimeM[][] = new int[tam][tam];
        int m[][] = new int[tam][tam];

        if (i != j) {
            for (i = 0; i < tam; i++) {
                for (j = 0; j < tam; j++) {
                    System.out.println("Insira um elemento da matriz: ");
                    m[i][j] = entrada.nextInt();

                }
            }
        } else {
            m[i][j] = vetor[i];
        }

        imprimeM[tam][tam] = ImprimirMatriz(m[][]);
        media = MediaMatriz(m[][]);

    }

    public static int ImprimirMatriz(int m[][]) {
        int tam, i, j;
        tam = m[][].length;
        System.out.println("A matriz é:");
        for (int i = 0; i < tam;i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println(m[i][j] + " ");
            }
        }
    }

    public static void MediaMatriz(int m[][]) {
        int i, j, tam, soma = 0, d = 0;
        float media;
        tam = m[][].length;
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                if (m[i][j] % 5 == 0) {
                    soma = soma + m[i][j];
                    d++;
                }
            }
            media = soma / d;

            System.out.println("A média é: " + media);

        }

    }

}
