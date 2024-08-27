
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A[] = {42, 30, -215, 20, 25, 7};
        int B[] = {12, 103, 49, 20, 55, 7};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);

    }

    public static void ImprimeVetor (int Vet1[]){
        int c=0;
        System.out.print("Vetor    [");
        for (c=0;c<6;c++){
            System.out.print(Vet1[c] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }

    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        int c1 = 0, c2 =0,c3=0, aux1 =0, aux2=0;
        boolean checar = false;
        int Vetc[] = new int[6];
        for (c1=0; c1<6; c1++){
            Vetc[c1] = Vet1[c1];

        }
        for (c1=0; c1<6; c1++){
            for(c2=0; c2<6; c2++){
                if (Vet2[c1]>Vetc[c2]){
                    if(checar = false){
                        Vetc[c2] = Vet2[c1];
                        checar = true;
                    }
                }
            }
            checar = false;
        }

        return Vetc;
    }
}
