
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {

    Scanner sc = new Scanner(System.in);
    public static void GeraMatriz(int Mat[][], int L, int C){
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                Mat[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public static void imprimeMatriz(int[][] Mat){
        System.out.println("Matriz [A]: ");        
        System.out.println(Arrays.deepToString(Mat));       
    }

    public static int[][] transposta(int[][] Mat){
        int aux;
        for(int i = 0; i < Mat.length; i++){
            for(int j = 0; j < Mat[i].length; j++){
                aux = Mat[i][j];
                Mat[i][j] = Mat[j][i];
                Mat[j][i] = aux;           
            }
        }
        return Mat;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L, C, Mat[][], B[][];

        System.out.println("Digite o tamanho da linha: ");
        L = sc.nextInt();

        System.out.println("Digite o tamanho da Coluna: ");
        C = sc.nextInt();

        Mat = new int[L][C];
        GeraMatriz(Mat,L,C);
        imprimeMatriz(Mat);
        B = transposta(Mat);
        imprimeMatriz(B);
    }   
}
