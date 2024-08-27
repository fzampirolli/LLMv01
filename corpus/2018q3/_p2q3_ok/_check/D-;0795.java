
import java.util.*;
public class P2piex3 {
    static void GeraMatriz(int Mat[][], int L, int C){
        for(int i =0;i<L;i++){
            for(int j=0;j<C;j++){
                Mat[i][j] = (int) (Math.random()*10);
            }
        }
    }
    static void imprimeMatriz(int Mat[][], int L, int C){
        for(int i =0;i<L;i++){
            for(int j=0;j<C;j++){
                System.out.println(Mat[i][j]);
            }
        }
    }
    static int matrizTransposta(int Mat[][], int L, int C){
        int aux = 0;
        for(int i = 0;i<L;i++){
            for(int j=0;j<C;j++){                
                Mat[i+1][0] = Mat[i][j];
            }
        }
        return Mat[L][C];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int A[][]=new int[2][2];
        GeraMatriz(A,2,2);
        imprimeMatriz(A,2,2);
        System.out.println(" ");

    }

}
