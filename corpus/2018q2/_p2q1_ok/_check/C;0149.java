
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        final int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("Preencher vetor:");
        for(int i=0; i < MAX; i++){

            V[i] = (int)(Math.random()*72-21);
        }
        int soma=0, k;

        for(int i=0; i < MAX; i++){
            System.out.println(V[i]);
            System.out.println(V[8]);    
            if (V[i]>V[8]){              
                soma = soma + 1;
            }
            System.out.println(+soma);  
        }

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digitar um número inteiro");
        k= entrada.nextInt();

        for(int i=0; i < MAX; i++){
            if(V[i]==k){
                System.out.println("k ocorre em posição:" +V[i]);
            }
            else{
                System.out.println("k não foi encontrado no vetor");  
            }        
    }
    }
}
