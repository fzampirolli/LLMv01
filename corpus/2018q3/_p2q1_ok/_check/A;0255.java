
import java.util.Scanner;
public class Particionado {

    public static void main(String[] args) {
        System.out.println ("Questão 1 da P2.");
        Scanner entrada= new Scanner(System.in);
        int n;
        System.out.println ("Entre com o temanho do vetor: ");
        n = entrada.nextInt();
        int vetor [] = new int [n];
        int aux = 0, valores = 0, k;
        {
        for (k=0;k<vetor.length;k++)
        {
            System.out.println("Entre com o "+(k+1)+"ºvalor:");
            valores = entrada.nextInt();
            vetor [k]= valores;
        }
        }
        {
        for (int i=0;i<(n/2);i++)
          {
            if (vetor [i]<vetor [n-1])
            {
             aux = vetor [n-1];
             vetor [n-1] = vetor [i];
             vetor [i] = aux;
             n=n-1;
            }
          }
        }
        System.out.print ("O vetor semiparticionado é: ");
        for (int j=0; j<vetor.length; j++)
        {
         System.out.print (vetor[j]+" ");   
        }
        System.out.println ("");
    }

}
