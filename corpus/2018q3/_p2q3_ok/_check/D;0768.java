
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int Mat[][] = new int [27][27];
        GeraMatriz(Mat, 27 ,27);
        ImprimeMatriz(Mat,27,27);

    }
    public static void GeraMatriz(int Mat[][], int L, int C) {
        for (int i = 0; i <L ; i++) {
            for (int j = 0 ; j < C ; j++) {
                Mat[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public static void ImprimeMatriz (int Mat[][], int M, int D) {
        for (int i = 0 ; i < M ; i ++) {
            System.out.println("");
            for (int j = 0 ; j < D ; j ++) {
                System.out.print(Mat[i][j]+" ");
            }
        }
    }    
}
