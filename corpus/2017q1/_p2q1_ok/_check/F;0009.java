
public class Questao1 {

    public static void main(String[] args) {
        int A[] = {-62, 8, 98, 75, 26, 77};
        int B[] = {-102, 0, 102, 0, 26, 79};
        int C[] = new int [6];
        int i, j, k;

        for(i=0; i<6; i++){
            System.out.print(A[i] + " ");

        }

        System.out.println(" ");

        for(j=0; j<6; j++){
            System.out.print(B[j] + " ");

        }
        for(k=0; k<6; k++) {
            for(j=0; j<6; j++){
                for(i=0; i<6; i++){
                    if(A[i]>B[j]){
                        C[k] = A[i];
                    }
                    if(A[i]<B[j]){
                        C[k] = B[j];
                    }
                }

            }                       
        }
        System.out.println(" ");

        for(k=0; k<6; k++){
            System.out.print(C[k] + " ");
        }

    }

}
