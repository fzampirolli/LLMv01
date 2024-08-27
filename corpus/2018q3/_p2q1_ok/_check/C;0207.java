
import java.util.Scanner;
public class Q1p2 {

    public static void main(String[] args) {
         int n;

         Scanner teclado = new Scanner(System.in);
         System.out.print("Digite um número inteiro n estritamente positivo: ");
         n = teclado.nextInt();

         int V[]= new int[n];

         System.out.println("Digite os elementos do vetor de tamanho " + n + ": ");

         for (int i=0; i<n; i++){
             V[i]= teclado.nextInt();
         }

         int j=n-1;
        for (int i=0; i<n; i++){ 
         while (V[i]>V[n-1]){
            V[i]=V[j];
            i++;
            j--;
        }
        }

        System.out.println ("\nO semiparticionado de V é: ");
        for (int i=0; i<n; i++){
             System.out.println("  "+ V[i]+"  ");
        }
        System.out.println ("\n \n");
    }

             }
