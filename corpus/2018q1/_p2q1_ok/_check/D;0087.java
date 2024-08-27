import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args) 
    {

        Scanner entrada = new Scanner(System.in);
        int v[],n, k=40;
        boolean comparaVetor=false;

        System.out.println("Digite o tamanho do vetor: ");
        n=entrada.nextInt();
        v = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Digite o elemento contido no vetor: ");
            v[i]=entrada.nextInt();
        } 

        comparaVetor(v,n,k);

    }

    private static void comparaVetor(int[] v, int n, int k) 
    {
        for(int i=0;i<n;i++)
        {
            if(v[i]==k)
            {
                System.out.println("Há número igual a 40 nesse vetor");
            }
            else
            {
                System.out.println("Não há número igual a 40 nesse vetor");
            }
        }
    }
}
