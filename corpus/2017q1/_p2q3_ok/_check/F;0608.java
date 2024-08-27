
 import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho da linha da matriz:  ");
        int L = teclado.nextInt();
        System.out.print("Digite o tamanho da coluna da matriz: ");
        int C = teclado.nextInt();

        int A [][] = new int [L][C];

        System.out.println("Digite os numeors da matriz A: ");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length;j++){
        A[i][j] = teclado.nextInt();
            }
        }

    }
}
