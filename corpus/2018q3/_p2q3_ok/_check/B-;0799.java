
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        int A[][],i,j,B[][];
        B=new int [21][21];

        A = new int [21][21];
        for(i=0;i<21;i++){
            for(j=0;j<21;j++){
                A[i][j] = (int)(Math.random()*10);
            }
        }
        ImprimeMatriz(A);

        int c = Menor_Elemento(A);

    }
    public static void ImprimeMatriz(int A[][]){
        for(int i=0;i<21;i++){
            System.out.println();
            for(int j=0;j<21;j++){
                System.out.print(A[i][j]+" ");
            }
        }
    }
    public static int Menor_Elemento (int A[][]){
        int m=0,i,j;
        for(i=0;i<21;i++){
            for(j=0;j<21;j++){
              if(i>j){
                if(A[i][j]>m){
                    m=A[i][j];
                }  
              } 
            }
        }
        return m;
    }

}
