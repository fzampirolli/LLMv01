
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

    int n, x, y, nvetor;

    System.out.print("Digite o tamanho desejado do vetor n: ");

    n = entrada.nextInt();

    int vetor [] = new int [n];

      for (int i=0; i<n; i++){
           System.out.print("Escreva o " + (i+1) + " º elemento do vetor: ");
           vetor [i]= entrada.nextInt();           
       }
      for(int i=0; i<n; i++){ 
      System.out.print(vetor[i]+ " ");
      }

}

}
