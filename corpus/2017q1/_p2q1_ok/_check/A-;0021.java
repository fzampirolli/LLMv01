
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        int A[] = {-62, 8, 98, 75, 26, 77};
        int B[] = {-102, 0, 102, 0, 26, 79};
        int C[] = new int [6]; 

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A,B); 
        ImprimeVetor(C);
    }

    public static void ImprimeVetor(int Vet1[]) {

        System.out.print("Vetor: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(Vet1[i] + " ");
        }
    }

    public static int [] MaioresElementos (int Vet1[], int Vet2[]) {

        int vetorf[] = new int [6];

        for (int i = 0; i < 6; i++) {
            if (Vet1[i] > Vet2[i]) {
                vetorf[i] = Vet1[i];
            }

            else if (Vet2[i] > Vet1[i]) {
                vetorf[i] = Vet2[i];
            }
        }
                return vetorf;
    }

}
