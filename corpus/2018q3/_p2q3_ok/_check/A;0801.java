
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        int[][] Mat = new int[27][27];
        int[][] B = new int[27][27];

        GeraMatriz(Mat, 27, 27);
        ImprimeMatriz(Mat);
        System.out.println("");
        B = MatrizTransposta(Mat);
        System.out.println("O menor elemento do triangulo inferior de A é: " + RetornaMenor(Mat));

    }

    static void GeraMatriz(int[][] Mat, int l, int co) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < co; j++) {

                Mat[i][j] = (int) (Math.random() * 10);
            }
        }

    }

    static void ImprimeMatriz(int Mat[][]) {
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat.length; j++) {
                System.out.print(Mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] MatrizTransposta(int Mat[][]) {
        int aux;
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat.length; j++) {
                if (i != j && i > j) {
                    aux = Mat[i][j];
                    Mat[i][j] = Mat[j][i];
                    Mat[j][i] = aux;
                }
            }
        }
        return Mat;
    }

    static int RetornaMenor(int Mat[][]) {
        int menor = 11;
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat.length; j++) {
                if (i != j && i < j) {
                    if (Mat[i][j] < menor) {
                        menor = Mat[i][j];
                    }
                }
            }
        }
        return menor;
    }
}
