
import java.util.Scanner;

public class RafaelaBragaBlessmann {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L, C, i, j;
        L = scan.nextInt();
        C = scan.nextInt();
        int A[][] = new int[L][C];
        int X[][] = Matriz(A);
        int B[][] = MatrizB(X);

        Imprimir(A);
        Imprimir(B);
    }

    public static int[][] Matriz(int A[][]) {
        Scanner scan = new Scanner(System.in);
        int i, j, n = 4;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        return A;
    }

    public static int[][] MatrizB(int A[][]) {
        Scanner scan = new Scanner(System.in);
        int i, j, n = 4;
        int B[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 2 || i == 3) {
                    if (j == 0 || j == 1) {
                        if (A[i][j] < A[i + 1][j]) {
                            if (A[i][j]< A[i][j+ 1]){
                        B[i][j] = A[i][j];
                                B[i + 1][j] = A[i][j];
                                B[i][j + 1] = A[i][j];
                            }
                        } else {
                            B[i][j] = 0;
                        }

                    }

                }
            }
        }
        return B;
    }

    public static void Imprimir(int C[][]) {
        Scanner scan = new Scanner(System.in);
        int i, j, n = 4;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(C[i][j]);
                System.out.println("");

            }
        }
    }

}
