
import java.util.Scanner;

public class P2Questao1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int MAX = 50;
        int i, m=0, k;
        int V[] = new int [MAX];

        System.out.println("Preencher o vetor: ");

        for (i=0; i < MAX; i++){
            V[i] = (int)(Math.random()*72-21);
            System.out.print(" "+V[i]);

            if (V[9] < V[i]){  
                m = m + 1;
            }
        }
        System.out.println("\nO elemento com o índice 9 é: "+ V[9]);
        System.out.println("\nA quantidade de números maiores do que o elemento "+V[9]+" no vetor é: "+m);

        System.out.println("Digite um número inteiro k: ");
        k = entrada.nextInt();

        for (i=0; i < MAX; i++){

            if(V[i] == k){
                System.out.println("k ocorreu na posição "+ V[k] +" do vetor");  
            }else{
                System.out.println("\nk não foi encontrado no vetor");  
                }

        }
    }

}
