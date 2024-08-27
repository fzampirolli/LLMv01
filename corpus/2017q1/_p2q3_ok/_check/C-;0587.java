
import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
        int L, C;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho de linhas ");
        L = teclado.nextInt();
        while (L % 2 != 0){
            System.out.print("Numero deve ser par ");
            System.out.print(" Digite outro numero: ");
                    L = teclado.nextInt();
        }
        System.out.print("Digite o numero de colunas ");
        C = teclado.nextInt();
        while (C % 2 != 0){
            System.out.print("Numero deve ser par ");
            System.out.print("Digite outro numero: ");
            C = teclado.nextInt();
        }
        LerMatriz(L,C);

        }
    public static int[][] LerMatriz(int L, int C ){
        Scanner teclado = new Scanner(System.in);
        int A[][] = new int [L][C];
        for (int l = 0; l < L; l++){
            for (int c = 0; c < C; c++){
                System.out.print(" Digite os elementos da matriz ");
                A[l][c] = teclado.nextInt(); 
            }
        }
        return A;
      }
    public static int[][] CriarB(int A[][], int L, int C){
        int B[][] = new int [L][C];
        for (int l = 0; l < L/2; l++){
            for (int c = 0; c <C/2; c++){
                B[l][c] = 0;
            }
        }
        return B;
    }
}
