
public class VetoresEModulos {

    public static void main(String[] args) {
        int A[]={42,30,-215,20,25,7};
        int B[]={12,103,49,20,55,7};
        int C[]=new int [6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C=MaioresElementos(A,B);
        ImprimeVetor(C);
    }

    public static void ImprimeVetor(int Vet1[]){
        for(int i=0;i<Vet1.length;i++){
            System.out.print(Vet1[i]+" ");
        }
        System.out.println();
    }

    public static int[] MaioresElementos(int Vet1[],int Vet2[]){
        int[] Vet3=new int[Vet1.length];
        for(int i=0;i<Vet1.length;i++){
            if(Vet1[i]>Vet2[i]) Vet3[i]=Vet1[i];
            else Vet3[i]=Vet2[i];
        }
        return Vet3;
    }
}
