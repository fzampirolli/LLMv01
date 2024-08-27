
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        String vetorNome[] = new String[25];
        String vetorDestino[] = new String[25];

        System.out.println(" Qual o nome do passageiro ?");
        a = scan.next();
pesquisarDestino();
        if (a == vetorNome[i]) {
            System.out.println(+vetorNome + vetorDestino);
            else (a == "")
                    { System.out.print("Passageiro nao existe");
            }
        }
    }

    public static String pesquisarDestino(String vetorNome, String vetorDestino) {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.println(" Nome do passageiro ");
                vetorNome[i] = scan.next();
                System.out.println(" Destino da viagem ");
                vetorDestino[j] = scan.next();
            }
        }
        return vetorNome[i], vetorDestino[j];

    }

}
