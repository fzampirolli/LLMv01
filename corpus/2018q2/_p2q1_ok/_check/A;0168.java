

import java.lang.Math;     
import java.util.Scanner;

public class 1 {

    public static void main(String[] args) {
        final int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("preasdasdencher Vetor:");
        for (int i=0; i<MAX; i++){
            V[i] = (int)(Math.random()*72-21);
        }

        int cont = 0;

        System.out.println("imprimindo vetor");
        for (int i=0;i<MAX;i++){
            System.out.println(V[i]);
            if (V[i]>V[9]){
                cont=cont+1;
            }
        }

        System.out.println("Indice 9");
        System.out.println(V[9]);
        System.out.println("Numero de elementos maiores que o de indice 9");
        System.out.println(cont);

        Scanner teclado = new Scanner(System.in);
        int k;
        boolean isThereK = false;

        System.out.println("");
        System.out.println("Insira um numero inteiro k");
        k = teclado.nextInt();

        for (int i=0;i<MAX;i++){
            if (V[i]==k){
                System.out.println("k ocorreu na posicao: " + i);
                isThereK = true;
            }
        }
        if (isThereK==false){System.out.println("k não foi encontrado no vetor");}   
    }
}
