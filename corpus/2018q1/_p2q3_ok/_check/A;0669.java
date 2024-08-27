import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int tamanho, vetor[];
        int m[][];
        double media;

        System.out.println("Digite o tamanho do vetor:");
        tamanho = entrada.nextInt();

        vetor = new int[tamanho];

        for(int i=0; i<tamanho; i++)
        {
            System.out.println("Digite o "+(i+1)+"º elemento:");
            vetor[i] = entrada.nextInt();
        }

        m = criarMatriz(vetor);
        imprimirMatriz(m);
        media = mediaMatriz(m);

        System.out.println("\nA média é "+media);
    }

    public static int[][] criarMatriz(int[] vetor) 
    {
        Scanner teclado = new Scanner(System.in);
        int m[][];

        m = new int[vetor.length][vetor.length];
        for(int i=0; i<vetor.length; i++)
        {
            for(int j=0; j<vetor.length; j++)
            {
                if(i != j)
                {
                    System.out.println("Digite o elemento da linha "+i+" e da coluna "+j+":");
                    m[i][j] = teclado.nextInt();
                }
                else
                {
                    m[i][j] = vetor[i];
                }
            }
        }

        return m;
    }

    public static void imprimirMatriz(int[][] m) {
        System.out.print("\n");
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                System.out.print("| "+m[i][j]+" |");
            }
            System.out.print("\n");
        }
    }

    public static double mediaMatriz(int[][] m) 
    {
        int soma=0, cont=0;
        double media;

        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(m[i][j]%5 != 0)
                {
                    soma += m[i][j];
                    cont++;
                }
            }
        }

        media = soma/cont;
        return media;
    }
}
