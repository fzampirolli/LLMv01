
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 20, n, m;
        System.out.println("Digite o tamnho do seu vetor: ");
        n = input.nextInt();
        int[] v = new int[n];
        System.out.println("Preencha o seu vetor: ");
        for (int c = 0; c < n; c++) {
            v[c] = input.nextInt();
        }
        m = maior(v, n, k);

        if (m > 0) {
            System.out.println("Existe numero maior que 20 em seu vetor.");
        } else {
            System.out.println("Não existe numero maior que 20 em seu vetor.");
        }

    }

    public static int maior(int[] c, int n, int k) {

        int j = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > k) {
                j = j + 1;
            }
        }
        return j;
    }
}
