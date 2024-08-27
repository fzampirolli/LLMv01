
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 2, c;
        String[] vetorNome = new String[n];
        String[] vetorAcento = new String[n];
        String nome;

        System.out.println("Digite o nome do usuário  e sua respectiva poltrona: ");
        preencher(vetorNome, vetorAcento);

        System.out.println("Digite o nome do usuário que deseja pesquisar o acento: ");
        nome = input.next();

        c = pesquisarAcento(vetorNome, vetorAcento, nome);
        System.out.println(vetorAcento[c]);
        if (c == 0) {
            System.out.println("Pssageiro não existe.");
        }

    }

    public static void preencher(String[] a, String[] b) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = input.next();
            a[i] = input.next();
        }
    }

    public static int pesquisarAcento(String[] a, String[] b, String n) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                j = i + 1;
            }

        }
        return j;
    }

}
