
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 35;
        String vetorNome[] = new String[n];
        String vetorAcento[] = new String[n];
        String acento = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do passageiro: ");
            vetorNome[n] = input.next();

            System.out.println("Digite o acento: ");
            vetorAcento[n] = input.next();
        }

        String resposta = pesquisarNome(vetorAcento, vetorNome, acento);

        if (resposta == "nome") {
            System.out.println(vetorNome[n]);
        } else if (resposta != "nome") {
            System.out.println("''");
        }

        if (resposta == "acento") {
            System.out.println(vetorAcento[n]);
        } else if (resposta != "acento") {
            System.out.println("Acento não existe");
        }
    }

    public static String pesquisarNome(String vetorAcento[], String vetorNome[], String acento) {
        Scanner input = new Scanner(System.in);
        int n = 35;

        vetorNome[n] = input.next();
        for (int i = 0; i < n; i++) {
            if (vetorNome[n] == vetorNome[n - 1]) {
                return "nome";
            }
        }
        vetorAcento[n] = input.next();
        for (int i = 0; i < n; i++) {
            if (vetorAcento[n] == vetorAcento[n - 1]) {
                return "acento";

            }
            return null;

        }
        return null;
    }
}
