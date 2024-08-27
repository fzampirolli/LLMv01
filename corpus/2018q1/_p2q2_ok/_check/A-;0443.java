
import java.util.Scanner;

public class Q2 {

    public static String pesquisarAcento(String nome1[], String acento[], String nome) {
        for (int j = 0; j < 15; j++) {
            if (nome1[j] == nome) {
                nome = acento[j];
            }
        }

        return nome;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String vetorNome[] = new String[15];
        String vetorAcento[] = new String[15];

        for (int i = 0; i < vetorNome.length; i++) {
            System.out.println("Digite o nome do passageiro: ");
            vetorNome[i] = entrada.nextLine();
            System.out.println("Digite o número do acento:");
            vetorAcento[i] = entrada.nextLine();
        }
        System.out.println("Pesquisar acento. \nDigite o nome do passageiro: ");
        String nome = entrada.nextLine();

        System.out.println("Acento do passageiro: " + pesquisarAcento(vetorNome, vetorAcento, nome));

    }

}
