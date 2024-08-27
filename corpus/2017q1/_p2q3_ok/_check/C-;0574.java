
import java.util.Scanner;
public class JavaApplication2 {
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println ("Digite quantas linhas tem a matriz A:");
    int L = scan.nextInt();
    System.out.println ("Digite quantas colunas tem a matriz A:");
    int C = scan.nextInt();
    int A [][] = new int [L][C];
    LerMatrizA (A, L, C); 
    ImprimeMatrizA (A, L, C); 

    System.out.println ("Digite quantas linhas tem a matriz B:");
    int K = scan.nextInt();
    System.out.println ("Digite quantas colunas tem a matriz B:");
    int M = scan.nextInt();
    int B [][] = new int [K][M];
    ImprimeMatrizB (B, K, M); 

    }

public static void LerMatrizA ( int A[][], int L, int C ){
    Scanner scan = new Scanner (System.in);
    System.out.println ("Digite os valores da matriz:");
    for ( int i=0 ; i < L ; i++ ){
    for ( int j=0 ; i < C ; j++ ){
        A[i][j] = scan.nextInt ();
    }
    }

}

public static void ImprimeMatrizA (int A [][], int L, int C){
    Scanner scan = new Scanner (System.in);
    for ( int i=0; i < L ; i++) {
        for ( int j=0 ; j <C ; j++){
            A [i][j] = scan.nextInt();
            System.out.print (A[i][j]+ " "); 
        }
        System.out.print(" ");
    }
}

public static void ImprimeMatrizB (int B [][], int K, int M){
    Scanner scan = new Scanner (System.in);
    for ( int i=0; i < K ; i++) {
        for ( int j=0 ; j <M ; j++){
            B [i][j] = scan.nextInt();
            System.out.print (B[i][j]+ " ");
        }
        System.out.print(" ");
    }

}

}
