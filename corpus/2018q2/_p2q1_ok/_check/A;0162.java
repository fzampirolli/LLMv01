
import java.util.Scanner;
import java.util.Random;

public class Questao1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        Random rand = new Random ();   
        int cont =0, aux=0, k;

        int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("Preencher vetor: ");
        for (int i=0; i<MAX; i++) {
            V[i] = (int)(Math.random()*72-21);
        }
        for (int i=0; i<MAX; i++) {
           System.out.print(V[i]+ " ");
        }
        System.out.println("\n");
        System.out.println("O elemento do indice 6 é " +V[6]); 
        for (int i=0; i<MAX; i++) {
           if (V[i] > V[6]) {
               cont = cont+1;
           }
        }
                System.out.println("Existem " +cont+ " números maiores do que " +V[6]+ " nesse vetor." );

        System.out.println("Digite um número inteiro: ");
        k = entrada.nextInt();

        for (int i=0; i<MAX; i++) {
           if (V[i] == k) {
               System.out.println("O número " +k+ " ocorreu na posição " +i+ ".");
               aux=aux+1;
           }
        } 
        if (aux==0) {
               System.out.println("O número " +k+ " não foi encontrado no vetor.");
        }
    }

}   
