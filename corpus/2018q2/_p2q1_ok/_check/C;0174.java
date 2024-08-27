
import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0, k, aux=0;
        final int MAX = 50;
        int V[] = new int[MAX];

        System.out.println("Preencher vetor: ");
        for(int i=0;i<MAX;i++){
            V[i] = (int)(Math.random()*72-21);
            System.out.println(V[i]);
    }
        System.out.println("O elemento de indice 5 e: "+V[4]);  

        for(int i=0;i<MAX;i++){
            if(V[i]>V[4]){  
                cont ++;
            }
        }
        System.out.println("Ha "+cont+" numeros maiores do que o elemento de indice 5");

        System.out.println("Insira um numero para fazer uma busca: ");
        k=sc.nextInt();

        for(int i=0; i<MAX; i++){
             if(V[i] == k){

                System.out.println("k ocorreu na posicao: "+i);
            }

            }  

        }

    }  
