
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = e.nextInt();
        float media;
        int A[] = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor "+i+" do vetor: ");
            A[i]=e.nextInt();
        }
        int B[][] = CriarMatriz(A);
        ImprimirMatriz(B);
        media = MediaMatriz(B);
        System.out.println("A média é: "+media);
    }
    public static int [][] CriarMatriz(int v[]){
        Scanner e = new Scanner(System.in);
        int A[][] = new int [v.length][v.length];
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (i==j){
                    A[i][j] = v[i];
                }
                else{
                    System.out.print("Digite o valor que deseja para a casa "+i+"/"+j+": ");
                    A[i][j] = e.nextInt();
                }
            }
        } 
        return A;
    }
    public static void ImprimirMatriz(int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static float MediaMatriz(int m[][]){
        int cont = 0, acum = 0;
        float media;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j]%2 == 0){
                    cont++;
                    acum = acum + m[i][j];
                }
            }
        }
        media = acum/cont;
        return media;
    }
}
