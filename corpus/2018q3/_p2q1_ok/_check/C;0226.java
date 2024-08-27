
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        int n=0, i=0, aux;
        int V[];

        Scanner teclado = new Scanner(System.in);

        System.out.print("n?: ");
        n =  teclado.nextInt();
        V = new int[n];

        for (i = 0; i < n; i = i +1){
            System.out.print("V[" + i + "]?: ");
            V[i] = teclado.nextInt();
        }

        for (i = 0; i < n; i = i +1){

            if(V[i] < V[ n - 1 - i]){

                aux = V[i];
                V[i] = V[n - 1 - i];
                V[ n - 1 - i] = aux;

            }
        }

            for (i = 0; i < n; i = i +1){
            System.out.print(V[i] + "\t");
        }

    }

}
