
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 2, k = 0;
        String p, a, dados;
        String vetorNome[] = new String[n];
        String vetorAcento[] = new String[n];

        while (k < n) {

            System.out.println("Insira o nome do passageiro: ");
            p = entrada.nextLine();
            vetorNome[k] = p;

            System.out.println("Insira o número do assento: ");
            a = entrada.nextLine();
            vetorAcento[k] = a;
            k++;
        }

        dados = pesquisarNome(vetorAcento[], vetorNome[], acento);

        System.out.println("O nome e o assento do passageiro são:" + dados);

    }

    public static String pesquisarNome(String vetorAcento[], String vetorNome[], int acento) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int K = 0, N = 2;

        System.out.println("Insira o nome do passageiro: ");
        nome = entrada.nextLine();

        while (K < N) {
            if (nome == vetorNome[K]) {

                return nome;

            } else {
                System.out.println("acento não existe");
            }
        }

    }

}
