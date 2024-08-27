
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);

        int TAM;        
        System.out.println("Tamanho da Matriz: ");
        TAM = read.nextInt();
        int V[] = new int [TAM];
        int M[][] = new int [TAM][TAM];

        for(int i = 0; i<TAM;i++)
        {
            System.out.println("valor vetor:");
            V[i] = read.nextInt();
        } 
        CriarMatriz(V,TAM);
        Imprimi(M,TAM);

    }
    public static int[][] CriarMatriz(int V[],int TAM)
    {
        Scanner read = new Scanner(System.in);
        int M[][] = new int [TAM][TAM];
        for(int i = 0;i<TAM;i++)
        {
            for(int j = 0;j<TAM;j++)
            {
                if(i==j)
                {
                    M[i][j] = V[i];

                }
                else
                {
                    System.out.println("Digite o valor da matriz nesta posição:");
                    M[i][j] = read.nextInt();

                }
            }

        }
           return M; 
        }
    public static void Imprimi(int M[][],int TAM)
    {

          for(int i = 0;i<TAM;i++)
        {
            for(int j = 0;j<TAM;j++)
            {
                System.out.println("VALOR: "+M[i][j]);

            }

        }

    }

    }
