
public class JavaApplication1 {

    public static void main(String[] args) {

        int A[] = {74, 0, 1, 7, -8, 5};
        int B[] = {-5, 3, 6, 0, 7, 18};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A, B);

        ImprimeVetor(C);

    }

    private static void ImprimeVetor(int Vet1[]) {

        for(int n = 0; n < 6; n++)
        {
            System.out.print(Vet1[n] + " ");
        }
        System.out.println();
    }

    private static int[] MaioresElementos(int[] A, int[] B) {
        int C[] = new int[6];
        for(int n = 0; n < 6; n++)
        {

            if(A[n] > B[n])
            {
                C[n] = A[n];
            }
            else
            {
                C[n] = B[n];
            }
        }
        return C;
    }

}
