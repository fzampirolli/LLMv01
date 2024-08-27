
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt(), i, aux;
        int V[] = new int[n];

        for(i = 0; i<n; i++){
            V[i] = entrada.nextInt();
        }

        for(i = 0; i<=n/2; i=i+2){
            if(V[i] < V[n-1-i]){
                aux = V[i];
                V[i] = V[n-1-i];
                V[n-1-i] = aux;
            }
        }

        for(i = 0; i<n; i++){
            System.out.print(V[i] + " ");
        }

    }

}
