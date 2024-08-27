
public class Q1 {

    public static void main(String[] args) {

        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int [6];

        System.out.println("Vetor A:");
        ImprimeVetor(A);
        System.out.println("Vetor B:");
        ImprimeVetor(B);

        C = MaioresElementos(A, B);
        System.out.println("Vetor C:");
        ImprimeVetor(C);
    }

    public static void ImprimeVetor(int Vet1[]){

        for(int i=0; i<6; i++){
            System.out.print(Vet1[i] + "\t");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        int vet[] = new int[6];
        for(int i=0; i<6; i++){
            if(Vet1[i]>Vet2[i]) vet[i]=Vet1[i];
            else vet[i]=Vet2[i];
        }
        return vet;
    }
}
