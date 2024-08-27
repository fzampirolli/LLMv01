
import java.util.Scanner;

public class JavaApplicationex1 {

    public static void main(String[] args) {

        int j = -1, n, aux, i, vet[];

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        n = leia.nextInt();

        vet = new int[n];

        for (i = 0; i < vet.length; i++) {
            System.out.println("Digite um número para a posição");
            vet[i] = leia.nextInt();
        }

        for (i = 0; i < vet.length; i++) {
            if (vet[i] > vet[vet.length - j]) {
                aux = vet[i];
                vet[i] = vet[vet.length - j];
                vet[vet.length - j] = aux;

                j = j - 1;

            }
        }

        for (i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);

        }

    }
}