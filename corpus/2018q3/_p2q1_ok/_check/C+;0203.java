
import java.util.Scanner;

public class Ex1 {

    public static Scanner In = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        int[] V;

        System.out.print("Digite um numero positivo ímpar: ");
        n = In.nextInt(); 
        V = new int[n]; 
        LeVetor(V, n);
        TransformaSemiParticionado(V, n);
        ImprimeVetor(V, n);

    }        

    public static void LeVetor(int[] V, int tam)
    {
        for(int i=0; i < tam; i++)
        {
            System.out.print((i+1) + "º Valor: ");
            V[i] = In.nextInt();
        }
    }

    public static void TransformaSemiParticionado(int[] V, int tam)
    {
        for(int i = 0; i < tam/2; i++)
        {
            if(V[i] < V[tam-1-i])
            {
                int aux = V[tam-1-i];
                V[tam-1-i] = V[i];
                V[i] = aux;
            }
        }
    }

    public static void ImprimeVetor(int[] V, int tam)
    {
        for(int i = 0; i < tam; i++)
        {
            System.out.print(V[i] + " ");
        }
    }

}
