
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

         int A[]={74,0,1,7,-8,5};
         int B[]={-5,3,6,0,7,18};
         int C[]= new int [6];

         ImprimeVetor(A);
         System.out.println();
         ImprimeVetor(B);
         System.out.println();
         C=MaioresElementos(A,B);
         ImprimeVetor(C);
    }

    public static void ImprimeVetor(int Vet1[]){
        int i;
        Scanner entrada= new Scanner (System.in);

        for(i=0;i<6;i++){
            System.out.println( Vet1[i]);
        }

        }

    public static int [] MaioresElementos (int Vet1[], int Vet2[]){
        int i, maior11=0, maior12=0, maior13=0, maior21=0, maior22=0, maior23=0;
        Vet1[1]=maior11; Vet1[2]=maior12; Vet1[3]=maior13;
        Vet2[1]=maior21; Vet2[2]=maior22; Vet2[3]=maior23;

        for(i=0;i<6;i++){
        if(Vet1[i]>maior11){
        maior11=Vet1[i];
        }
        if(Vet1[i]>maior12){
            maior12=Vet1[i];
        }
        if(Vet1[i]>maior13){
            maior13=Vet1[i];
        }
        }

        for(i=0;i<6;i++){
        if(Vet2[i]>maior21){
        maior21=Vet1[i];
        }
        if(Vet2[i]>maior22){
            maior22=Vet1[i];
        }
        if(Vet2[i]>maior23){
            maior23=Vet1[i];
        }
        }
        int VetMaior[]={maior11,maior21,maior12,maior22,maior13,maior23};

        return VetMaior;  
    }
}
