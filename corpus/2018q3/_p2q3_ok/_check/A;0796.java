import java.util.Scanner;
public class Questao3 {
    static void GeraMatriz(int Mat[][], int L, int C) {
        for (int i = 0; i < L; i++){
            for (int j = 0; j < C; j++){
                Mat[i][j] = (int)(Math.random()*10); 
            }  
        }
    }
    public static void imprimeMatriz(int A[][], int x, int y){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] matrizTransposta(int A[][], int x, int y){
        int aux;
        for (int i = 0; i < x; i++){
            for (int j = i; j < y; j++){
                if (i != j) {
                    aux = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = aux;
                }
            }
        } 
        return A;
    }
    public static int menorElemento(int A[][], int x, int y) {
        int D[] = new int [276]; 
        int m = -1;
        int aux;
        for (int i = 0; i < x; i++){
            for (int j = i; j < y; j++){
                if (i != j) {
                    m++;
                    D[m] = A[j][i];
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                if (D[j] > D[j+1]) {
                    aux = D[j];
                    D[j] = D[j+1];
                    D[j+1] = aux;
                }
            }
        }
        return D[0];
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int x, y, z;
        int A[][] = new int [23][23];
        int B[][] = new int [23][23];

        System.out.println("A matriz A deve ser uma matriz quadrada");
        System.out.println("Digite o tamanho da matriz quadrada A:");
        x = leitor.nextInt();
        y = x;
        GeraMatriz(A, x, y);
        System.out.println("Matriz quadrada A:");
        imprimeMatriz(A, x, y);
        B = matrizTransposta(A, x, y);
        System.out.println("Matriz transposta de A:");
        imprimeMatriz(B, x, y);
        System.out.println("menor dos elementos do triângulo superior diagonal de A:");
        z = menorElemento(A, x, y);
        System.out.println(z);
    }
}
