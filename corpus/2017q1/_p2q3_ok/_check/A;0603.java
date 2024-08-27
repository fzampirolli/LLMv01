
import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int L, C;

        System.out.print("Digite o número de linhas da matriz: ");
        L = entrada.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        C = entrada.nextInt();

        int A[][] = new int[L][C];
        int B[][] = new int[L][C];
        LerMatriz(A);
        B = CriarMatriz(A,B);
        System.out.print("A matriz A é:");
        System.out.println("\t");
        ImprimeMatriz(A);
        System.out.print("A matriz B é:");
        System.out.println("\t");
        ImprimeMatriz(B);

    }

    public static void LerMatriz(int mat[][]){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.println("Digite o elemento da linha "+i+" coluna "+j+" da matriz");
                int n = entrada.nextInt();
                mat[i][j] = n;
            }
        }
    }

    public static int [][] CriarMatriz(int matA[][], int matB[][]){
        Scanner entrada = new Scanner(System.in);
        int x = 0;

        for(int i = 0; i < matB.length; i++){
            for(int j = 0; j < matB[0].length; j++){
                matB[i][j] = x;
            }
        }

        for(int i = 0; i < (matA.length/2); i++){
            for(int j = 0; j < (matA[0].length/2); j++){

                if(matA[i][j] > x){
                    x = matA[i][j];
                }

        }

    }
        for(int i = 0; i < (matA.length/2); i++){
            for(int j = 0; j < (matA[0].length/2); j++){
                matB[i][j] = x;
            }
        }
        return matB;
    }

    public static void ImprimeMatriz(int mat[][]){

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("\t");
        }

    }

}
