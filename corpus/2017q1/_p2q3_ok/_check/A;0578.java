
import java.util.Scanner;
public class 3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int L = 1;
        do {
            System.out.print("Digite um inteiro par para o número de linhas: ");
            L = entrada.nextInt();
        } while (L%2 != 0);
        int C = 1;
        do {
            System.out.print("Digite um inteiro par para o número de colunas: ");
            C = entrada.nextInt();
        } while (C%2 != 0);

        int[][] A = new int[L][C];
        LerMatriz(A, L, C);
        int[][] B = new int[L][C];
        CriarMatriz(A, B, L, C);
        System.out.println("\n Matriz A: ");
        ImprimeMatriz(A, L, C);
        System.out.println("\n Matriz B: ");
        ImprimeMatriz(B, L, C);
    }
    public static void LerMatriz(int[][] A, int l, int c){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Digite o elemento A["+i+"]["+j+"]: ");
                A[i][j] = entrada.nextInt();
            }
        }
    }
    public static void CriarMatriz(int[][] A, int[][] B, int l, int c){
        int maior = A[0][0];
        for (int i = 0; i < l/2; i++){
            for (int j = 0; j < c/2; j++){
                if (maior < A[i][j]){
                    maior = A[i][j];
                }
            }
        }
        for (int i = 0; i < l/2; i++){
            for (int j = 0; j < c/2; j++){
                B[i][j] = maior;
            }
        }
    }
    public static void ImprimeMatriz(int[][] M, int l, int c){
        for (int i = 0; i < l; i++){
            for (int j = 0; j < c; j++){
                System.out.print(" "+M[i][j]);
            }
            System.out.print("\n");
        }
    }
}
