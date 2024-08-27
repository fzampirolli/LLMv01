
import java.util.*;

public class ex2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int N = reader.nextInt();
        int[][] A = new int[N][N];
        int black = 0;
        int white = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = reader.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (i % 2 == 0) {

                    for (int k = 0; k < N; k = k + 2) {
                        white += A[i][k];
                        black += A[i][k + 1];
                    }
                }

                else if (i % 2 != 0) {

                    for (int k = 0; k < N; k = k + 2) {
                        black += A[i][k];
                        white += A[i][k + 1];
                    }
                }

            }
        }
        int r = 0;
        if (black > white) {
            r = 1;

        } else if (white > black) {
            r = 0;
        }
        else if (white == black) {
            r =2;
        }
        System.out.print(white);
        System.out.print(" ");
        System.out.print(black);
        System.out.print(" ");
        System.out.print(r);

    }
}
