
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int l , c;
        System.out.println("Digite o número de linhas da matriz :");
        l= scan.nextInt();
        System.out.println("Digite a quantidade de colunas :");
        c= scan.nextInt();
        int A [][]= new int[l][c];
        LerMatriz(A , l, c);
        int B=NovaMatriz(A , l , c);

    }
    public static void LerMatriz( int M[][],int l , int c){
         Scanner scan = new Scanner(System.in);
        for( int i=0 ; i<l ; i++){
            for (int j=0; j<c ; j++){
                System.out.println("Digite o valor da linha " +(i+1)+ " e coluna" +(j+1));
                M[i][j]= scan.nextInt();
            }
        }
    }
    public static int NovaMatriz(int C[][],int l, int c){
        int aux=0;
        int N[][]=C;
        for( int i=(l/2-1) ; i<l ; i++){
            for (int j=0; j<(c/2-1) ; j++){
              if(C[i][j]>aux){
                  aux=C[i][j];
            }
            }
        }    
        for( int i=(l/2-1) ; i<l ; i++){
            for (int j=(c/2-1); j<c ; j++){
              N[i][j]=aux; 
            }
        }  
        for( int i=0 ; i<(l/2-1) ; i++){
            for (int j=0; j<c ; j++){
              N[i][j]=0;
            }
        }
        for( int i=(l/2-1) ; i<l ; i++){
            for (int j=(c/2-1); j<c ; j++){
                N[i][j]=0;
            }
        } 
       return N;
    }   
    }
