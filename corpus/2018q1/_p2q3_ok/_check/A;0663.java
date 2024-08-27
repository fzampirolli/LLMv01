
import java.util.Scanner;

public class Final {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Digite o tamnho do seu vetor:");
        n = input.nextInt();

        int[] a = new int[n];
        System.out.println("Digite os elementos de seu vetor: ");
        for (int i=0; i<n ; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Preencha a matriz: ");
        int[][] matriz = diagonal(a);
        double mediaf = media(matriz);

        System.out.println("a media é: "+(mediaf));
    }

    public static int[][] diagonal(int[] c) {
        Scanner input = new Scanner(System.in);
        int[][] b = new int[c.length][c.length];
        for (int d = 0; d < b.length; d++) {
            for (int f = 0; f < b.length-1; f++) {
                if (d == f) {
                    b[d][f] = c[d];
                }
                b[d][f] = input.nextInt();
            }
        }

        return b;

    }

    public static void imprimir(int[][] d) {
        System.out.println("Os valores da matriz são: ");
        for (int i = 0; i < d.length; i++) {
            System.out.println("");
            for (int j = 0; j < d.length; j++) {
                System.out.print((d[i][j]) + " ");
            }
        }
    }

    public static double media(int[][] d) {
        double media, soma = 0, h = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {

                if ((d[i][j] % 5) == 0) {
                    soma = soma + d[i][j];
                    h = h + 1;

                }
            }
            h =h-1;
        }
        media = soma / h;
        return media;
    }
}
