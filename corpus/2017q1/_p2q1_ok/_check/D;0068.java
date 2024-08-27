
 import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int A[] = {74,0,1,7,-8,5};
       int B[] = {-5,3,6,0,7,18};
       int C[] = new int [6];

       ImprimeVetor(A);
       ImprimeVetor (B);

             C = MaioresElementos (A,B);
       ImprimeVetor(C);  
    }
    @SuppressWarnings("empty-statement")
    public static void ImprimeVetor(int Vet1[]) {
        int ind;
        for (ind = 0; ind <6; ind++)
        System.out.println(" ; " + Vet1[ind]);
    }
    public static int [] MaioresElementos(int Vet1[], Vet2[]) {
       int C; 

    }
    return C;
}
