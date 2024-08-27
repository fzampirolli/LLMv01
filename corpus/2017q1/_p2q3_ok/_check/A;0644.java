
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEntre com o número de Linhas da Matriz: \n");
        int L = entrada.nextInt();
        System.out.print("\nEntre com o número de Colunas da matriz: \n");
        int C = entrada.nextInt();

        int A[][] = new int[L][C];
        int B[][] = new int[L][C];

        LeMatriz(A, L, C);
        B = CriaB(A,L,C);

        System.out.print("\nA matriz A é: \n"); 
        ImprimeMatriz(A, L, C);
        System.out.print("\nA matriz B é: \n");
        ImprimeMatriz(B, L, C);

    }

    public static int[][] LeMatriz(int m[][], int linha, int coluna) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nValores da matriz: \n");
        for (int i = 0; i < linha; i++) {
            System.out.printf("Informe os elementos da linha " + (i + 1) + "\n");
            for (int j = 0; j < coluna; j++) {
                System.out.printf("coluna " + (j + 1) + " :");
                m[i][j] = entrada.nextInt();
            }
            System.out.printf("\n");
        }

        return m;
    }

    public static int[][] CriaB(int m[][], int linha, int coluna) {
        Scanner entrada = new Scanner(System.in);

        int M[][] = new int [linha][coluna];
        int L = linha / 2;
        int C = coluna / 2;
        int maior = 0;

        for (int i = 0; i < L; i++) {
            for (int j = C; j < coluna; j++) {   
                if (maior<m[i][j]){
                    maior = m[i][j];
                }                
            }
            System.out.printf("\n");
        }

        for (int i = 0; i < L; i++) {
            for (int j = C; j < coluna; j++) {   
                 M[i][j] = maior ;
                }                
            }
            System.out.printf("\n");

        return M;
    }

    public static int[][] ImprimeMatriz(int m[][], int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
        return m;
    }

}
