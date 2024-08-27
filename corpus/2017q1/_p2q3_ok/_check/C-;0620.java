
import java.util.Scanner;

public class RafaelCerioniTognato {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        System.out.println("Digite o número de linhas e colunas que desjea:");
        n = teclado.nextInt();
        int A[][] = new int [n][n];
        LeMatriz(A, n);
        int B[][] = new int [n][n];
        MatrizB(B,A,n);
        ImprimeMatriz(A,n);
        ImprimeMatriz(B,n);
    }

    public static void LeMatriz( int m[][], int n){
        Scanner teclado = new Scanner(System.in);
        int lin = 0, col = 0;
        for(lin = 0; lin < n; lin++){
            for(col = 0; col < n; col++){
                System.out.println("Digite o valor que deseja para a matriz A na linha " + lin + " e coluna " + col);
                m[lin][col] = teclado.nextInt();
            }
            col = 0;
        }
    }

    public static void MatrizB (int m[][], int d[][], int n){
        int lin = 0, col = 0, a = n - (n/2);
        for(lin = 0; lin < a; lin++){
            for(col = 0; col < a; col++){
                m[lin][col] = d[lin][col];
            }
            col = 0;
        }
        lin = a;
        col = a;
        for(lin = a; lin < n; lin++){
            for(col = a; col < n; col++){
                m[lin][col] = 0;
            }
            col = 0;
        }
    }

    public static void ImprimeMatriz(int m[][], int n){
        int lin = 0, col = 0;
        System.out.println("Imprimindo a matriz:");
        for(lin = 0; lin < n; lin++){
            for(col = 0; col < n; col++){
                System.out.println("\n" + m[lin][col]);
            }
            col = 0;
        }
    }

}
