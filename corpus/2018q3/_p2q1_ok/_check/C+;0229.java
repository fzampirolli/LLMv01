
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        int n = 0;
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o tamanho do vetor");
        n = leitor.nextInt();
        int x, y;
        int V[] = new int [n];
        System.out.println("Digite os valores do vetor V:");
        for (int i = 0; i < n; i++) {
            V[i] = leitor.nextInt();
        }
        y = n;
        for (int i = 0; i < ((int)(n/2)); i++) {
            if (V[i] > V[y]) {
                x = V[y];
                V[y] = V[i];
                V[i] = x;
            }
            y--;
        }
        System.out.println("Semiparticionado total de V é :");
        for (int i = 0; i < n; i++) {
            System.out.println(V[i]);
        }
    }
}