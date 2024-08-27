
import java.util.Arrays;
import java.util.Scanner;

public class matriz
{

    static int l,c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o numero de linhas e colunas:");
        l = scan.nextInt();
        c = scan.nextInt();  
        int A [][] = new int [l][c];
        int B [][] = new int [l][c];
        matriz(A);
        ImprimeMatriz(A);
        q2(B);

    }

    public static void matriz(int m[][]){
        Scanner scan = new Scanner(System.in);

        System.out.print("digite os elementos da matriz:");

        for (int i=0; i<l; i++)
        {
            for (int j=0; j<c; j++){
                m[i][j]= scan.nextInt();
            }
        }
    }

    public static void q2 (int m2[][]){

        for (int i=0; i<l; i++)
        {
            for (int j=0; j<c; j++){
                if (l<3){m2[i][j]=0;}
                if (c>2){m2[i][j]=0;}

                if (l>2 && c<3){
                    if(m2[i][j]<m2[i++][j++]){
                        m2[i][j]= m2[i++][j++];
                    }
                }
            }
        }
        B[][]=m2[][];
    }

    public static void ImprimeMatriz(int m[][]){

        System.out.println(Arrays.toString(m));

    }

}