
public class Main {

    public static void main(String[] args) {
        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A, B);
        ImprimeVetor(C);
    }
    public static void ImprimeVetor (int Vet1[]){
        for (int i = 0; i < Vet1.length; i++) {
            System.out.print(Vet1[i]+" \n");

        }

    }
    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        int A[] = new int [6];
        for (int i = 0; i < 6; i++) {
            if (Vet1[i]>Vet2[i]){
               int A[i] = Vet1[i];
            }
            else {
                A[i] = Vet2[i];
            }

        }

    }
}
