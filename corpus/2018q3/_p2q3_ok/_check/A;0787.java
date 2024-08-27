
import java.util.Scanner;

public class Ex3 {

    public static Scanner In = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 4; 
        int[][] A = new int[n][n]; 
        GeraMatriz(A, n, n);
        imprimeMatriz(A);
        int[][] B = matrizTransposta(A);
        System.out.println("Menor valor: " + retornaMenor(A));
        System.out.println();

    }

    public static void GeraMatriz(int Mat[][], int L, int C)
    {
        for(int i = 0; i < L; i++)
        {
            for(int j = 0; j < C; j++)
            {
                Mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public static void imprimeMatriz(int Mat[][])
    {
        int n = Mat.length; 

        for(int l = 0; l < n; l++)
        {
            for(int c = 0; c < n; c++)
            {
                System.out.print(Mat[l][c] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrizTransposta(int Mat[][])
    {
        int n = Mat.length; 
        int[][] Trans = new int[n][n];

        for(int l = 0; l < n; l++)
        {
            for(int c = 0; c < n; c++)
            {
                Trans[c][l] = Mat[l][c];
            }
        }

        return Trans;
    }

    public static int retornaMenor(int Mat[][])
    {
        int n = Mat.length; 
        int menor = Mat[0][1];

        for(int l = 0; l < n; l++)
        {
            for(int c = 0; c < n; c++)
            {
                if(c > l)
                {
                    if(Mat[l][c] < menor)
                    {
                       menor = Mat[l][c];
                    }
                }
            }
        }

        return menor;
    }

}
