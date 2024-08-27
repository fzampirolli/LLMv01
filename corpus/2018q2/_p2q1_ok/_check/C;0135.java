
import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        final int MAX = 50;
        int V[] = new int [MAX];
        int x = 0;
        int k = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Preencher vetor:");
        for(int i=0; i<MAX; i++){
            V[i] = (int)(Math.random()*72-21);
            System.out.print(V[i]+", ");
            if(V[i]>V[8]){    
                x = x+1;
            }   
        }
        System.out.println("\nO elemento de índice 8 é: "+ V[8]);
        System.out.println(x + " números são maiores do que o número: "+ V[8]);
        System.out.println("Digite um número inteiro: ");
        k = ent.nextInt();

        for(int i=0; i<MAX; i++){
            if (V[i]==k){
                System.out.println(k + " ocorreu na posição " + i);
            }

        }   

    }

}
