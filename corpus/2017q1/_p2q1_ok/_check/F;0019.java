
import java.util.Scanner;

public class VetoresEModulos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A[] = {74, 0, 1, 7, -8, 5};
        int B[] = {-5, 3, 6, 0, 7, 18};
        int C[] = new int [6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);
    }

    public static void ImprimeVetor(int Vet1[]) {
        Scanner leitor = new Scanner(System.in);
        int i = leitor.nextInt();
        Vet1[i] = leitor.nextInt();
        System.out.println(Vet1[i]);

    }

    public static int [] MaioresElementos (int Vet[], int Vetx[]) {
        if (A[i]>B[i]) {
            System.out.print(A[i] + " ");
        }
        else {
            System.out.print(B[i] + " ");
        }
    }

}