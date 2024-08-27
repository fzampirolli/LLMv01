
import java.util.Scanner;
public class Q1 {

    static Scanner in = new Scanner (System.in);
    static int tam, menor, i, A[] = new int [tam];

    public static void main(String[] args) {
        System.out.println ("Qual o tamanho do vetor?");
        tam = in.nextInt ();
        comparaVetor (A, tam, 30);
    }

    public static boolean comparaVetor (int v [], int n, int k) {
        for (i=0; i<tam; i++) {
            System.out.println ("Insira um elemento do vetor:");
            A[i] = in.nextInt();
        }
        for (i=0; i<tam; i++) {

        }
        return false;

    }

 }
