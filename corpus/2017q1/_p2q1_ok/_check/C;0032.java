
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, j=0, k=0;
        int A[] = new int [i];
        int B[] = new int [j];
        int C[] = new int [k];
        for (i=0;i<7;i++){ 
        System.out.println("Digite o valor de A na posição"+ i);
        sc.nextInt(A[i]);
    }
        for (j=0;j<7;j++){ 
        System.out.println("Digite o valor de B na posição"+ j);
        sc.nextInt(B[j]);
    }
        ImprimeVetor(A);
        ImprimeVetor(B);
        C = MaioresElementos(A,B);
        ImprimeVetor(C);
    }
    public static void ImprimeVetor(int Vet1[]){
       int l;
       for (l=0;l<7;l++){
       System.out.print(Vet1[l]+"  ");
       }
       System.out.println(" ");
    }
    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
    int m;
    int Cc[] = new int [6];
    for (m=0;m<7;m++){
        if (Vet1[m]<Vet2[m]){
        Cc[m] = Vet2[m];
        }
        if (Vet2[m]<Vet1[m]){
        Cc[m] = Vet1[m];
        }
        else { 
        Cc[m] = Vet1[m];
        }
    }
    return Cc;
    }
}
