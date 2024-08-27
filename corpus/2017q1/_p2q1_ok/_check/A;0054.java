
public class Questao1vetores {

    public static void main(String[] args) {
        int A[] = {74, 0, 1, 7, -8, 5};
        int B[] = {-5, 3, 6, 0, 7, 18};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);
    }
    public static void ImprimeVetor(int Vet[]){
        for (int i=0; i<6; i++){
           System.out.print(Vet[i]);
           System.out.print(" ");
        }
        System.out.println();
    }
    public static int[]MaioresElementos(int Vet1[], int Vet2[]){
        int Vet3[] = new int[6];
        for(int i=0;i<6;i++){
            if(Vet1[i]>Vet2[i]){
            Vet3[i]=Vet1[i];
        }
            else{
               Vet3[i]=Vet2[i];
            }
        }
             return Vet3;
    }

}
