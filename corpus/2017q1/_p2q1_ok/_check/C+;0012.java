
import java.util.Scanner;
public class q1 {

    public static void main(String[] args) {
        int n = 6;
        int vetA [] = {0, 7, 32, -12, 42, 100};
        int vetB [] = {23, -80, 6, -2, 9, 6};
        int C [] = new int [6];

        ImprimeVetor(vetA);
        ImprimeVetor(vetB);

    }
    public static void ImprimeVetor (int vet [] ){ 
        for ( int n = 0; n < 6; n++){
            System.out.println(" "+ vet[n]);
        }
    }
    public static int[] MaioresElementos(int vetA[], int vetB[]){
        int maior = 0; int ind = 0; int vetC[];int cont_ind = 0;
        for ( int i = 0; i < 6; i++){
            while (ind < 3 ){
                if (vetA[i] > maior){
                    vetA[i] = maior;
                    ind++;
                    cont_ind++;
                 }
                vetC[i] = vetA[i];
            }
        }

    }
}
