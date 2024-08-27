
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, j, n, preto=0, branco=0, r;

        n = entrada.nextInt();
        int V[][] = new int [n][n];

        for (i=0; i<n;i++) {
            for (j=0; j<n; j++) {
                V[i][j] = entrada.nextInt();
            }
        }

        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if(j==i || j==i+2) {
                    preto = preto + V[i][j];
                }

                else {
                    branco = branco + V[i][j];
                }
            }
        }

        if (preto>branco) {
            r=0;
        }
        else if (preto<branco) {
            r=1;
        }
        else {
            r=2;
        }

        System.out.println(preto+" " +branco+ " "+r );
    }
}