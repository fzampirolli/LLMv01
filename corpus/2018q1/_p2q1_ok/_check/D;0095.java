
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = 125, k = 30, e, i = 0;
        int v[] = new int[n];
        boolean menor;

        while (i < n) {
            System.out.println("Insira um elemento do vetor: ");
            e = entrada.nextInt();
            v[i] = e;
        }

        menor = comparaVetor(v[], n, k);

        if (menor == true) {
            System.out.println("Existe número menor que 30 neste vetor.");
        } else {
            System.out.println("Não existe número menor que 30 neste vetor.");
        }
    }

    public static boolean comparaVetor(int v[], int n, int k) {
        int s = 0;
        boolean Menor;

        while (s < n) {
            if (v[s] < 30) {

                Menor = true;
            } else {
                Menor = false;
            }
            s++;
        }

        return Menor;
    }

}
