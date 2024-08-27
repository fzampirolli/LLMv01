
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner ent = new Scanner (System.in);
        int n, somapreta=0, somabranca =0, i,j,r; 

        n = ent.nextInt();

        int A[][] = new int [n][n];

        for( i= 0; i< n; i++){
            for( j=0; j<n; j++){
                A[i][j]= ent.nextInt(); 
            }

            System.out.println("");
        }

        for ( i = 0; i<n; i++) {
            for (j=0; j< n; j++){
                if((i+j)%2==0){
                    somapreta = somapreta + A[i][j];
                }
                else {
                    somabranca = somabranca + A[i][j];
                }
            }
        }

        if(somapreta> somabranca){
            r = 0;
        } 
        else if (somabranca == somapreta){
            r = 2;
        } 
        else {
            r = 1;
        }
        System.out.print(somapreta+" "+somabranca+" "+r);
    }

}
