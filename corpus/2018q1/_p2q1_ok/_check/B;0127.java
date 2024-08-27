
import java.util.Scanner;
public class P2Q1 {

    public static void main(String[] args) {

        int i, v[] = new int [145];
        boolean a = true;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < 145; i++) {
            System.out.println("Insira um valor para o vetor: ");
            v[i] = entrada.nextInt();
        }
        comparaVetor(v, 145, 10);

        if (a == true) {
            System.out.println("Existe número diferente de 10 nesse vetor");
        }
        else {
            System.out.println("Não existe número diferente de 10 nesse vetor");
        }
    }
    public static boolean comparaVetor(int v[], int n, int k) {
        int i;
        boolean a = false;
        for (i = 0; i < n; i++) {
            if (v[i] != k) {
                a = true;
            }
            else {
                a = false;
            }
        }
        return a;
    }    
}
