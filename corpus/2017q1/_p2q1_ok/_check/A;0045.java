
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        int[] A =  new int [6];
        int[] B = new int [6];
        int[] C = new int [6];
        int i;

        Scanner tecl = new Scanner(System.in);

        for (i = 0; i<6; i++){
        System.out.print("digite um número para a posição " + i + " do vetor:");
        A[i] = tecl.nextInt();
        }
        ImprimeVetor(A);

        for (i = 0; i<6; i++){
        System.out.print("digite um número para a posição " + i + " do vetor:");
        B[i] = tecl.nextInt();
        }
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);
    }

    public static void ImprimeVetor (int[] Vet){
        for(int i=0; i<6; i++){
            System.out.print(Vet[i] + "  ");
        }

    }
    public static int[] MaioresElementos(int[] Vet1, int[] Vet2){
        int[] Vet3 = new int[6];
        for (int i=0; i <6; i++){
            if (Vet1[i] >= Vet2[i]){
               Vet3[i] = Vet1[i];   
            }
            else {
                Vet3[i]= Vet2[i];
            }
        }
        return Vet3;
    }

}
