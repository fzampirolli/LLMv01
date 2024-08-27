
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        final int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("Preencher vetor: ");
        for(int i=0; i< MAX; i++) {
            V [i] = (int) (Math.random()*72-21);

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro ");
         int k = sc.nextInt();
         for(int i=0; i==k; i++){
             if (k == V[i])
                 System.out.println(" k ocorreu na posicao "+ i );
         }

    }

}
