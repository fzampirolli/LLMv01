
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite números pares em seguida, para servir de linha e coluna da Matriz A: ");
        int L = teclado.nextInt();
        int C = teclado.nextInt();
        int A[][] = new int [L][C];
        int B[][] = new int [L][C];

        A = LerMatriz(L, C);

        int a = (L/2); 
        int b = (C/2); 

        B = CriaMatrizB(a, b);

        System.out.println("Matriz A:");
        ImprimeMatriz(A, L, C);
        System.out.println("Matriz B:");
        ImprimeMatriz(B, L, C);

        }

    public static int[][] LerMatriz(int L, int C){
        Scanner teclado = new Scanner(System.in);
        int i, j;
        int Matrizona[][] = new int[L][C];

        for(i=0; i<L; i++){
            for(j=0; j<C; j++){
                System.out.print("Número ["+i+"]["+j+"]: ");
                Matrizona[i][j] = teclado.nextInt();
            }
        }
        return Matrizona;
    }

    public static int[][] CriaMatrizB(int a, int b){
        int A[][] = new int[a][b];
        int i, j;
        int maior = A[0][0];
        for(i=0; i<a; i++){
            for(j=0; j<b; j++){
                if((A[i][j]) > maior){
                    maior = A[i][j];
                }
            }
        }
        int B[][] = new int[(a*2)][(b*2)];
        for(i=0; i<(a*2); i++){
            for(j=0; j<(b*2); b++){
                if(i<=a && j<=b){
                    B[i][j] = maior;
                }else{
                    B[i][j] = 0;
                }
            }
        }
        return B;
    }

    public static void ImprimeMatriz(int Qualquer[][], int L, int C){
        int i, j;
        for(i=0; i<L; i++){
            for(j=0; j<C; j++){
                System.out.print(Qualquer[i][j]+" ");
            }System.out.println();
        }
    }
}