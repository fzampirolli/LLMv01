
import java.util.Scanner;

public class QUESTAO3 {

    public static void main(String[] args) {
        int A[][], B[][],tamanhoX=0, tamanhoY=0;
        Scanner scanner = new Scanner(System.in);   
        System.out.print("DIGITE O TAMANHO L PAR DA MATRIZ: ");
        tamanhoX = scanner.nextInt();
        System.out.print("DIGITE O TAMANHO C PAR DA MATRIZ: ");
        tamanhoY = scanner.nextInt();
        A = new int[tamanhoX][tamanhoY];

        leMatriz(A);
        B=criaMatrizB(A,tamanhoX,tamanhoY);
        imprimeMatriz(A);
        imprimeMatriz(B);
    }

    public static void leMatriz(int matriz[][]){
        Scanner scanner = new Scanner(System.in);   

        for(int i = 0; i < matriz.length; i++){
            for(int j= 0; j < matriz[i].length; j++){
                System.out.println("LINHA " + i + " COLUNA " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

    }

    public static int[][] criaMatrizB(int[][] A,int x, int y){
        int B[][] = new int[A.length][A[0].length];
        int maior = maior(A,x,y);

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(i+1>x/2 && j+1 <= y/2){
                    B[i][j] = maior;
                }else{
                    B[i][j] = 0;
                }
            }
        }

        return B;
    }

    public static void imprimeMatriz(int[][] matriz){
        System.out.println("\n\n");
        for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static int maior(int[][] matriz, int x, int y){

        int maior = Integer.MIN_VALUE;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(i+1>x/2 && j+1 <= y/2 && matriz[i][j]>maior){
                    maior = matriz[i][j];
                    System.out.print("MAIOR = " + maior);
                }
            }
        }

        return maior;
    }

}
