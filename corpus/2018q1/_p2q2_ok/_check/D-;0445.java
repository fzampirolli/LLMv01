
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String vetorNome[] = new String[45];
        String vetorDestino[] = new String[45];
        int menu, j, ind = 0;

        System.out.println("Você deseja: \n 1. Inserir dados \n ou 2. Pesquisar por nome?");
        menu = entrada.nextInt();

        if (menu==1) {
            while (ind < 45) {
            System.out.println("Insira um nome:");
            vetorNome[ind] = entrada.nextLine();
            System.out.println("Insira um destino:");
            vetorDestino[ind] = entrada.nextLine();
            ind++;

        }
        }
        else {
            if (menu==2) {
                 j = pesquisarNome(a);
                System.out.println("Nome:" + vetorNome[j]);
            }
            else {
            System.out.println("Número digitado não corresponde às opções");
            }
        }

    }
    public static int pesquisarNome(String vetorDestino[]) {
        String x;
        int a = 0, ind;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o destino do passageiro:");
        x = entrada.nextLine();
        for (ind = 0; ind < 45; ind++) {
            if (vetorDestino[ind] == x) {
                return (a);
            }
            else {
                System.out.println("Destino não existe");
            }
        }
    }
}
