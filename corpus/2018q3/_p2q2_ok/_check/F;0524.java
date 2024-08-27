
import java.util.Scanner;
import java.util.Random;
public class Questao2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    int n, p=0, b=0,r=0;
    System.out.println(" Escreva o valor para colunas e linhas:");
    n = sc.nextInt();
    int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=rnd.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(" "+a[i][j]);
            }
        }
        System.out.println();

}
}
