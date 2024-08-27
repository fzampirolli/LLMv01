
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {

        int L, C;

        System.out.println("Digite a quantidade de linhas da matriz: ");
        Scanner sc = new Scanner (System.in);
        L= sc.nextInt();
        System.out.println("Digite a quantidade de linhas da matriz: ");
        C= sc.nextInt();

        int A[][]=LerMatriz(L, C);

        int B[][]=new int[L][C];
        B=ModificaMatriz(B, L, C);

        ImprimeMatriz(A, L, C);
        System.out.println();
        ImprimeMatriz(B, L, C);
    }

    public static int [][] LerMatriz(int a, int b){ 
        int i, j;
        int A[][] = new int [a][b];
        Scanner sc2 = new Scanner (System.in);
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print("Digite o elemento ("+i+")("+j+") da matriz: ");
                A[i][j]=sc2.nextInt();
            }
        }

        return A;
    }

    public static int [][] ModificaMatriz(int B[][], int a, int b){
        int i, j, maior=0;

        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                if(i<=(a/2) && j>=(b/2)){
                    if(B[i][j]>maior){
                        maior=B[i][j];
                    }
                }
            }
        }

         for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                if(i<=(a/2) && j>=(b/2)){
                   B[i][j]=maior;
                }
                else{
                    B[i][j]=0;
                }
            }
        }

        return B; 
    }

    public static void ImprimeMatriz(int X[][], int a, int b){
        int i, j;
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print(X[i][j]+" ");
            }
            System.out.println();  
        }    
    }   
}
