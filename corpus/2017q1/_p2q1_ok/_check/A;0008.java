
import java.util.Scanner;

public class VetoresEModulos {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A[]= {0,7,32,-12,42,100};
        int B[]= {23,-80,6,-2,9,6};
        int C[]= new int [6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C= MaioresElementos(A,B);
        ImprimeVetor(C);

    }

    public static void ImprimeVetor(int Vet1[]){
        int n;
        for(n=0;n<6;n++){
            System.out.print(Vet1[n]+" ");
        }
        System.out.println();
    }

    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        int i;
        int V[]= new int[6];
        for(i=0;i<6;i++){
            if(Vet1[i]>Vet2[i]){
                V[i]=Vet1[i];
            }
            else{
                V[i]=Vet2[i];
            }
    }
        return V;
    }

}
