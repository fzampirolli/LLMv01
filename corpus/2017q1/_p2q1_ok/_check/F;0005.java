
import java.util.*;
public class P2 {
    public static void main(String[] args) {
        int A[] = {42, 30, -215, 20, 25, 7};
        int B[] = {12, 103, 49, 20, 55, 7};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos (A,B);
        ImprimeVetor(C);   
    }

    public static void ImprimeVetor (int Vet1[]){
        Scanner print = new Scanner (System.in);
        int [] A;
        System.out.println(A[0] + " "+A[1] + " " + A[2] + " " + A[3] + " "+ A[4] + " " + A[5]);
        }

    }
    public static int [] MaioresElementos (int Vet1[], int Vet2[]){
       int[] A;
     int i;
        int [] B;

        int maior0, maior1, maior2, maior3, maior4, maior5;
        Scanner tam = new Scanner (System.in);
        for (i=0;i<6;i++){
            if (A[0]>B[0]){
                maior0 = A[0];
            }
                else{
                maior0= B[0];        
            }
            if (A[1]>B[1]){
                maior1 = A[0];   
            }
                else{
                maior1= B[0];
            }
            if (A[2]>B[2]){
                maior2=A[2];
            }
                else{
                 maior2=B[2];
            }
            if (A[3]>B[3]){
                maior3=A[3];
            }
                else{
                 maior3=B[3];
            }
            if (A[4]>B[4]){
                maior4=A[4];
            }
                else{
                 maior4=B[4];
            }
            if (A[5]>B[5]){
                maior5=A[5];
            }
                else{
                 maior5=B[5];
            }
        System.out.println(maior0 + " " + maior1 + " " + maior2 + " " + maior3 + " " + maior4 + " " + maior5);
        A[i] = tam.nextInt();
}

    }
}

}
