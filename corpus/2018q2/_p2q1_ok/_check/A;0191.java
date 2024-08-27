
import java.util.Scanner;

public class ProvaQ1 {

    public static void main(String[] args) {
        final int MAX = 50;
        int cont = 0;
        int j = 0;
        int V[] = new int[MAX];
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencher vetor:");
        for (int i = 0; i < MAX; i++) {
            V[i] = (int) (Math.random() * 72 - 21);
        }

        System.out.println("Imprimir vetor:");
        for (int i = 0; i < MAX; i++) {

            System.out.println(V[i]);
        }
        for (int i = 0; i < MAX; i++) {
            if (V[i] > V[9]) {
                cont++;
            }
        }
        System.out.printf("Existem %d elementos maiores do que o seguinte elemento de índice nove %d.\n", cont, V[9]);

        System.out.println("Digite um número inteiro:");
        int k = sc.nextInt();
        for (int i = 0; i < MAX; i++) {
            if (k == V[i]) {
                System.out.println(k + " ocorreu na posição " + i);
             j++;
            } 

        }
        if(j==0){
            System.out.println(k+" não ocorre no vetor");
        }
    }

} 
