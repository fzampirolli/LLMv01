
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
       int n = 0;
       int vet[] = new int[n];
       int aux;

       Scanner teclado = new Scanner (System.in);
       System.out.println("Digite o tamanho do seu vetor (ímpar e positivo): ");
       n = teclado.nextInt();

          for(int i=0;i<n;i++){
             System.out.println("Digite o valor de cada elemento do vetor: ");
             vet[i] = teclado.nextInt();
             System.out.println("Vetor desejado: " +vet[i]);
          }
          for(int i=0;i<n;i++){
              for(int j=n;j>(n-1)/2;j=n-2){
                if(vet[i+1]>vet[n-j]){
                  aux = vet[n-2];
                  vet[n-j] = vet[i+1];
                  vet[i+1] = aux;
                   System.out.println("O vetor semiparticionado ímpar é: " +vet[i]);
                 }
              }
          }   
    }
}     
