
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int tam=35;
        String vetorNome [] = new String [tam];
        String vetorAcento [] = new String [tam];
        for (int i=0; i < tam; i++) {
            System.out.printf("Digite o nome do passageiro: ");
            vetorNome[i] = teclado.next();
            System.out.printf("Digite o número do acento: ");
            vetorAcento[i] = teclado.next();
        }
        pesquisarNome(vetorNome, vetorAcento, tam);
    }
    public static void pesquisarNome(String v1[], String v2[], int n ) {
        Scanner teclado = new Scanner (System.in);
        System.out.printf("Digite a poltrona do passageiro: ");
        String poltrona = teclado.next();
        for (int i=0; i<n; i++) {

        }
    }
}
