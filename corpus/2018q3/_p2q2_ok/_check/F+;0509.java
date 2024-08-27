
import java.util.Scanner;

public class P2Questao2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o tamanho de um dos lados do tabuleiro");
        int n = leitor.nextInt();
        while (n<2 || n>20) {
            System.out.println("Para o lado do tabuleiro, favor digitar um número entre 2 e 20");
            n = leitor.nextInt();
        }
        int tab[][] = new int[n][n];    

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.println("Digite o valor da posição "+ i +", "+ j);
                tab[i][j] = leitor.nextInt();
            }
        }
        int contpreta=0, contbranca=0;

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i>0)
                    contpreta= contpreta+tab[i-1][j];
                if (j>0)
                    contbranca= contbranca+tab[i][j-1];

            }
        }
    }
}
