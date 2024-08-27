
import java.util.Scanner;

public class LerMatriz {

    public static void main(String[] args) {
        int A[][] = lerMatriz();
        imprimirMatriz(A);
        int B[][] = new int[A.length][A[0].length];
        B = criarMatrizB(A, B);
        System.out.println("");
        imprimirMatriz(B);

    }

    public static int[][] criarMatrizB(int A[][], int B[][]) {
        int q4linha = A.length / 2 - 1; 
        int q4col = A[0].length / 2 - 1;
        int maior = 0;
        for (int i = q4linha; i < A.length; i++) {
            for (int j = q4col; j < A[0].length; j++) {
                if (A[i][j] > maior) {
                    maior = A[i][j];
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[i][j] = 0;
            }
        }
        for (int i = q4linha+1; i < A.length; i++) {
            for (int j = q4col+1; j < A[0].length; j++) {
                B[i][j] = maior;
            }
        }
        return B;
    }

    public static void imprimirMatriz(int X[][]) {
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] lerMatriz() {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("L = ");
        int l = scan.nextInt();

        System.out.print("C = ");
        int c = scan.nextInt();
        int A[][] = new int[l][c];
        String result[] = new String[l];
        for (int i = 0; i < l; i++) {
            result[i] = scan2.nextLine();
            for (int j = 0, r = 0; j < c; j++, r = r + 2) {
                int x = Integer.valueOf(String.valueOf(result[i].charAt(r)));
                A[i][j] = x;
            }
        }
        return A;
    }

}
