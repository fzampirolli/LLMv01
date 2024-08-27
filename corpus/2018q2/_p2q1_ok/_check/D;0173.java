
import java.util.Scanner;

public class Questao1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int k, aux = 0, c = 0, n = 0;
        final int MAX = 50;
        int V[] = new int[MAX];
        System.out.println("Preencher vetor:");
        for (int i = 0; i < MAX; i++) {

            V[i] = (int) (Math.random() * 72 - 21);
        }

        System.out.println("Os valores do vetor são: ");
        for (int i = 0; i < MAX; i++) {
            System.out.println((i + 1) + "º número: " + V[i]);

        }
        aux += V[10];   
        System.out.println("O elemento de índice 11 do vetor é: " + aux);

        for (int i = 0; i < MAX; i++) {
            c += V[i];   
            if (c > aux) {
                n += 1;   
                c = 0;

            }

        }
        System.out.println("A quantidade de números maiores que este elemento é: " + n);

        System.out.println("Entre com o número de busca desejado: ");
        k = entrada.nextInt();

        for (int i = 0; i < MAX; i++) {
            c += V[i];   
            if (c == k) {
                n = 0;
                n += i;   
                c = 0;
                System.out.println("O valor " + k + " ocorreu na posição " + n);
                System.out.println("oi");
            }

        }  

    }

}
