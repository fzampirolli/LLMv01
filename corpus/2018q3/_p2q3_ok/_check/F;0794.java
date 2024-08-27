
import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {
        int A [][], B[][];
        int L, C;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Defina L e em seguida C");
        L = entrada.nextInt();
        C = entrada.nextInt();
        geraMatriz(int A[][], int L, int C);
    }

    public static void geraMatriz(int mat [][], int L, int C){
        for (int i = 0; i < L; i++){
            for (int j = 0; j < C; j++){
                mat [i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static int [][] matrizTransposta (int A[][]; int B){

    return B;
} 
}
