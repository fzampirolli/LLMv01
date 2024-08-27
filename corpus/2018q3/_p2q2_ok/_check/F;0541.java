
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int Entrada, branco = 0, preto=0;
        Entrada = scan.nextInt();
        int A[][] = new int [Entrada][Entrada];
        for(int i = 0 ; i < Entrada ; i ++) {
            for (int j = 0 ; j < Entrada ; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A.length ; j ++){

                if (i % 2 == 0 &&  j % 2 == 0 || i % 2 != 0 && j % 2 == 0 || i == 0 && j == 0)  {
                    branco = branco + A[i][j];

                } else {
		    preto += A[i][j];
		}
            }
        }
        System.out.println(branco+" "+preto);
    }
}
