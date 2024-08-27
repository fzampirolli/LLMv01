
import java.util.Scanner;

public class empresaAerea {

    public static void main(String[] args) {

        int tam = 45;
        Scanner teclado = new Scanner(System.in);
        String destino, nome;
        String vetorNome[] = new String[tam];
        String vetorDestino[] = new String[tam];

        System.out.println("Digite os nomes dos passageiros e destinos: ");        
        preencherVetor(vetorNome, vetorDestino, tam);

        System.out.println("Digite o nome de um destino: ");
        destino = teclado.nextLine();

        nome = pesquisarNome(vetorNome, vetorDestino, destino, tam);

        if (!"".equals(nome)) {
            System.out.println("Nome do passageiro: " + nome + "\nDestino: " + destino);
        } else {
            System.out.println("destino não existe");
        }
    }

    public static String pesquisarNome(String vetorNome[], String vetorDestino[], String destino, int tamanho) {
        String nome = "";

        for (int i = 0; i < tamanho; i++) {
            if (vetorDestino[i].equals(destino)) {
                nome = vetorNome[i];
                i = tamanho;
            }
        }

        return nome;
    }

    public static void preencherVetor(String vetor1[], String vetor2[], int tamanho) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Passageiro: ");
            vetor1[i] = teclado.nextLine();
            System.out.print("Destino: ");
            vetor2[i] = teclado.nextLine();
        }
    }

}
