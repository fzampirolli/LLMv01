import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args) 
    {

        int vetor[],tam;
        int A[][];
        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        tam=entrada.nextInt();
        vetor=new int [tam];
        A = new int [tam] [tam];
        for(int i=0;i<tam;i++)
        {
            System.out.println("Digite os elementos do vetor: ");
            vetor[i]=entrada.nextInt();
        }

        criarMatriz(vetor,tam);

        imprimirMatriz(A,tam);
        System.out.print("A média é:");
        System.out.println(mediaMatriz(A,tam));
    }

    private static int[][] criarMatriz(int[] vetor, int tam) 
    {
        Scanner entrada=new Scanner(System.in);
        int A[][];
        A = new int [tam] [tam];              
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                System.out.println("Digite os elementos da matriz: ");
                A[i][j]=entrada.nextInt();
            }
        }

        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                if(A[i][j]==A[j][i])
                {
                    A[i][j]=vetor[i];
                }
            }
        }
        return A;
    }

    private static void imprimirMatriz(int[][] A, int tam) 
    {
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                System.out.println(A[i][j]);               
            }
            System.out.println("");
        }
    }

    private static int mediaMatriz(int[][] A, int tam)
    {
        int soma=0, media, elementos=0;
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                if(A[i][j]%5==0)
                {
                    soma += A[i][j];
                    elementos++;
                }
            }

        }
        media=(soma/elementos);
        return media;
    }
}
