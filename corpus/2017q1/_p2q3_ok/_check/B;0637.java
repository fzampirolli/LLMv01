
import java.util.Scanner;

public class PROVAQ3 {

    public static void main(String[] args) {
      int A[][] = null;
      int B[][];  

      A = LerMatriz(A);
      B = GeraMatriz(A);

      System.out.println("Matriz A:");
      ImprimeMatriz(A);
      System.out.println("Matriz B:");
      ImprimeMatriz(B);
    }

    public static int[][] LerMatriz(int mat[][]){
      Scanner entrada = new Scanner(System.in);  
      int L = 1, C =1 ;
      while(L%2 != 0){
      System.out.println("L=");
      L = entrada.nextInt();}
      while(C%2 != 0){
      System.out.println("C=");
      C = entrada.nextInt();}
      int A[][] = new int[L][C];

        int i, j;

        for(i = 0; i < L ; i++){
            for(j = 0; j < C; j++){
                System.out.println("Insira o elemento da posição " + i + "x" + j + "da matriz:");
                A[i][j] = entrada.nextInt();
            }
        }
        return mat;
    }

    public static int[][] GeraMatriz(int mat[][]){
        int i, j, c = 0;

        for(i = 0; i < mat.length/2; i++){
            for(j = 0; j < mat[0].length/2; j++){
                if(mat[i][j] > c){
                    c = mat[i][j];

                }

            }
    }
        for(i = 0; i < mat.length; i++){
            for(j = 0; j < mat[0].length; j++){
                mat[i][j] = 0;
            }
    }
        for(i = 0; i < mat.length/2; i++){
            for(j = 0; j < mat[0].length/2; j++){
                mat[i][j]=c;
            }

    }

        return mat;
    }

    public static void ImprimeMatriz(int mat[][]){
        int i, j;

        for(i = 0; i < mat.length; i++){
            System.out.println(" ");
            for(j = 0; j < mat[0].length; j++){
            System.out.print(mat[i] + " ");

        }
        }

    }
}
