
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int MAX = 50;
        int maior = 0, aux = 0;
        int V[] = new int [MAX];
        System.out.println("Preencher vetor:");
        for (int i = 0; i < MAX; i++) {

            V[i] = (int) (Math.random() * 72-12);
        }
        System.out.println("-------------------------");
        System.out.println("Os valores do vetor são: ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println("");
        System.out.print("O elemento de índice 13 é: " +V[13]+ "\n");
        for (int i = 0; i < MAX; i++) {
            if (V[i] > V[13]) {
                maior = maior +1;
            }
        }
        System.out.print("A quantidade de números maiores do que " 
                +V[13]+ " é: " +maior+ "\n");
        System.out.print("Digite, por favor um número inteiro para ser buscado no vetor: ");
        int k = ler.nextInt();
        for (int i = 0; i < MAX; i++) {
            if (V[i] == k) {
                System.out.println(k+ " ocorreu na posição " +i);

            } else {
                aux = aux + 1;
            } 
        }
        if (aux >= MAX) {
            System.out.println(k+ " não foi encontrado no vetor");  
        }

    }

}
