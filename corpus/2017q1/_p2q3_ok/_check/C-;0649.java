
import java.util.Scanner;

public class P2Q3 {

    public static void main(String[] args) {
        int A[][] = new int[4][4];
        int B[][] = new int[4][4];

        System.out.println("Carregue a matriz A:");
        A=LeMatriz(A);
        ImprimeMatriz(A);
    }

    public static int[][] LeMatriz(int Mat1[][] ) {
        Scanner scInt = new Scanner(System.in);
        int i,j;

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                Mat1[i][j] = scInt.nextInt();
            }
        }
        return Mat1;
    }

    public static void ImprimeMatriz(int Mat1[][] ) {
        Scanner scInt = new Scanner(System.in);
        int i,j;

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(Mat1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
