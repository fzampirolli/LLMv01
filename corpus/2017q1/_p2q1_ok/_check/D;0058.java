
import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        int A[] = {0,7,32,-12,42,100};
        int B[] = {23,-80,6,-2,9,6};
        int C[] = new int [6];

        Scanner sc = new Scanner (System.in);

        ImprimeVetor(A);
        ImprimeVetor(B);

        C= MaioresElementos (A,B);
        ImprimeVetor(C);
    }

    public static int[] ImprimeVetor(int A, int B){
        int i=0, n=0;
        int A[] = new int [n];
        int B[] = new int [n];
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o tamanho do vetor: ");
        n = sc.nextInt();

        for(i=0;i<n;i++){
            A[i]= sc.nextInt();
            B[i] = sc.nextInt();
                    }
        return A,B;
    }

        public static int[] MaioresElementos(int A[],int B[]){
        int n;
            int C[] = new int[n];
            int i=0;

           for(i=0;i<n;i++){
            if(A[i]>B[i]){
                C[i]=A[i];
            }
            else{
                C[i]=B[i];
                        }

            return C;
            }
        }
}
