
import java.util.Scanner;

public class LeandroCorrochanoLopes {
    public static void LeMatriz(int mat[][],int c, int l){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                mat[i][j]= sc.nextInt();
            }
        }
    }
    public static int[][] CriaMatriz(int mat[][]){
        int l=mat.length, c=mat[0].length, maior=0;
        int m[][]=new int [l][c];

        for(int i=0;i<l;i++){
            for(int j=0;j<=c/2;j++){
                m[i][j]=0;
            }
        }

        for(int i=l/2; i<l;i++){
            for(int j=c/2; j<c;j++){
                m[i][j]=0;
            }
        }
        for(int i=0; i<=l/2; i++){
            for(int j=c/2; j>c; j++){
                if(m[i][j]>maior){
                    maior=m[i][j];
                }
            }
        }
        for(int i=0; i<=l/2; i++){
            for(int j=c/2; j>c; j++){
                m[i][j]=maior;
            }

        }
        return m;
    }
    public static void PrintaMatriz(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[0].length;j++){
                System.out.print(mat[i][j]+"  ");
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("L=");
      int l = sc.nextInt();
      System.out.print("C=");
      int c = sc.nextInt();
      int A[][]= new int [l][c];

      LeMatriz(A,c,l);
      int B[][]= CriaMatriz(A);
      PrintaMatriz(A);
      PrintaMatriz(B);
    }

}
