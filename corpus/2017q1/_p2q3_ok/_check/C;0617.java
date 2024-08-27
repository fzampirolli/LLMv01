
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        int[][] A;
        Scanner tecl = new Scanner(System.in);
        System.out.print("digite a quantidade de linhas: ");
        int L = tecl.nextInt();
        System.out.print("digite a quantidade de colunas: ");
        int C = tecl.nextInt();
        A = new int[L][C];

        LerMatriz(A, L, C);

        ImprimirMatriz(A, L, C);

    }

    public static int[][] LerMatriz (int[][] m,int l,int c ){

         Scanner tecl = new Scanner(System.in);
        for (int i = 0; i< l; i++){
            for(int j=0; j< c; j++){
                System.out.print("digite um número para a matriz A: ");
                m[i][j] = tecl.nextInt();
            }

        }
        return m;
    }

    public static void ImprimirMatriz (int[][] m, int l, int c ){
        for(int i=0; i<l; i++){
            for(int j=0; j< c; j++){
                 System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
