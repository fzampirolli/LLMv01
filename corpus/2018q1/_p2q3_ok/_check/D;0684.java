
import java.util.Scanner;

public class P2exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int a;
        System.out.print("Digite o tamanho do vetor :");
        a =teclado.nextInt();
        int v[] = new int [a];
        for ( int i=0; i<a;i++) {
            System.out.print("Digite o valor da posição " +i+ " do vetor:");
            v[i]=teclado.nextInt();
        }
        GeraMatriz(v,a);
        Imprimi_Matriz(GeraMatriz);

    }
    public static int[][] GeraMatriz (int v[],int a) {
        Scanner teclado = new Scanner (System.in);
        int m[][] = new int [a] [a];
        int linha;
        int coluna=0; 
        for (linha=0;linha<a;linha++) {
            for (coluna=0;coluna<a;coluna++) {
                System.out.print("Digite o elemento da linha "+linha+ " e da coluna "+coluna+" da matriz:");
                m[linha][coluna]=teclado.nextInt();
        }
        }

    return m;
    }
    public static int Imprimi_Matriz(int m[][], int linha, int coluna,int a) {
        for (linha=0;linha<a;linha++) {
            for (coluna=0;coluna<a;coluna++) {
                System.out.print("|"+m[linha][coluna]);
            }
    }
return m[linha][coluna];
    }

}