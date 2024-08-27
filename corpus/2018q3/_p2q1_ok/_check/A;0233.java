
import java.util.Scanner;

public class Ex1 {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int tam, i = 0;

        System.out.print("Digite um numero positivo ímpar: ");
        tam = leia.nextInt(); 
        int[] V = new int[tam]; 

        for(i=0; i < tam; i = i + 1)
        {
            System.out.print("Digite o " + (i+1) + " Valor: ");
            V[i] = leia.nextInt();
        }

        for(i = 0; i < tam/2; i = i + 1)
        {
            if(V[i] < V[tam-1-i])
            {
                int Auxiliar = V[i];
                V[i] = V[tam-1-i];
                V[tam-1-i] = Auxiliar;
            }
        }

        for(i = 0; i < tam; i = i + 1)
        {
            System.out.print(V[i] + " ");
        }

    }        

}
