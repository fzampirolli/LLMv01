
import java.util.Scanner;

public class 02 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
	int somaPreta = 0, somaBranca = 0, r;
        int A[][] = new int [n][n];
         for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
               A[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i<A.length; i++){
            for (int j = 0; j<A.length; j++){
                if ((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)){
                    somaPreta = A[i][j] + somaPreta;
                }
                else {
                    somaBranca = A[i][j] + somaBranca;
                }
            }
        }
        if (somaPreta == somaBranca){
            r = 2;
        }
        else if (somaPreta > somaBranca){
            r = 0;
        }
        else{
            r = 1;
        }
        System.out.println(somaPreta+" "+somaBranca+" "+r);
    }
}
