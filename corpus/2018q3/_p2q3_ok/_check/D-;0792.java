
import java.util.Scanner;

public class Questao03 {

    static void GeraMatriz(int Mat[][], int L, int C){
        for (int i=0; i<L; i++){
            for (int j=0; j<C; j++){
                Mat[i][j] = (int)(Math.random()*10); 

            }
        }

    }

    static void ImprimeMatriz(int A[][]){
        for (int i=0; i<A.length; i++){
                for (int j=0; j<A[0].length; j++){
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
            }
    }

    static void MatrizTransposta(int Mat[][], int L, int C){

        int B[][] = new int [L][C];

        for (int i=0; i<Mat.length; i++){
            for (int j=0; j<Mat[0].length; j++){
                B[i][j] = Mat[C][L];

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[][] = new int [21][21];
    }

        ImprimeMatriz(A[i][j]);
    }
