
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int matriz[][] = new int [4][4];
    int i, j;

    for (i=0; i<4; i++) {
        for (j=0; j<4; j++){
            System.out.print("Digite o valor do elemento ["+i+"]["+j+"] da matriz: ");
            matriz[i][j] = entrada.nextInt();

        }
    }
    for (i=0; i<4; i++) {
        for (j=0; j<4; j++){
            System.out.print(matriz[i][j]+" ");
        }
    }
    }    
}