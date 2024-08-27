
import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int V [];
        int n, i, c = 0, t;

        System.out.println("Defina o tamanho do vetor");
        n = entrada.nextInt();
        V = new int [n];
        for (i = 0; i < n; i++){
            System.out.println("Defina o "+ (i+1) + "o valor do vetor");
            V[i] = entrada.nextInt();
        }
    for (i = 0; i < (n/2); i++){
        c = c + 1;
        if (V[i] < V[n - c]){
            t = V[n - c];
            V[n - c] = V[i];
            V[i] = t;
        }
        }
    System.out.println("O vetor V semiparticionado é:");
    for (i = 0; i < n; i++){
        System.out.println(V[i]);
    }
    }
}
