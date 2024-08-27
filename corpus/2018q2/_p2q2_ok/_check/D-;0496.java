
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A[][] = new int[10][11];
        int B[][] = new int[10][11];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {

                A[i][j] = 1; 
                System.out.println(" No setor A a cadeira " + i + "," + j + " vale " + A[i][j]);

            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                B[i][j] = 1;
                System.out.println(" No setor B a cadeira " + i + "," + j + " vale " + B[i][j]);
            }

        }
      int  i=0, j=0;
        System.out.println("Bem vindo a venda de ingressos!");
        System.out.println("Qual o setor desejado?  A ou B?");
        A[i][j] = leia.nextInt();

    }
}
