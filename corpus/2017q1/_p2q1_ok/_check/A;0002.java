
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int[6];

        ImprimeVetor(A);
        System.out.println();
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        System.out.println();
        ImprimeVetor(C);

    }

    public static int[] ImprimeVetor(int m[]) {

        System.out.print("\nO vetor impresso é: \n");
        for (int i = 0; i < 6; i++) {
            System.out.print(m[i] + "   ");
        }
        return m;
    }

    public static int[] MaioresElementos(int a[], int b[]){
        int c[] = new int[6];

        for (int i=0; i<6; i++){
            c[i]=a[i];
        }

        for (int i=0; i<6; i++){
            if (c[i]<b[i]){
            c[i]=b[i];
            }
        }

        return c;
    }

}
