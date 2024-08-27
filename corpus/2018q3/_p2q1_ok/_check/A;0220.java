
import java.util.*;

public class ex1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um tamanho impar para o vetor V: ");
        int N = reader.nextInt();
        int[] V = new int[N];
        int x = N / 2 + 1;
        System.out.println("Digite os elementos do vetor V: ");
        for (int i = 0; i < N; i++) {
            V[i] = reader.nextInt();
        }

        int temp = 0;
        for (int i = 1; i < N; i = i + 2) {
            if (i < x) {
                if (V[i] > V[N - i- 1]) {
                    temp = V[N - i - 1];
                    V[N - i -1 ] = V[i];
                    V[i] = temp;

                }
            }
        }
        System.out.println("Semiparticionado de V: ");
        for (int i = 0; i < N; i++) {
            System.out.print(V[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

}
