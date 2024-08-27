
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int i, n = 35;
        String acento;

        String vetorNome[] = new String[n];
        String vetorAcento[] = new String[n];

        for (i = 0; i < n; i++) {
            System.out.println("Entre com o nome " + i + ":");
            vetorNome[i] = 
        }
        for (i = 0; i < n; i++) {
            System.out.println("Entre com o acento " + i + ":");
            vetorAcento[i] = 
        }

        String pesquisarNome = Entrada.nextLine();
        for (i = 0; i < n; i++) {
            if (vetorNome[i] == pesquisarNome) {
                System.out.println("Passageiro (a): " + vetorNome[i] + "| Acento: " + vetorAcento[i]);
            }
            else{
                System.out.println(" ");
            }
        }
    }
}
