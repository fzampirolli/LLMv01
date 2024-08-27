
public class JavaApplication1 {

    public static void main(String[] args) {
        int A[] = {0, 7, 32, -12, 42, 100};
        int B[]={23, -80, 6, -2, 9, 6};
        int C[]= new int [6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C=MaioresElementos(A,B);
        ImprimeVetor(C);
    }
    public static void ImprimeVetor(int Vet1[]){
        System.out.println(Vet1);
    }
    public static int [] MaioresElementos( int Vet1[], int Vet2[]){
        int Vet3[]= Vet1;
        int n=6;
        for(int i=0; i<n ; i++){
            if(Vet1[i]>Vet2[i]){
                Vet3[i]=Vet1[i];
            }
            else{ Vet3[i]=Vet2[i];}
        }
        return Vet3;
    }
}
