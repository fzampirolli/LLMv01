
public class ex3 {

    static int L = 4;
    static int C = 4;
    static int[][] Mat = new int[L][C];
    static int[][] B = new int[L][C];

    public static void main(String[] args) {

        System.out.println("Matriz A: ");
        GeraMatriz(Mat, L, C);
        imprimeMatriz(Mat);
        System.out.println("\nTransposta de A: ");
        B = matrizTransposta(Mat);
        imprimeMatriz(B);
        System.out.print("\nMaior elemento da diagonal inferior de A: ");
        System.out.println(maior(Mat));

    }

    static void GeraMatriz(int Mat[][], int L, int C) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                Mat[i][j] = (int) (Math.random() * 10);

            }
        }
    }

    static void imprimeMatriz(int M[][]) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(M[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] matrizTransposta(int Mat[][]) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                B[i][j] = Mat[j][i];
            }
        }
        return B;
    }

    public static int maior(int M[][]) {
        int x = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (i > j) {
                    if (M[i][j] > x) {
                        x = M[i][j];
                    }
                }
            }
        }
        return x;
    }
}
