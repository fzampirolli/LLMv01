
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        int i, n1, k = 30;
        boolean resp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        n1 = entrada.nextInt();
        int v1[] = new int[n1];
        System.out.println("Digite os elementos do vetor:");
        for (i = 0; i < n1; i++) {
            v1[i] = entrada.nextInt();
        }

        resp = ComparaVetor(v1, n1, k);
        if (resp == true) {
            System.out.println("Existe número menor que 30 nesse vetor.");
        } else {
            System.out.println("Não existe número menor que 30 nesse vetor.");
        }
    }

    public static boolean ComparaVetor(int v[], int n, int k) {
        Scanner entrada = new Scanner(System.in);
        boolean resp = false;
        int i;
        k = 30;
        for (i = 0; i < n; i++) {
            v[i] = entrada.nextInt();
        }

            if (v[i] < k) {
                resp = true;
            }

        return resp;
    }
}
