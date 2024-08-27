
import java.util.Scanner;

public class BrunaRibeiroOliveira_EXERCICIO 1  {

    public static void main(String[]args){

    int A[] = {-62,8,98,75,26,77};
    int B[] = {-102,0,102,0,26,79};
    int C[] = new int [6];

    ImprimeVetor (A);
    ImprimeVetor (B);

    C = MaioresElementos (A,B);
    ImprimeVetor (C);

    }

    public static void ImprimeVetor (int Vet1[]){
    int A[] =  {-62,8,98,75,26,77};
    int B[] = {-102,0,102,0,26,79};
    Scanner input = new Scanner (System.in);

        for (int i=0; i<6; i++){
            System.out.print(A[i]+"   ");
        }
        System.out.println("");        
        for (int j=0; j<6; j++){
            System.out.print(B[j]+"   ");
        }
        System.out.println("");
    }

    public static int MaioresElementos (int Vet1[], int Vet2[]){
    int A[] =  {-62,8,98,75,26,77};
    int B[] = {-102,0,102,0,26,79};
    int C[] = new int [6];
    int x = 0; 
    int xmaior = 0;

    Scanner input = new Scanner (System.in);

        for (int i=0; i<6; i++){
            if (A[i]>x){
                x = xmaior;                

            }
        }
    }

}
