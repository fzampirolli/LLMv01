
import java.util.Scanner;

public class Ex3P2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       int L,C; 
        System.out.print("Digite o número de linhas da matriz: ");
        L= entrada.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        C= entrada.nextInt();
       int A[][]= new int [L][C];
       LerMatriz(A);
    }
    public static int[][] LerMatriz(int Mat[][]){
        Scanner entrada= new Scanner(System.in);
        int i,j;
        int M[][]= new int [L][C];
        for(i=0;i<L;i++){
                    for(j=0;j<C;j++){
                        System.out.print("Digite o valor associado a "+(i+1)+"ª linha e a "+(j+1)+"ª coluna: ");
                        M[i][j]= entrada.nextInt();
                        M[i][j]= Mat[i][j];
                    }
                }
        return Mat;
    }

}
