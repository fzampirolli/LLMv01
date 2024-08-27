
import java.util.Arrays;

public class VETORESEMODULOS {

    public static void main(String[] args) {

        int A[]= {74, 0, 1, 7, -8, 5};
        int B[]= {-5, 3, 6, 0, 7, 18};
        int C[]= new int [6];

        System.out.print("vetor A: ");
        ImprimeVetor(A);
        System.out.print("vetor B: ");
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);

    }

    public static void ImprimeVetor(int Vet1[]){

        System.out.println(Arrays.toString(Vet1));

    }

    public static int[] MaioresElementos(int vet1[],int vet2[]){
        int c;
        int x = vet1.length;
        int aux[] = new int [x];

        for (int i=0; i< x ; i++){
           if (vet1[i]>vet2[i]){
                aux [i] = vet1[i];
           }
           if (vet1[i]<vet2[i]){
               aux[i]=vet2[i];

           }

        }
        return aux;

    }

}
