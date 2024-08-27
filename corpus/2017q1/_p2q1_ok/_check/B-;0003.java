
import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[] = new int[6];
        int B[] = new int[6];
        int C[] = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("digite o valor" + i + "do vetor A");
            A[i] = entrada.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("digite o valor" + i + "do vetor B");
            B[i] = entrada.nextInt();
        }

        Imprimevetor(A);
        Imprimevetor(B);

        C = Maioreselementos(A, B);
        Imprimevetor(C);
    }

    public static void Imprimevetor(int Vet1[]) {

        for (int i = 0; i < 6; i++) {
            System.out.print(Vet1[i]+" ");
        }
        System.out.println(" ");

    }

    public static int[] Maioreselementos(int Vet1[], int Vet2[]) {
        int a, b,d = 0,c = 0;

        Vet1 = new int[6];
        Vet2 = new int[6];
        int C[] = new int[6];

        a = Vet1[0];
        b = Vet2[0];

        for (int j = 0; j < 6; j++) {
            for (int i = 1; i < 6; i++) {
                c=Vet1[i];
                d=Vet2[i];

                if (c > a) {
                    a = c;
                }

                if (d > b) {
                    b = d;
                }

                if (a > b) {
                    C[j] = a;
                } 
                else {
                    C[j] = b;
                }
                a=c;
            b=d; 

            }

        }
           return C;

    }
}
