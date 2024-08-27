
import java.util.Scanner; 
public class Exercicio1 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int tamanho=115;
       int v[]= new int [tamanho];
       for (int i = 0; i<tamanho; i++) {
           System.out.printf("Digite o valor do elemento da posicao " +i+ " do vetor: ");
           v[i]=teclado.nextInt();
       }
       int k=40;
        comparaVetor (v, tamanho, k);
       if (comparaVetor(v, tamanho, k)) {
           System.out.println("Existe número igual a 40 nesse vetor.");
       }
       else {
           System.out.println("Não existe número igual a 40 nesse vetor");
       }
    }
    public static boolean comparaVetor (int v[], int n, int k) {
        boolean numero=true;
       for (int i=0; i < n; i++) {
           if (v[i]==k) {
               numero=true;
               break;
           }
           else {
               numero=false;
           }
       }
       return numero;
    }
}
