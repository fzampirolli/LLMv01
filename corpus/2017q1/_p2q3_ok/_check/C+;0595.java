
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int L;
      int C;

      System.out.println("Digite o Valor da linha");
      L = entrada.nextInt();
      System.out.println("Digite o Valor da coluna");
      C = entrada.nextInt();
      int A[][] = new int[L][C];
      int B[][] = new int[L][C];

      InsereMatriz(A,L,C);

      B = CriaMatriz(A,L,C);  

      PrintaMatriz(A,L,C);
      PrintaMatriz(B,L,C);

    }

public static void InsereMatriz(int Mat1[][],int L, int C) {
    Scanner entrada = new Scanner(System.in);
    int i;
    int j;
    for(i=0;i<L;i++){
        for(j=0;j<C;j++){
            System.out.println(i);
            System.out.println(j);
        System.out.print("Digite o Valor da linha "+i+" e da coluna"+j);
        Mat1[i][j] = entrada.nextInt();
        }
    }
}

public static int[][] CriaMatriz(int Mat1[][],int L, int C) {
    int i;
    int j;
    int n=0;
    int B[][] = new int[L][C];

    for(i=L/2;i<L;i++){
        for(j=0;j<C/2;j++){
         if(Mat1[i][j]>n){
             n=Mat1[i][j];
         } 
        }
    }

    for(i=0;i<L;i++){
        for(j=0;j<C;j++){
         if(i<L/2 || j>=C/2 ){
             B[i][j] = 0;
         }
            else
         {
             B[i][j] = n;
         }

         }        
    } 
    return B;
}

public static void PrintaMatriz(int Mat1[][],int L, int C) {
    int i;
    int j;
    System.out.println("");
    for(i=0;i<L;i++){
        for(j=0;j<C;j++){
        System.out.print(" "+Mat1[i][j]+" ");

        }
        System.out.println("");
    }
}

}
