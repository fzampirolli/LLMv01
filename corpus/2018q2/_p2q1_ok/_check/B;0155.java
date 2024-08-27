
public class Ex1 {

    public static void main(String[] args) {

        final int MAX = 50;
        int contador=0;
        int V[]= new int [MAX];
        System.out.println("Preencher vetor : ");
        for (int i = 0; i < MAX; i++) {
            V[i] = (int)(Math.random()*72-21);
        }
        for (int i = 0; i < MAX; i++) {
            System.out.println(V[i]);
            if(V[i]>V[8]){    
                contador = contador +1;
            }
        }
        System.out.println("Elemento de indice 9 = " + V[8]);    
        System.out.println("Existem " + contador + " numeros maior que o Elemento de indice 9");
    }   
}

=====================================

import java.util.Scanner;

public class Ex1b {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        final int MAX = 50;
        int  x, cont=0;
        System.out.println("Escreva um numero inteiro");
        x = s.nextInt();
        int V[]= new int [MAX];
        for (int i = 0; i < MAX; i++) {
            V[i] = (int)(Math.random()*72-21);
        }
        for (int i = 0; i < MAX; i++) {
            if (V[i] == x){
                System.out.println(x + " Ocorreu na posição " + i);
                cont++;
            }

        }
       if(cont==0){
               System.out.println(x + " Não ocorreu"); 
            }
    }
}

===================================
