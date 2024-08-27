
public class Exercicio3 {
    static void GeraMatriz(int Mat[][], int L, int C) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                Mat[i][j] = (int) (Math.random() * 10); 

            }
        }
    }

    static void imprimeMatriz(int Mat[][], int L, int C) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(Mat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    static int[][] matrizTransposta(int Mat[][], int L, int C) {
        int aux[][] = new int [L][C];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (i == j) {
                    aux[i][j] = Mat[i][j];
                } else if (j > i) {
                    aux[i][j] = Mat[j][i];
                } else if (i > j) {
                    aux[i][j] = Mat[j][i];
                }
            }
        }
        return aux;
    }

    static float mediaTriangulo(int Mat[][], int L, int C) {
        float media = 0, aux = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (j > i) {
                    media += Mat[i][j];
                    aux++;
                }
            }
        }
        media = media / aux;
        return media;
    }

    public static void main(String[] args) {
        int A[][] = new int [21][21];
        int B[][] = new int [21][21];
        int L = 21, C = 21;
        GeraMatriz(A, L, C);
        imprimeMatriz(A, L, C);
        B = matrizTransposta(A, L, C);
        mediaTriangulo(A, L, C);
    }

}
