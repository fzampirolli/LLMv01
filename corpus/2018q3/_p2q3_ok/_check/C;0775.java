
import java.util.*;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A[][]=new int [27][27];
        int a=27;
        GeraMatriz(A,a,a);
        imprimeMatriz(A,a,a);
        matrizTransposta(A,a,a);
        maiorElemento(A,a,a);
    }
    public static void GeraMatriz(int Mat[][], int L, int C){
        for(int i=0;i<L;i++){
            for(int j=0;j<C;j++){
                Mat[i][j]=(int)(Math.random()*10);
            }
        } 
    }
    public static void imprimeMatriz(int M[][], int l, int c){
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int matrizTransposta (int M[][], int l, int c){
        int Mat[][]=new int [l][c];
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                Mat[i][j]=M[j][i];
            }
        } 
        return Mat[l][c];    
    }
    public static int maiorElemento(int M[][], int l, int c){
        int maior=0;
         for(int i=0;i<l;i++){
             maior=0;
            for(int j=0;j<c;j++){
                if(M[i][j]>maior)
                    maior=M[i][j];
            }
        } 
        return maior;
    } 

}
