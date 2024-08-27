
import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) 
    {
        Scanner valor = new Scanner(System.in);

        int A[][] = new int[27][27];
        GeraMatriz(A,27,27);
        imprimeMatriz(A,27,27);

        int B[][] = new int[27][27];

        B = matrizTransposta(A);

        System.out.println(" O maior valor dos elementos do triangulo superior da diagonal A é: "+maiorElemento(A));
    }

    public static void GeraMatriz(int mat[][], int L, int C)
    {
        for (int i = 0; i < L; i++) 
        {
            for (int j = 0; j < C; j++) 
            {
                mat[i][j] = (int)(Math.random()*10);
            }
        }
    }

    public static void imprimeMatriz(int matriz[][], int L, int C)
    {
        for (int i = 0; i < L; i++) 
        {
            for (int j = 0; j < C; j++) 
            {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int[][] matrizTransposta(int matriz[][])
    {
        int B[][] = new int[27][27];

        int aux = 0;

        for (int i = 0; i < 27; i++) 
        {
            for (int j = 0; j < 27; j++) 
            {
                if (i==j)
                {
                    for (int k = 0; k < 27-j; k++)
                    {
                        aux = B[i][j+k];
                        B[i][j+k] = B[i+k][j];
                        B[i+k][j] = aux;
                    }                  
                }
            }
        }             

        return B;
    }

    public static int maiorElemento(int matriz[][])
    {
        int maior = 0;
        for (int i = 0; i < 27; i++) 
        {
            for (int j = 0; j < 27; j++) 
            {
                if (i<j)
                {
                    if (matriz[i][j] > maior) 
                    {
                        maior = matriz[i][j];
                    }
                }
            }
        }            
        return maior;
    }

}
