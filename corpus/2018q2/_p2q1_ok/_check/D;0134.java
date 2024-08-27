
public class Exercicio1a {
    public static void main(String[] args) {
        int c=0;
        final int MAX = 50;
        int V[] = new int[MAX];
        System.out.println(" Preencher Vetor: ");
        for(int i=0; i<MAX; i++){

            V[i] = (int)(Math.random()*72-21);
              System.out.println(V[i]);

              if (V[11]<V[i]){   
                  c++;
              }
        }

      System.out.println("O elemento de índice 12 desse vetor é " + V[11]);  

      System.out.println("O quantidade de valores acima do elemento de índice 12 é: " + c);

    }

}

===================================

import java.util.Scanner;
public class Exercicio1b {
    public static void main(String[] args) {
        int k=0;
        final int MAX = 50;
        int V[] = new int[MAX];
        System.out.println(" Preencher Vetor: ");
        for(int i=0; i<MAX; i++){

            V[i] = (int)(Math.random()*72-21);
              System.out.println(V[i]);
    }
        System.out.println("Insira um número intero 'k': ");
        k = next.int;

    }
}
