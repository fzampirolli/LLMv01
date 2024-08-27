
import java.util.Scanner;

public class Ex2 {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Tamanho da matriz: ");
        int tam = leia.nextInt();
        int preto = 0, branco = 0, r = 0, i = 0;
        int[][] A = new int[tam][tam];

        for(i = 0; i < tam; i = i + 1)
        {
            for(int j=0; j < tam; j = j + 1)
            {
                System.out.print("Digite um número: ");
                A[i][j] = leia.nextInt();
            }
        }

        for(i = 0; i < tam; i = i + 1)
        {
            for(int j=0; j < tam; j = j + 1)
            {
                if(i % 2 == j % 2) 
                {
                    preto += A[i][j];
                }
                else 
                {
                    branco += A[i][j];
                }
            }
        }

        if(preto > branco)
        {
            r = 0;
        }
        else if(branco > preto)
        {
            r = 1;
        }
        else
        {
            r = 2;
        }

        System.out.println(preto + " " + branco + " " + r);

    }

}
