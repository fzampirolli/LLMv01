
import java.util.Scanner;

public class Questao3 {

      public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
     int l = 0,c = 0;
     int a[][]= new int [l][c];

     System.out.println("Matriz A:");LerMatriz(a);

     }

      public static int[][] LerMatriz(int m[][]){
          Scanner input= new Scanner (System.in);

          int l, c;
          System.out.print("Numero de linhas:");
          l=input.nextInt();
          System.out.print("Numero de colunas:");
          c=input.nextInt();

          for (int i = 0; i <l; i++) {
              for (int j = 0; j <c; j++) {
                  System.out.println("Linha "+i+" coluna "+j+":");
                  m[i][j]=input.nextInt();

              }

          }
      return m;
      }

}
