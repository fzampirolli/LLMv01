
import java.util.Scanner;
public class P2Ex01 {
    public static void main(String[] args) {

        int A[] = {42, 30, -215, 20, 25, 7};
        int B[] = {12, 103, 49, 20, 55, 7};
        int C[] = new int [6];

        System.out.println("Dados do Vetor A!");
        ImprimeVetor(A);
        System.out.println();
        System.out.println("Dados do Vetor B!");
        ImprimeVetor(B);
        System.out.println();

        System.out.println("Dados do Vetor C!");
        MaioresElementos(A,B);

    }

    public static void ImprimeVetor(int Vet1[]){
        for(int X = 0; X < 6; X++){
            int m = Vet1[X];
            System.out.println("Posição "+X+ ": " +m);
        }
    }

    public static void MaioresElementos(int Vet1[], int Vet2[]){
        int VetAux[] = new int [6];
        for (int X = 0; X < 6; X++){
            int m = Vet1[X];
            int n = Vet2[X];
            if(m >= n){
                VetAux[X] = m;
            }
            else{
                VetAux[X] = n;
            }
        }
            for(int X = 0; X < 6; X++){
            int m = VetAux[X];
            System.out.println("Posição "+X+ ": " +m);
        }
    }
}
