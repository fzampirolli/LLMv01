
public class VetoresEModulos {
    public static void main(String[] args) {
        int A[] = {74, 0, 1, 7, -8, 5};
        int B[] = {-5, 3 ,6 , 0, 7, 18};
        int C[] = new int [6];

        ImprimeVetor(A);
        System.out.println();
        ImprimeVetor(B);
        System.out.println();
        C = MaioresElementos(A,B);
        ImprimeVetor(C);
    }

    public static void ImprimeVetor(int Vet1[]){
        for (int i=0; i<6;i++){
        System.out.print(" "+Vet1[i]+" ");
        }
    }
    public static int [] MaioresElementos (int Vet1[],int Vet2[]){
        int Vet3[] = new int [6];
        for (int c=0; c<6; c++){
            if (Vet1[c]<Vet2[c]){
                Vet3[c] = Vet2[c];

            }
            else {
                Vet3[c] = Vet1[c];
            }
        }
          return Vet3;
        }
    }