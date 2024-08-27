
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A[]= {0,7,32,-12,42,100};
        int B[]= {23,-80,6,-2,9,6};
        int C[]= new int [6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C=MaioresElementos(A,B);
        ImprimeVetor(C);

    }
    public static void ImprimeVetor(int Vet1[]){
            System.out.print("\nO vetor é: ");
            for(int i=0;i<6;i++){ 
            System.out.print(Vet1[i]+" ");
        }

    }
    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
        Scanner entrada= new Scanner(System.in);
        int maior=0;
        for(int i=0; i<6;i++){

        } 

    }   

}   
