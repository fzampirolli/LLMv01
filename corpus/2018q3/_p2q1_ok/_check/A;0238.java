
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n, i, aux = 0;

        System.out.println("Digite o valor de n: ");
        n = scan.nextInt();
        int V[] = new int [n];

        System.out.println("Digite os valores do vetor V:");
        for (i = 0; i < n; i++) {
            V[i] = scan.nextInt();
        }

        for (i = 0; i < (n/2); i++) {
            if (V[i] < V[n-i-1]) {
                aux = V[n-i-1];
                V[n-i-1] = V[i];
                V[i] = aux;
            }
        }
        System.out.println("O semiparticionado total de V será o vetor: ");
        for (i = 0; i < n; i++) {
            System.out.println(V[i]);
        }
    }
}
