
import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {

    int A[]={74,0,1,7,-8,5};
    int B[]={-5,3,6,0,7,18};
    int C[]=new int[6];

    Imprimevetor(A);
    Imprimevetor(B);

    C=MaioresElementos(A,B);
    System.out.println(C);
    }

    public static void Imprimevetor(int vet1[]){
        for(int i=0;i<vet1.length;i++){
            System.out.println(vet1[i]);
        }
    }

    public static int[] MaioresElementos(int vet1[], int vet2[]){
        int c[]=new int[vet1.length];
        for(int i=0;i<vet1.length;i++){
            if(vet1[i]<vet2[i]){
                c[i]=vet2[i];
            }
            else{
                c[i]=vet1[i];
            }
        }
        return c;
    }
}
