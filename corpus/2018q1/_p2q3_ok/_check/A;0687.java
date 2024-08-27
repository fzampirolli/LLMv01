
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int tam=0;
        int vetor[]=new int [tam];
        int acumulador[] = new int [tam];
        leia (tam);
        leia (vetor[tam]);
    }
    public static int leia (int n) {
        Scanner teclado = new Scanner (System.in);
        System.out.printf("Digite o tamanho do vetor: ");
        n=teclado.nextInt();
        int v[] = new int [n];
        for (int i=0; i < n; i++) {
            System.out.printf("Digite o elemento da posicao " +i+ " do vetor: ");
            v[i]=teclado.nextInt();
        }
        return v[n];
}
    public static int Diagonal (int v[], int n) {
        Scanner teclado = new Scanner (System.in);
        int matriz [] [] = new int [n] [n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("Digite o elementor da posicao " +i+ +j+ " da matriz.");
                matriz[i] [j] = teclado.nextInt();
                if (i==j) {
                    matriz [i] [j] = v[i];
                }
            }
        }
        return matriz[n][n];
}
    public static void ImprimirMatriz(int m[][], int n) {
        for (int i=0; i<n; i++) {
           for (int j=0; j<n; j++) {
               System.out.printf("O elemento da posição " +i+ +j+ " da matriz é: " +m[i] [j]);
           } 
        }
    }
    public static int Imprimir (int m[] [], int n) {
        int soma=0;
        for (int i=0; i<n; i++) {
           for (int j=0; j<n; j++) {
               if ((m [i] [j]%5) !=0) {
                   soma=soma+m[i][j];
               }
           } 
        }
        return soma;
    }
}
