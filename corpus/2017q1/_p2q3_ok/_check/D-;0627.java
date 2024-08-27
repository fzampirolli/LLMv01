
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
         int A[][] = new int[4][4];
         int B[][] = new int[4][4];
        LeMatrizA(A);
        LeMatrizB(B, A);
    }

public static void LeMatrizA(int n[][]){
 Scanner ler = new Scanner(System.in);

 for (int i = 0; i <4; i++)
 {
 for (int j = 0; j <4; j++)
 {
      System.out.printf("Entre com o valor matriz "  +" [%d][%d]: ", i + 1, j + 1);
      n[i][j] = ler.nextInt();
 }
 }
 } 

public static void LeMatrizB(int m[][], int n[][] ){
 Scanner ler = new Scanner(System.in);

 for (int i = 0; i <4; i++)
 {
 for (int j = 0; j <4; j++)
 {
      if (i==00||i==1)
            {
     if (j==2||j==3)
       {

      m[i][j] = 0 ;
     }
        }
     else
     {
          m[i][j] =  n[i][j];
     }

     }
 }

  for (int i = 0; i <4; i++)
 {
 for (int j = 0; j <4; j++)
 {

           System.out.print(m[i][j]);

     }
 }

 } 

}
