
import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       final int MAX = 50;
       int V[] = new int[MAX];
       System.out.println("Preencher vetor");
       for (int i=0; i < MAX; i++) {
           V[i]= (int)(Math.random() *72-21);

       }

       System.out.println(" Os valores do vetor são: "+ MAX);    
       System.out.println(" O vetor do indice 11 é: " + V[10]);   
       Sytem.out.println(" E os numero maiores que ele sao: " + V[i]>V[10])  

               int k;
               System.out.print(" Digite um numero: ");
               k = entrada.nextInt();

               if (k == V[i]) {  
                  System.out.println(" K se encontra na posição" + V[]==k);
               }
               System.out.println(" Nao existem nenhum k nesse vetor.");  

    }

}
