
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número par de linhas: ");
        int l = entrada.nextInt();
        System.out.print("Digite um número par de colunas: ");
        int c = entrada.nextInt();
        int M[][] = new int[l][c];
        Le_Matriz(M);

        int B[][] = new int [l][c];
        for (int i=0; i<l; i++) {
            for (int j=0; j<c; j++) {
                B[i][j]=0;
            }
        }
        B = Matriz_B(M);

        System.out.println("\nMatriz A: ");
        Imprime_Matriz(M);
        System.out.println("\nMatriz B: ");
        Imprime_Matriz(B);
    }  
    public static void Le_Matriz (int M[][]) {
        Scanner entrada = new Scanner(System.in);
        int i, j;
        int l = M.length;
        int c = M[0].length;
        for (i=0; i<l; i++) {
            for (j=0; j<c; j++) {
                System.out.print("Digite o elemento "+i+"X"+j+": ");
                M[i][j] = entrada.nextInt();
            }
        }
    }
    public static int [][] Matriz_B (int M[][]) {
        int i, j, maior;
        int l = M.length;
        int c = M[0].length;
        int B[][] = new int[l][c];
        maior = M[0][0];
        for (i=0; i<l/2; i++) {
            for (j=0; j<c/2 ; j++) {
                if (M[i][j]>maior) {
                    maior = M[i][j];
                }
            }
        }
        for (i=0; i<l/2; i++) {
            for (j=0; j<c/2 ; j++) {
                B[i][j] = maior;
            }
        }
        return B;
    }
    public static void Imprime_Matriz (int M[][]) {
        int i, j;
        int l = M.length;
        int c = M[0].length;
        for (i=0; i<l; i++) {
            for (j=0; j<c; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
