
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int C, L;
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite quantas linhas sua matriz terá (número par):");
        L = scan.nextInt();
        System.out.println("\nDigite quantas colunas sua matriz terá (número par):");
        C = scan.nextInt();
        int A[][] = new int [L][C];
        int B[][] = new int [L][C];
        LeituraMatriz(A,L,C);
        CriarMatriz (A,B,L,C);
        imprimirMatriz (A,L,C);
        imprimirMatriz (B,L,C);

    }
    public static void LeituraMatriz (int M1[][], int L, int C){
        int i, j;
        int A[][] = new int [L][C];
        Scanner scan = new Scanner (System.in);
        for (i=0; i<L; i++){
            for (j=0; j<C; j++){
                System.out.println("\nDigite um número:");
                A[i][j] = scan.nextInt();
            }
        }
       }
    public static void CriarMatriz (int M2[][],int M3[][], int L,int C){
        int i, j, k=0;
        for (i=0; i<L/2; i++){
            for (j=0; j<C/2;j++){
                if (M2[i][j]<=k){
                    k = M2[i][j];
                }
            }
        }
        for (i=0;i<L;i++){
            for (j=0;j<C;j++){
            if (i<=L/2 && j<=C/2){
                M3[i][j] = k;
            } else{
               M3[i][j] = 0;
        }
        }
    }
    }
    public static void imprimirMatriz (int M4 [][],int L, int C){
        int i,j;
        for (i=0;i<L;i++){
            for (j=0;j<C;j++){
                System.out.println(M4[i][j]);
            }
        }
    }
}
