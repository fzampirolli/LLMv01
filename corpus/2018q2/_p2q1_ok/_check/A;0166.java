
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        final int MAX = 50;
        int V[] = new int[MAX], maior = 0, k;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Preencher vetor :");
        for (int i = 0; i < MAX; i++) {

            V[i] = (int) (Math.random() * 72 - 21);
        }

        for (int cont = 0; cont < MAX; cont++) {
            System.out.println("A coluna " + cont + " é: " + V[cont]);  
        }
        System.out.println();
        System.out.println("A coluna 12 é: " + V[12]);  

        for (int cont = 0; cont < MAX; cont++) {
            if (V[cont] > V[12]) {
                maior = maior + 1;
            }
        }
        System.out.println("Existem " + maior + " número(s) maiore(s) que o da coluna 12"); 

        System.out.println("Digite K : ");
        k = entrada.nextInt();
        int cont2 = 0;
        for (int cont = 0; cont < MAX; cont++) {
            if (k == V[cont]) {
                System.out.println("Seu número se encontra na coluna: " + cont); 
                cont2 = cont2 + 1;
            }
        }
        if (cont2 == 0) {
            System.out.println("k não foi encontrado.");
        }
    }
}
