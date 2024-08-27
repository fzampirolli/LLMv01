
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        String vetorNome[] = new String[25], vetorDestino[] = new String[25];
        int i, j;

        for(i=0; i<25; i++) {
            for(j=0; j<25; j++) {
                System.out.print("Digite o nome do passageiro: ");
                vetorNome[i] = teclado.next();
                System.out.print("Digite o destino do passageiro: ");
                vetorDestino[j] = teclado.next();
            }
        }
        for(i=0; i<25; i++) {
            System.out.print("Digite o nome de um passageiro para consultar seu destino: ");
            vetorNome[i] = pesquisarDestino(i);

        }

    }

}
