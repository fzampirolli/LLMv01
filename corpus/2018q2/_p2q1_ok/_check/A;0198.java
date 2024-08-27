
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int max = 50;
        int v[] = new int[max];

        System.out.println("Preencher vetor: ");
        for (int i = 0; i < max; i++) {

            v[i] = (int)(Math.random() * 72 - 21);
        }

        for (int i = 0; i < max; i++) {
            System.out.println(v[i]);
        }

        System.out.println("Elemento de índice 5: " + v[5]);

        int c = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > v[5]) {
                c++;
            }
        }
        System.out.println("A quantidade de de números maiores do que o elemento " + v[5] + " é igual a: " + c);

        int bool = 0;
        System.out.println("Digite um número inteiro k: ");
        int k = scan.nextInt();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == k) {
                System.out.println("K ocorreu na posição: " + i);
            }
            else
            {
                bool++;
            }
        }
        if (bool > 49) {
            System.out.println("K não foi encontrado no vetor");
        }
    }

}
