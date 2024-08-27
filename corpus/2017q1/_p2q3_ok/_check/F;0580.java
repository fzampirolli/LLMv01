
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int a = 0, b=0;

     System.out.println(Valores(a));
     System.out.println(Q4(b));

    }

    public static int[][] Valores( int A[][]) {
       Scanner sc = new Scanner (System.in);
     A[][]= new int [4][4];
     int i=0, j=0;

     for(i=0;i<3;i++){
         for(j=0;j<3;j++){     
     System.out.println("Digite os valores da matriz A: ");
     A[i][j]= sc.nextInt();
         }
         return A;

     }

     public static int[][] Q4( int B[][]) {
          Scanner sc = new Scanner (System.in);
          int B[][]= new int [4][4];
          int i=0, j=0;
          for(i=0;i<3;i++){
         for(j=0;j<3;j++){
          B[2][2] = A[2][2];
          B[3][2] = A[3][2];
          B[2][3] = A[2][3];
          B[3][3] = A[3][3];
         }
          }

          for(i=0;i<=3;i++){
         for(j=0;j<=3;j++){
            if (i=2 && j=2){
                B[i][j]=0;
            }
            if (i=2 && j=3){
                B[i][j]=0;
            }
            if (i=3 && j=2){
                B[i][j]=0;
            }
            if (i=3 && j=3){
                B[i][j]=0;
            }

         }
          }

          return B;
     }