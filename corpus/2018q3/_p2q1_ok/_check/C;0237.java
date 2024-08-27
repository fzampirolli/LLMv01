
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
         int n=0;
         int i;
         int aux;
         System.out.println("digite um valor inteiramente positivo");
         n= entrada.nextInt();
         int vetor[]= new int [n];
         for (i=0; i<n; i++)
         {
           System.out.println("os valores do vetor");
           vetor[i]= entrada.nextInt();
         }
         for (i=0;i<n;i++)
         {
             if (vetor[2+i]> vetor[i-2]){
                 aux= vetor[2+i];
                 vetor[2+i] = vetor[i-2];
                 vetor[i-2] = aux;

             }
              for (i=0;i<n;i++)
              {
             System.out.println(""+vetor[i]);
              }
         }

    }

}
