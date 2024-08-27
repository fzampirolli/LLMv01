
import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        int i, n, meio_n, x, y, controle_n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        controle_n = n;
        int[] vetor = new int[n];
        meio_n = (n - 1) / 2;

        for (i = 0; i < n; i++) {
            vetor[i] = scan.nextInt();
        }

        n = n - 2;
        for (i = 1; i < meio_n; i = i + 2) {
            x = vetor[i];
            y = vetor[n];
            if (x >= y) {
            } else {
                vetor[i] = y;
                vetor[n] = x;
            }
            n = n - 2;
        }

        n = controle_n;
        for (i = 0; i < n; i++) {
            System.out.printf(" " + vetor[i]);
        }
        System.out.printf("\n");
    }

}
