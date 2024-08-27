
import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, j, n, preta = 0, branca = 0, r;

        n = scan.nextInt();

        int[][] a = new int[n][n];

        for (i = 0; i < n; i++) {
            System.out.printf("\n");
            for (j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
                if ((i + j) % 2 == 0) {
                    preta = preta + a[i][j];
                } else {
                    branca = branca + a[i][j];
                }
            }
        }
        if (preta > branca) {
            r = 0;
        } else if (preta < branca) {
            r = 1;
        } else {
            r = 2;
        }

        System.out.printf("\n" + preta + " " + branca + " " + r + "\n");

    }
}
