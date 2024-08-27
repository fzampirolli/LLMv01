
 import java.util.Scanner; 

public class Questao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 

        final int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("Preencher vetor:");  

        for(int i=0; i < MAX; i++){
        V[i] = (int)(Math.random()*72-21);
    }

         for(int i=0; i < MAX; i++){
             System.out.println(" "+V[i]);
         }

         System.out.println("O elemento de indice 5 é:" + V[5]);
         int maior = V[5];
         int cont = 0; 
        for(int i=0; i < MAX; i++){             
            if (V[i]>=maior){      
                cont ++; 

                System.out.println (" "+V[i]); 
            }

        }

        System.out.println ("O total de numero maior do que " +V[5]+ " é " + cont);

        System.out.println ("Indique um número para ser buscado no vetor: ");
        int k = teclado.nextInt ();

       int aux = 0; 

       for(int i=0; i < MAX; i++){
           if (V[i] == k){
               aux ++;

                System.out.println (" "+i); 
           }           
       }

        System.out.println ("Existem "+aux+ " indices que contem esses elemetos "); 

       if (aux==0){
               System.out.println ("O valor " +k+ " não foi encontrado no vetor");

           }
       } 

}
