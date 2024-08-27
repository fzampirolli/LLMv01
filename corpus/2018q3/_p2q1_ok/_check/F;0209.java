
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0;

        System.out.printf("Digite um número inteiro:");
        n = scan.nextInt();

        int V[] = new int [n];

        for(i = 0; i < n; i++){
            System.out.printf("Digite um número:");
            n = scan.nextInt();
                n = n + (n-1);

        }

        System.out.println(+V[n]);

    }
}
