
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        int d, e;
        int A[][] = new int [d][e];
        int B[][] = new int [d][e];

        LerMatriz(A, d, e);

        B=MatrizQ4(A);

        ImprimeMatriz(A);
        ImprimeMatriz(B);
    }

    public static int[][] LerMatriz(int Mat1[][], int l, int c){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Linhas: ");
        l = entrada.nextInt();
        System.out.println("Colunas: ");
        c = entrada.nextInt();

        for(int j=0; j<c; j++){
            for (int i=0; i<l; i++){
              System.out.println("Digite o valor da linha "+i+" coluna "+j);
              Mat1[i][j] = entrada.nextInt();
            }
        }
        return Mat1;
    }

    public static int[][] MatrizQ4(int Mat1[][]){
        int Mat2[][]=new int[Mat1.length][Mat1[0].length];
        for(int j=0;j<(Mat2[0].length)/2;j++){
            for(int i=0; i<(Mat2.length)/2;i++){
                Mat2[i][j]=0;
            }
        }
        for(int j=(Mat1[0].length)/2;j<Mat1[0].length;j++){
            for(int i=(Mat1.length)/2; i<Mat1.length;i++){
                if(Mat1[i][j]>Mat1[i+1][j]){
                    int n = Mat1[i][j];
                }
            }
        }
        for(int j=(Mat2[0].length)/2;j<Mat2[0].length;j++){
            for(int i=(Mat2.length)/2; i<Mat2.length;i++){
               Mat2[i][j]= 0;
            }
        }
            return Mat2;
    }

    public static void ImprimeMatriz(int Mat1[][]){
        for(int j=0;j<Mat1[0].length;j++){
            for(int i=0;i<Mat1.length;i++){
                System.out.println("Vetor: "+ Mat1[i][j]);
        }
        }
    }
