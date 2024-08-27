
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);

        int L, C;
        System.out.print("Informe a quantidade de linhas: ");
        L=entrada.nextInt();
        while (L%2!=0){
        System.out.print("A quantidade de linhas deve ser par.\nInforme a quantidade de linhas: ");
        L=entrada.nextInt();
        }

        System.out.print("Informe a quantidade de colunas: ");
        C=entrada.nextInt();
        while (C%2!=0){
        System.out.print("A quantidade de colunas deve ser par.\nInforme a quantidade de colunas: ");
        C=entrada.nextInt();  
        }

        int A[][]=new int [L][C];
        int B[][]=new int [L][C];

        LerMatriz(A, L, C);
        System.out.print("a) Matriz A\n");
        ImprimeMatriz(A, L, C);
        B=CriarMatrizB(A, L, C);
        System.out.print("\nb) Matriz B\n");
        ImprimeMatriz(B, L, C);
    }

    public static void LerMatriz(int m[][], int L, int C){
        Scanner entrada=new Scanner (System.in);
        for (int i=0; i<L; i++){
            for (int j=0; j<C; j++){
                System.out.print("Informe o valor da posição ["+i+"]["+j+"] da matriz: ");
                m[i][j]=entrada.nextInt();
            }
        }
    }

        public static int[][] CriarMatrizB(int A[][], int L, int C){
        int maior=0;
        int B[][]=new int [L][C];
        int i, j;
        for (i=0; i<L/2; i++){
            for (j=C/2; j<C; j++){
                maior=A[L/2-1][C/2-1];
                if (A[i][j]>maior){
                    maior=A[i][j];    
                }
            }
        }
        for (i=0; i<L/2; i++){
            for (j=C/2; j<C; j++){
                B[i][j]=maior;
            }
        }
        return B;
    }

    public static void ImprimeMatriz(int m[][], int L, int C){
        for (int i=0; i<L; i++){
            for (int j=0; j<C; j++){
                if (j==C-1){
                    System.out.print(m[i][j]+"\n");
                }else {
                    System.out.print(m[i][j]+"\t");
                }
            }   
        }
    }
}
