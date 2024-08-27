
import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        int minMatA;
        int matriz[][]= new int[27][27];
        int matrizB[][]= new int[27][27];
        Scanner ent = new Scanner(System.in);
        GeraMatriz(matriz,27,27);
        ImprimeMatriz(matriz,27,27);
        matrizB = matrizTransposta(matriz);
        ImprimeMatriz(matrizB,27,27);
        minMatA = MinTriInf(matriz);
        System.out.print("O menor dos elementos do triangulo inferior a diagonal A é "+ minMatA);
    }
    static void GeraMatriz(int mat[][], int L, int C){
        for (int i=0;i<L;i++){
            for(int j =0; j<C;j++){
                mat[i][j] = (int) (Math.random()*10); 
            }
        }
    }
    static void ImprimeMatriz(int mat[][], int L, int C){
        for (int i=0;i<L;i++){
            for(int j =0; j<C;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n \n");
    }
    static int[][] matrizTransposta(int mat[][]){
        int aux = 0;
        int matB[][]= new int [27][27];
        for (int i=0;i<27;i++){
            for(int j =0; j<27;j++){
                matB[i][j] = mat[j][i];
                matB[j][i]= mat[i][j];
            }
        }
        return matB;
    }
    static int MinTriInf (int mat[][]){
        int min = mat[0][0];
        for (int i=0;i<27;i++){
            for(int j =i; j<27;j++){
                if (mat[i][j]<min){
                    min= mat[i][j];
                }
            }
        }
        return min;
    }

}
