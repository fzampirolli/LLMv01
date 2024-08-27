
import java.util.Scanner;

public class Prova2 {

    public static void main(String[] args) {

        final int MAX = 50;
        int V[] =  new int [MAX];
        System.out.println("Preencher vetor");
        for (int i = 0; i < MAX; i++) {

            V[i] = (int)(Math.random()*72-21);                       
        }

        Scanner in = new Scanner (System.in);

        System.out.println("Elementos do Vetor");
        for (int a = 0; a < MAX; a++){
            System.out.print(" "+ V[a]);
        }

        System.out.println(" ");
        System.out.println("Elemento de indice 9: " + V[9] );

        int aux  = 0;
        int aux2 = V[9];
        int c = 0;

        for (int b = 0; b < MAX; b++) {
            c = b;       
            int m = V[c];   
            if (aux2 < m){
                aux = aux + 1;

            }           
        }
        System.out.println(aux + " Sao maiores que o elemento do verto de indice 9");

        System.out.println("Insira um numero inteiro");

        int k = in.nextInt();

        for (int z = 0; z < MAX; z++){
            int d = V[z];   

            if (k == d){

                System.out.println(k + " ocoreu no indice " + z );
            }

            }
        }

    }  
