
import java.util.Scanner;
public class P2Q3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tam;

        System.out.print("Insira o tamanho do vetor: ");
        tam = entrada.nextInt();

        int i, vetor[] = new int [tam], matrizRec [][] = new int [tam][tam];
        float media;

        for (i = 0; i < tam; i++) {
            vetor[i] = tam - i;
        }
        matrizRec = CriarMatriz(vetor, tam);

        ImprimirMatriz(matrizRec, tam);

        media = MediaMatriz(matrizRec, tam);
        System.out.println("A média é "+media);
    }
    public static int[][] CriarMatriz(int vetor[], int tam) {

        Scanner entrada = new Scanner(System.in);
        int i, j;
        int matriz[][] = new int [tam][tam];

        for(i = 0; i < tam; i++) {
            for(j = 0; j < tam; j++) {
                if (i == j) {
                    matriz[i][j] = vetor[i];
                }
                else {
                    System.out.println("Insira um valor para a matriz: ");
                    matriz[i][j] = entrada.nextInt();
                }
            }
        }
        return matriz;
    }
    public static void ImprimirMatriz(int matriz[][], int tam) {
        int i, j;
        for (j = 0; j < tam; j ++) {
            System.out.print("\t");
            for(i = 0; i < tam; i++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    public static float MediaMatriz(int matriz[][], int tam) {

        int i, j, c = 0;
        float soma = 0, media = 0;

        for(i = 0; i < tam; i++) {
            for(j = 0; j < tam; j++) {
                if (matriz[i][j] % 5 == 0.0) {
                    c = c + 1;
                    soma = soma + matriz[i][j];    
                }
            }
        }
        media = soma/c;
        return media;
    }
}