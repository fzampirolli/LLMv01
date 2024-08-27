
import java.util.Scanner;
public class JavaApplication1 
{

    public static void main(String[] args) 
    {
        int tamanho, troca;

        Scanner ent = new Scanner (System.in);

        System.out.println("Digite o tamanho do vetor: ");

        tamanho= ent.nextInt();

        while ((tamanho%2)==0|tamanho < 0)

        {

            System.out.println("Tamanho inválido! Digite um valor positivo e impar: ");

            tamanho= ent.nextInt();

        }

        int v[]= new int [tamanho];

        for (int i = 0; i < (tamanho); i++) 

        {
            System.out.println("Digite um valor para ser armazenado: ");

            v[i]= ent.nextInt();

            System.out.println();

        }

        for (int i = 0; i < ((tamanho)/2); i++) 

        {

            if (v[i]<v[(tamanho-1)-i])

            {

                troca=v[i];

                v[i]=v[(tamanho-1)-i];

                v[(tamanho-1)-i]= troca;

            }

        }

        for (int i = 0; i < tamanho; i++) 

        {

            System.out.println(v[i]);

        }

    }

}
