
import java.util.Scanner;

public class 2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vetorNome[] = new String[45];
        String vetorDestino[] = new String[45];
        String destino;

        preencherNome(vetorNome);

        preencherDestino(vetorDestino);

        System.out.println();
        System.out.print("Informe um destino para pesquisa: ");
        destino = input.next();

        pesquisarNome(vetorNome, vetorDestino, destino);
    }

    private static String[] preencherNome(String[] vetorNome) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 45; i++) {
            System.out.print("Informe o nome do passageiro: ");
            vetorNome[i] = input.next();
        }
        return vetorNome;
    }

    private static String[] preencherDestino(String[] vetorDestino) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 45; i++) {
            System.out.print("Informe o destino do passageiro: ");
            vetorDestino[i] = input.next();
        }
        return vetorDestino;
    }

    private static void pesquisarNome(String[] vetorNome, String[] vetorDestino, String destino) {

        for (int i = 0; i < 45; i++) { 
            if (vetorDestino[i] == destino) {
                System.out.println(vetorNome[i] + " " + vetorDestino[i]);
            } else { 
                System.out.println("Não existe destino.");
            }
        }
    }
}
