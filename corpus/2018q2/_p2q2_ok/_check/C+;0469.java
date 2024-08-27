
import java.util.Scanner;

public class Questao2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int nf = 0, np = 0;
        String setor, v = "v";

        String[][] setorA = new String[10][11];
        String[][] setorB = new String[10][11];

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 11; j++) {
                setorA[i][j] = "v";
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; i++) {
                setorB[i][j] = "v";
            }

        }

        System.out.println("Indique o setor [A ou B] desejado: ");
        setor = entrada.nextLine();
        System.out.println("Indique o número da fileira: ");
        nf = entrada.nextInt();
        System.out.println("Indique o número da poltrona: ");
        np = entrada.nextInt();

        if ("A".equals(setor)) {
            System.out.println(setorA[nf][np]);
            setorA[nf][np] = "p";
        }

        else if ("B".equals(setor)) {
            System.out.println(setorA[nf][np]);
            setorB[nf][np] = "p";
        }

        else { 
            System.out.println("Tente novamente.");
        }

    }

}
