
import java.util.Scanner;
public class Questao1 {

     public static void main(String[] args) {

         int n,m,i,aux = 0;
         Scanner leia = new Scanner(System.in);

         System.out.println("Digite o tamanho do vetor");
         n = leia.nextInt();
         int V[]= new int [n];

         for(i=0;i<n;i++){
             System.out.println("Digite o elemento "+i+" do vetor ");  
             m = leia.nextInt();
             V[i]= m;
         }

         for(i=0;i!=n;i++){
             if(V[n-(n-i)] < V[(n-1)-i]){
                 aux = V[n-(n-i)];
                 V[n-(n-i)] = V[(n-1)-i];
                 V[(n-1)-i] = aux;

         }

         }

          System.out.println("Vetor semiparticionado:");
          for(m=0;m<n;m++){
             System.out.print(V[m]+" ");  

    } 
     }
}
