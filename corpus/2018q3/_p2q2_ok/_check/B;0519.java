
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        int n, r;
        int somapretos=0, somabrancos=0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();        
        int A[][] = new int[n][n];

        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[0].length; j++){
                A[i][j] = sc.nextInt();

                if((i+j)%2==0){
                    somapretos = somapretos+A[i][j];
                }else{
                           somabrancos = somabrancos + A[i][j]; 
                            }
            }

        }

            if(somapretos>somabrancos){
                r=0;
            }if(somabrancos>somapretos){
                r=1;
            }else{
                r=2;
            }

            System.out.println(somapretos+" "+somabrancos+" "+r);

    }
}
