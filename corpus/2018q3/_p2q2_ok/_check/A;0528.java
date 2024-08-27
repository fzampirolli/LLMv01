
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n, i, j, r, gb = 0, gp = 0;
        n = scan.nextInt();
        int A[][] = new int [n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i%2 == 0) && (j%2 == 0)) {
                    gb += A[i][j];
                } else if ((i%2 == 1) && (j%2 == 1)) {
                    gb += A[i][j];
                } else {
                    gp += A[i][j];
                }
            }
        }

        if (gb > gp) {
            r = 0;
        } else if (gb < gp) {
            r = 1;
        } else {
            r = 2;
        }

        System.out.print(gb+" "+gp+" "+ r);
    }

}
