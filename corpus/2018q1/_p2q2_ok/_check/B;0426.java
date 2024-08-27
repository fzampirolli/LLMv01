
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String vetorNome[] = new String[35];
        String vetorAcento[] = new String[35];
        String acento = "0a";

        pesquisarNome(vetorAcento, vetorNome, acento);
    }

    public static void pesquisarNome(String vetorAcento[], String vetorNome[], String acento) {
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 35; i++) {
            System.out.print("Cadastre o " + (i + 1) + "º nome: ");
            vetorNome[i] = ler.next();
            System.out.print("Cadastre o " + (i + 1) + "º acento: ");
            vetorAcento[i] = ler.next();
        }
        System.out.print("Digite o acento que deseja procurar: ");
        acento = ler.next();

        for (int i = 0; i < 35; i++) {
            if (vetorAcento[i].equals(acento)) {
                System.out.println("Acento " + vetorAcento[i] + " de: " + vetorNome[i]);
            } else if (!vetorAcento[i].equals(acento)) {
                System.out.println("acento não existe");
            }
        }
    }

}
