
import java.util.Scanner;
import javafx.scene.shape.Line;
public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome, acento, vetorNome[] = new String [15], vetorAcento[] = new String [15];
        int i;

        for (i = 0; i < 15; i++) {
            System.out.println("Escreva o nome do(a) passageiro(a): ");
            vetorNome[i] = entrada.nextLine();
        }
        for (i = 0; i < 15; i++) {
            System.out.println("Insira o número do acento correspondente: ");
            vetorAcento[i] = entrada.nextLine();
        }
        System.out.println("Insira o nome do(a) passageiro(a): ");
        nome = entrada.nextLine();

        acento = pesquisarAcento(vetorNome, vetorAcento, nome);

        System.out.println(acento);
    }
    public static String pesquisarAcento(String[] vetorNome, String[] vetorAcento, String nome) {

        int i = 0;
        String a = null;

        for(i = 0; i < 15; i++) {
            if (vetorNome[i] == nome) {
                a = vetorAcento[i];
            }
            else {
                a = " ";
            }
        }
        return a;
    }
}
