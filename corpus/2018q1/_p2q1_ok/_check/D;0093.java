
import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        int vet[] = new int[5];
        int i=0;

        for(i=0; i<5; i++) {
            System.out.print("Informe os elementos do vetor: ");
            vet[i] = teclado.nextInt();

            if(vet[i] > 30) {
                System.out.println("Existe número maior a 30 nesse vetor");
            } else {
                System.out.println("Não existe número maior a 30 nesse vetor");
            }
        }
        comparaVetor(v[i]);
    }
    public static boolean comparaVetor(int v[], int n, int k) {

        if v[k] == 30 {
            return true
        } else {
            return false
        }

    }
}
