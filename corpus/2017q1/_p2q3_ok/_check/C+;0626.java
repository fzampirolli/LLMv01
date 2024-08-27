
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int i, j, L, C;

        System.out.println("Informe o número de linhas (par): ");
        L=teclado.nextInt();
        System.out.println("Informe o número de colunas: ");
        C=teclado.nextInt();

        int A[][]=new int[L][C];
        LerMatriz(A, L, C);

        System.out.println("a) Matriz(A)");
        ImprimeQualquer(A, L, C);
        LerQuadrante(A, L, C);

        int B[][]=new int[L][C];
        System.out.println("b) Matriz(B)");
        ImprimeQualquer(B, L, C);

    }

    public static void LerMatriz(int mat[][], int LIN, int COL){
        Scanner teclado = new Scanner(System.in);
        int i, j;  

        for(i=0; i<LIN; i=i+1){
            for(j=0; j<COL; j=j+1){
                System.out.println("Insira o elemento ["+(i+1)+"]["+(j+1)+"] da matriz: ");
                mat[i][j]=teclado.nextInt();
            }
        }
    }

    public static void LerQuadrante(int mat[][], int LIN, int COL){
        int i, j, maior=0;
        int B[][]=new int[LIN][COL];        

        mat[0][0]= maior;                

        for(i=0; i<LIN; i=i+1){
            for(j=0; j<COL; j=j+1){                
                if(mat[i][j]>maior);
                maior=mat[i][j];
                B[i][j]=maior; 
                System.out.println(""+B[i][j]);
                }
            System.out.println("");
            }

    }

    public static void ImprimeQualquer(int mat[][], int LIN, int COL){
        int i, j;
        for(i=0; i<LIN; i=i+1){
            for(j=0; j<COL; j=j+1){        
        System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
    }
}
