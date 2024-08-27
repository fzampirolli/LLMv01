
import java util.Scanner;

public class JhonnyNobredaSilva_Questao 1 {

    public static void main(String[] args) {

        int A[] = {-62, 8, 98, 75, 26, 77};
        int B[] = {-102, 0, 102, 0, 26, 79};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A, B);
        ImprimeVetor(C);

    }

    public static void ImprimeVetor(int Vet1[]){

        System.out.println("Vetor");
        for (int i = 0; i < 6; i++) {

            System.out.println(Vet1[i]);

        }

    }

    public static int MaioresElementos (int r[], int s[]){

    }

}
