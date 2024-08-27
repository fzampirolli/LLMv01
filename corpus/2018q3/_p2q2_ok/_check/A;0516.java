
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt(), i, j, somapreta = 0, somabranca = 0, r;
        int A[][] = new int[n][n];

        for(i = 0; i<n; i++){
            for(j=0; j<n; j++){
                A[i][j] = entrada.nextInt();
                if((i + j)%2 == 0){
                    somapreta = somapreta + A[i][j];
                } else{
                    somabranca = somabranca + A[i][j];
                }
            }
        }

        if(somapreta > somabranca){
            r = 0;
        } else if(somapreta < somabranca){
            r = 1;
        } else {
            r = 2;
        }

        System.out.println(somapreta + " " + somabranca + " " + r);

    }

}
