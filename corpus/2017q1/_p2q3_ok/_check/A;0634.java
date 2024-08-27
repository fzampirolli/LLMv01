
import java.util.Scanner;

public class Ex3 {

    public static void leMatriz(int[][] A,int L,int C){
        Scanner entrada=new Scanner(System.in);

        for(int i=0;i<L;i++){
            for(int j=0;j<C;j++){
                A[i][j]=entrada.nextInt();

            }
            System.out.println();
        }
    }
    public static void CriaB(int[][] B, int[][] A, int L, int C){
        Scanner entrada=new Scanner(System.in);

        int MAX=0;
        for(int i=L/2;i<L;i++){
            for(int j=C/2;j<C;j++){
                if(A[i][j]>MAX){
                    MAX=A[i][j];
                }
            }
        }
        for(int i=0;i<L;i++){
            for(int j=0;j<C;j++){
                if(j>=C/2 && i>=L/2){
                    B[i][j]=MAX;
                }
                else{
                    B[i][j]=0;
                }
            }
        }

    }

    public static void imprimMat(int A[][]){
        int L,C;
        L=A.length;
        C=A[0].length;

        for(int i=0;i<L;i++){
            for(int j=0;j<C;j++){
                System.out.print("["+A[i][j]+"]");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("L = ");
        int L=entrada.nextInt();
        System.out.print("C = ");
        int C=entrada.nextInt();

        int A[][]=new int[L][C];
        int B[][]=new int[L][C];

        leMatriz(A,L,C);
        CriaB(B,A,L,C);
        imprimMat(A);
        System.out.println();
        imprimMat(B);

    }

}
