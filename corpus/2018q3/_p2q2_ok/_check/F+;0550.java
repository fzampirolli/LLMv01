
import java.util.Scanner;

public class Exercicio2p2 {

    public static void main(String[] args) {

        Scanner x = new Scanner (System.in);
        int i, j; 
        int cpreta=0, cbranca=0, r=0;

        int n = x.nextInt();

         int A[][]= new int [n][n];

         for( i = 0; i<n; i++){
            for( j = 0; j<n; j++){
                A[i][j] = x.nextInt();
            }
         }

         for ( i = 0; i<n; i++){
             for( j = 0; j<n;j++){

             cpreta += A[0][1];
             cbranca += A[0][0];

             if(cpreta==cbranca){
                 r=2;
             }else if (cpreta>cbranca){
                 r=0;
             }else{
                 r=1;
             }
             }

         }
         System.out.println(cpreta +" "+ cbranca+" "+ r);
    }

}
