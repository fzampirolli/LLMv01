
import java.util.Scanner;

public class Ex1 {

    public static void ImprimeVetor(int Vet1[]){
        int L;
        L=Vet1.length;

        for(int i=0;i<L;i++){
                System.out.print("["+Vet1[i]+"]");
        }

    }
    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        int L1,L2;
        L1=Vet1.length;
        L2=Vet2.length;
        int Vet3[]=new int[L1];

        if(L1!=L2){
            System.out.print("Os vetores inseridos não possuem o mesmo tamanho.");
        }
        else{
            for(int i=0;i<L1;i++){
                if(Vet1[i]>Vet2[i]){
                    Vet3[i]=Vet1[i];
                }
                else{
                    Vet3[i]=Vet2[i];
                }
            }
        }
        return Vet3;

    }

    public static void main(String[] args) {
        int A[]={74,0,1,7,-8,5};
        int B[]={-5,3,6,0,7,18};
        int C[]=new int[6];

        ImprimeVetor(A);
        System.out.println();
        ImprimeVetor(B);
        System.out.println();
        C=MaioresElementos(A,B);
        ImprimeVetor(C);
    }

}
