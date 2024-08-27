
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, i = 0, j = 0, x = 0, y = 0;
        int a[][] = new int [n][n];

        System.out.println();
        n = scan.nextInt();

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++)

            System.out.println(+ a[i][j]);
        }
    }       
}
