
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {

        int L, C;
        int MatrizA[][], MatrizB[][];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número par para a quantidade de linhas da matriz: ");
        L = sc.nextInt();

        System.out.println("Digite um número par para a quantidade de colunas da matriz: ");
        C = sc.nextInt();

        MatrizA = new int[L][C];
        MatrizB = new int[L][C];

        MatrizA = LerMatriz(MatrizA, L, C);

        MatrizB = CriarMatrizB(MatrizA, L, C);

        System.out.println();
        System.out.println("a) Matriz A: ");
        ImprimeMatriz(MatrizA, L, C);
        System.out.println("b) Matriz B: ");
        ImprimeMatriz(MatrizB, L, C);

    }

    private static int[][] LerMatriz(int[][] Matriz, int L, int C) {

        Scanner sc = new Scanner(System.in);
        for(int n = 0; n < L; n++)
        {
            for(int m = 0; m < C; m++)
            {
                System.out.print("Digite a posição [" + n + "][" + m + "] da matriz: ");
                Matriz[n][m] = sc.nextInt();

            }
        }
        return Matriz;
    }

    private static int[][] CriarMatrizB(int[][] Matriz, int L, int C) {
        int maiorNum = 0;
        int MatrizB[][] = new int[L][C];
        for(int n = (L/2); n < L; n++)
        {
            for (int m = (C/2); m < C; m++)
            {
                if (maiorNum < Matriz[n][m])
                {
                    maiorNum = Matriz[n][m];
                }
            }
        }

        for(int n = 0; n < L; n++)
        {
            for(int m = 0; m < C; m++)
            {
                if(n >= (L/2) && m >= (C/2))
                {
                    MatrizB[n][m] = maiorNum;
                }
                else
                {
                    MatrizB[n][m]= 0;
                }

            }
        }
        return MatrizB;
    }

    private static void ImprimeMatriz(int[][] Matriz, int L, int C) {
        for(int n = 0; n < L; n++)
        {
            for(int m = 0; m < C; m++)
            {
                System.out.print(Matriz[n][m]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
