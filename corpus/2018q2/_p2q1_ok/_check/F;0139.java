
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class vitoria {

    public static void main(String[] args) {
            int K;
            Scanner teclado = new Scanner(System.in);
            final int MAX = 50;
            int V[] = new int [MAX];
            System.out.println ("Preencher vetor:");
            for (int i=0; i< MAX; i++) {
                V[i] = (int)(Math.random()*72-21);   
            }
            System.out.println ("Elementos do vetor:" + Arrays.toString(V));  
            System.out.println ("Elemento do índice 10:" + V[10]);

            System.out.print ("Insira um número inteiro:");
            K = teclado.nextInt();
             if (K = V[i]) {    
                 System.out.println (" K ocorre na posição:" + V[i]);    
             }
             else {
                 System.out.println (" K não ocorre neste vetor");    
             }

           }

    }
