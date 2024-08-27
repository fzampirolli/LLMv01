
import java.util.Scanner;

public class JavaApplicationex2 {

    public static void main(String[] args) {

        int n, i, j, acb, acw, count, acc = 0;
        int[][] matriz;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o tamanho do tabuleiro - numero de par linhas até 24 -");
        n = leia.nextInt();
        matriz = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Digite o número de feijões na posição");

                matriz[i][j] = leia.nextInt();

            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j = j + 2) {
                acb = matriz[i][j];
                acc = acc + acb;

            }
        }
    }
}
