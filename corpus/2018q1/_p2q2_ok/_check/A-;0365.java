
import java.util.Scanner;

public class P2qq2 {

    public static void main(String[] args) {

        String vetorNome[] = new String[45];
        String vetorDestino[] = new String[45];
        String destino;
        int i;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < 45; i++) {
            System.out.println("Informe o nome do passageiro " + (i + 1));
            vetorNome[i] = input.nextLine();

        }
        for (i = 0; i < 45; i++) {
            System.out.println("Informe o destino do passageiro " + (i + 1));
            vetorDestino[i] = input.nextLine();
        }
        System.out.println("Informe um destino: ");
        destino = input.nextLine();

        pesquisarNome(vetorDestino, vetorNome, destino);

    }

    public static String pesquisarNome(String vetorDestino[], String vetorNome[], String destino) {
        int i;
        String nome = null;

        for (i = 0; i < 45; i++) {
            if (vetorDestino[i].equals(destino)) {
                nome = vetorNome[i];
            } else {
                nome = " ";
            }
        }
        return nome;
    }

}
