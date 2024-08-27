
import java.util.Scanner;

public class exerc1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.printf("Digite um valor positivo ímpar: ");
        n = entrada.nextInt();

        int V[] = new int [n];

        for(int i=0; i<n; i++){
            System.out.printf("%d Elemento: ", i+1);
            V[i] = entrada.nextInt();
        }

        int dois=0, aux;
        for(int i=0; i<=n/2+1; i++){
            if(i%2==1){
                if(V[i]>V[n-dois]){
                    aux = V[i];
                    V[i] = V[n-dois];
                    V[n-dois] = aux;
                }
            }
            dois = dois + 2;
        }

        System.out.printf("O semiparticionado ímpar de V é:\n");
        for (int i=0; i<n; i++){
            System.out.printf("%d ", V[i]);
        }
    }

}
