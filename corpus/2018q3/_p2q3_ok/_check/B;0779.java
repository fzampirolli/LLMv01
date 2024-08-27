
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[][] = new int [25][25];
        int B[][] = new int [25][25];

        GeraMatriz (A, 25, 25);

        imprimeMatriz (A);

        B=matrizTransposta(A);

        System.out.println(" ");
        imprimeMatriz (B);

        System.out.println(" ");

        menor(A);
    }

    public static void GeraMatriz (int Mat[][], int L, int C) {
    for (int i=0; i<L; i++) {
        for (int j=0; j<C; j++) {
            Mat[i][j] = (int) (Math.random()*10);
        }
    }
}

    public static void imprimeMatriz (int Mat[][]) {
        for (int i=0; i<Mat.length; i++) {
            for (int j=0; j<Mat.length; j++) {
                System.out.printf(Mat[i][j]+" ");
            }
            System.out.println(" ");
        } 

    }

    public static int [][] matrizTransposta (int Mat[][]) {
        int aux;
        for (int i=0; i<Mat.length; i++) {
            for (int j=0; j<Mat.length; j++) {
                if(j>i) {
                aux = Mat[i][j];
                Mat[i][j] = Mat[i+1][j];
                Mat[i+1][j] = aux;
                }
            }
    }
        return Mat;
    }

    public static void menor (int Mat[][]) {
        int menor=0;
        for (int i=0; i<Mat.length; i++) {
            for (int j=0; j<Mat.length; j++) {
                if(j<=i && menor<Mat[i][j]) {
                    menor = Mat[i][j];
                }
            }
        }

            System.out.println(menor);
    }
}
