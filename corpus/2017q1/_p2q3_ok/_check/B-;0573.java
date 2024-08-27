
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

    Scanner leia=new Scanner (System.in);

        int A [][]=new int [4][4];
        int B [][]=new int [4][4];

        A=LerMatriz(A);

        for (int l=2;l<4;l++)
        {
            for(int c=0;c<2;c++)
            {
                if (A[l][c]>A[2][1])
                {
                    B[l][c]=A[l][c];
                }
                else if (A[l][c]<A[2][1])
                {
                    B[l][c]=A[2][1];
                }
                else if (A[l][c]==A[2][1])
                {
                    B[l][c]=A[2][1];
                } 

            }
        }

        System.out.println(" A matrix A é : ");
        ImprimeMatriz(A);

      System.out.println("\n A matrix b é : ");
        ImprimeMatriz(B);

    }

 public static int[][] LerMatriz (int B[][]){
     int L[][]=new int [4][4];
      Scanner leia=new Scanner (System.in);
     for (int l=0;l<4;l++)
     {
         for(int c=0; c<4; c++)
         {
             System.out.println("Digite o elemento "+l+", "+ c);
             L[l][c]=leia.nextInt();
         }
     }
        return L ;

 }

    public static void ImprimeMatriz (int M[][]){

        int Matrix[][]=new int [M.length][M.length];
    for (int l=0;l<M.length;l++)
    {
        for (int c=0;c<M.length;c++)
        {
            System.out.print(" "+M[l][c]);
        }
    System.out.println("  ");
    }
    }

}
