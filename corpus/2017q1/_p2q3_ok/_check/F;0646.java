
public class Main {

    public static void main(String[] args) {

    }

    public static void LerMatriz(int A[][]) {
        for (int i = 0; i < A[4][0]; i++) {
            for (int j = 0; j < A[0][4]; j++) {
                int temp = A[i][j];
            }

        }

    }

    public static int[][] Quadrante(int A[][]) {
        int B[][] = new int[4][4];
        for (int i = 0; i<2;i++){
            for (int j=0; j<2;j++){
                B[i][j] = 0;
            }
        }
        for (int i = 2; i < 4; i++) {
            for (int j = 2; j < 4; j++) {
                if (A[i][j] > A[i + 1][j]) {
                    B[i][j] = A[i][j];
                }
                else {
                    B[i][j]= A[i+1][j];
                }
            }
            for (int i = 0;i<4;i++){
                for(int j=0;j<4;j++){
                     return int B[i][j];
                }
            }

        }
    }
}
