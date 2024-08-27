
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int n, i;

       System.out.println("Digite o tamanho dos vetores: ");
       n=entrada.nextInt();

       int A[] = new int [n];

       System.out.println("Elementos do vetor A: ");

       for(i=0;i<n;i++){
           A[i]=entrada.nextInt();
       }

       System.out.println("Vetor A: ");

       for(i=0;i<n;i++){
          System.out.print(A[i] + " ");
       }

       int B[] = new int [n];

       System.out.println("\nElementos do vetor B: ");

       for(i=0;i<n;i++){
           B[i]=entrada.nextInt();
       }
       System.out.println("Vetor B: ");

       for(i=0;i<n;i++){
          System.out.print(B[i] + " ");
       }

       int C[] = new int [n];

       for(i=0;i<n;i++){
           if(A[i]>B[i]){
               C[i]=A[i];
           }
           else{
               C[i]=B[i];
           }
       }   

       System.out.println("\nVetor C: ");

       for(i=0;i<n;i++){
           System.out.print(C[i] + " ");
       }

    }

}
