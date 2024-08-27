
import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int npos, n;

        System.out.print("Digite um numero n positivo entre 2 e 18: ");
        npos = entrada.nextInt();
        System.out.print("Digite o tamanho desejado da matriz n x n: ");
        n = entrada.nextInt();
        int A[][] = new int [n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.println("Digite o número de milhos na posição i" + (i+1)+ " e posição j"+ (j+1));
                A[i][j] = entrada.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            System.out.println(" ");
            for (int j=0; j<n; j++){
                System.out.print(A[i][j] + " ");
            }
        }

        }

    }
