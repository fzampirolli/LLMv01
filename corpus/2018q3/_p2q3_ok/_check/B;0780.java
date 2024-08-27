
import java.util.Scanner;
public class JavaApplication3 
{

    public static void main(String[] args) 
    {
        Scanner valor = new Scanner(System.in);

        int a[][] = new int[27][27];

        GeraMatriz(a,27,27);

        imprimeMatriz(a,27,27);

        int M[][] = new int[27][27];

        M = matrizTransposta(a);

        System.out.println(" O maior valor dos elementos do triangulo superior da diagonal A é: "+maiorElemento(a));

    }

    public static void GeraMatriz(int mat[][], int l, int D)
    {

        for (int i = 0; i < l; i++) 

        {

            for (int j = 0; j < D; j++) 

            {

                mat[i][j] = (int)(Math.random()*10);

            }

        }

    }

    public static void imprimeMatriz(int matriz[][], int l, int D)

    {
        for (int i = 0; i < l; i++) 

        {

            for (int j = 0; j < D; j++) 

            {

                System.out.print(matriz[i][j]);

            }

            System.out.print("\n");

        }

    }

    public static int[][] matrizTransposta(int matriz[][])

    {

        int[][] b = new int[27][27];

        int aux = 0;

        for (int i = 0; i < 27; i++) 

        {

            for (int j = 0; j < 27; j++) 

            {

                if (i==j)

                {

                    for (int k = 0; k < 27-j; k++)

                    {

                        aux = b[i][j+k];

                        b[i][j+k] = b[i+k][j];

                        b[i+k][j] = aux;

                    }                  

                }

            }

        }             

        return b;

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
