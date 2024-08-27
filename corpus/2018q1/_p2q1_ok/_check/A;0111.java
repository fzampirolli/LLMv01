
import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        int TAM = 145,N=10;
        int V[] = new int [TAM];
        for(int i = 0;i<TAM;i++)
        {
            System.out.println("valor do vetor:");
            V[i] = read.nextInt();
        }
        if(comparaVetor(V,TAM,N))
        {
            System.out.println("Existe número diferente de 10 nesse vetor");
        }
        else
        {
            System.out.println("Não existe número diferente de 10 nesse vetor");
        }

    }
    public static boolean comparaVetor(int V[], int TAM, int N)
    {
        boolean teste = false;
        for(int i = 0; i<TAM;i++)
        {
            if(V[i] != 10)
            {
                teste = true;
            }
        }
        return teste;
    }
}
