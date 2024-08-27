
import java.util.*;

public class Questao3 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = 4;
     int A[][]= new int [n][n];
     int B[][]= new int [n][n];
     for (int i=0; i<n; i++){
            for ( int j=0; j<n; j++){
                A[i][j]=(int) (Math.random()*10);
            }}

        imprimematriz(A,n);
        B = matriztransposta(A,n);
        int maior = m(A,n);
        System.out.println(maior);

    }
    static void imprimematriz (int Mat[][], int n){

        for (int i=0; i<n; i++){
            for ( int j=0; j<n; j++){
                System.out.print(Mat[i][j]);
            }
             System.out.println("");
        }
    }
    public static int [][] matriztransposta(int B[][],int n){
         int C[][] = new int [n][n];
        for (int i=0; i<n; i++){
            for ( int j=0; j<n; j++){
                if ( j == i){
                  C[i][j]= B[i][j];
                }else{
                    C[i][j]= B[j][i];
                }
            }

    }
    return C;   
    }
    public static int m ( int A[][], int n){
        int maior=0;

        for (int i=0; i<n; i++){
            for ( int j=0; j<n; j++){
                if(j>i){
                    if(maior<A[i][j]){
                        maior = A[i][j];
                    }
                }
            }
        }
        return maior;
        }
}
