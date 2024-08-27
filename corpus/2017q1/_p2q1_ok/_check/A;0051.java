
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {

        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);

    }

    public static void ImprimeVetor(int Vet1[]){
        for(int i = 0; i < 6;i++){
            System.out.print(Vet1[i] + " ");
        }
        System.out.println();
    }

    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        int VetR[] = new int[6];
        for(int i = 0; i < 6;i++){
            if (Vet1[i] > Vet2[i]){
                VetR[i] = Vet1[i];    
            }else{
                VetR[i] = Vet2[i]; 
            }
        }
        return(VetR);
    }

}
