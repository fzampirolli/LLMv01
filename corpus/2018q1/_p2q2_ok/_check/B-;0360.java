
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] vetorNome = new String[25];
        String[] vetorDestino = new String[vetorNome.length];

        for (int i = 0; i < vetorNome.length; i++) {
            System.out.print("Digitar o nome do " + (i+1) + "º passageiro: ");
            vetorNome[i] = entrada.next();
        }

        for (int i = 0; i < vetorNome.length; i++) {
            System.out.print("Digitar o destino do " + (i+1) + "º passageiro: ");
            vetorDestino[i] = entrada.next();
        }

        System.out.print("Digite o nome da pessoa que deseja saber o destino: ");
        String nome = entrada.next();

        for (int i = 0; i < vetorNome.length; i++) {
            if (nome.equalsIgnoreCase(vetorNome[i])) {
                System.out.println("O destino da " + vetorNome[i] + " é: " + vetorDestino[i]);
                break;
            } else {
                System.out.println("Passageiro não existe");
                break;
            }
        }
    }
}
