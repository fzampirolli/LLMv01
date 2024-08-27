
import java.util.Scanner;

public class Provaquestao2 {

    public static void main(String[] args) {

        String vetorNome [] = new String [15], vetorAcento[] = new String [15];

        System.out.println("Entre os nomes dos passageiros: ");
        preencherVetor(vetorNome, 15);

        System.out.println("Entre os números dos acentos, respectivamente");
        preencherVetor(vetorAcento, 15);
    }
    public static void preencherVetor (String v[], int n) {
        Scanner entrada = new Scanner (System.in);
        int i;

        for (i=0;i<n;i++) {
            v[i] = entrada.nextLine();       
        }
    }
    public static String pesquisarAcento (int vetorAcento[], int vetorNome, String nome) {
        int i;
        for (i=0;i<15;i++) {

        }
    }
}
