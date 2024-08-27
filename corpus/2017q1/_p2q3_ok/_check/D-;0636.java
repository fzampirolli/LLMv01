
import java.util.*;
public class Matriz {

    public static void main(String[] args) {

        System.out.println("Digite L: ");
        Scanner scan= new Scanner(System.in);
        int L=scan.nextInt();

        System.out.println("Digite C: ");
        int C=scan.nextInt();

        int A[][]= new int [L][C];
        A = LerMatriz(L,C);

    }
    public static int [][] LerMatriz(int m, int n){
        int i, j;
        int Q[][]=new int[m][n];
        Scanner ler=new Scanner(System.in);
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println( "Digite ["+i+"]["+j+"]");
                Q[i][j]=ler.nextInt();     
            }

        }
        return Q;
    }

    public static int [][] B(int matriz [][]){

    }

}
