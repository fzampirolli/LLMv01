
import java.util.Scanner;
public class 2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n, i, j, p = 0, b = 0 ,r=0;

        n=entrada.nextInt();

        int A[][]= new int [n][n];
        for(i=0; i<=n-1; i++){
            for(j=0; j<=n-1; j++){
        A[i][j]=entrada.nextInt();
            }
        }

        for(i=0; i<=n-1; i++){
            for(j=0; j<=n-1; j++){
                         p = p + (A[i][j]);

                for(i=1; i<=n-1; i++){
                    for(j=0; j<=n-1; j++){
                             b = b + (A[i][j]);
                    }
                }
              if(p>b){
                r=0;
              }
                else if (p<b){
                r=1;
                } 
                    else {
                       r=2;
                        }
                    }
                }
                     System.out.println(" " + b + " " + p + " " + r);
    }
}