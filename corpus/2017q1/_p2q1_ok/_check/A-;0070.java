
import java.util.Scanner;

public class P23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o número de linhas: ");
        a = teclado.nextInt();
        while (a % 2 != 0) {
            System.out.println("Erro! O número de linhas deve ser par. Digite novamente: ");
            a = teclado.nextInt();
        }
        System.out.println("Digite o número de colunas: ");
        b = teclado.nextInt();
        while (b % 2 != 0) {
            System.out.println("Erro! O número de colunas deve ser par. Digite novamente: ");
            b = teclado.nextInt();
        }
        int A[][] = new int[a][b];

        ImprimirMatrizes(A);
        ImprimirMatrizes(B);

    }

    public static void LerMatriz(int C[][]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
           C[i][j] = teclado.nextInt();

            }
        }
    }

    public static void ImprimirMatrizes(int C[][]) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(C[i][j]);
            }
        }
    }
}
