
import java.util.Scanner;

public class P2 {

    public static void LerMatriz(int MatrizA[][]){
    int i=0 , j=0 ; 
    Scanner entrada = new Scanner(System.in);
    for(i=0;i<MatrizA.length;i++){
             for(j=0;j<MatrizA.length;j++){
                 System.out.println("Digite o numero da linha " + i + " e da coluna " + j);
                 MatrizA[i][j] = entrada.nextInt();
             }
         }
    }

    public static void main(String[] args) {
        int L=0 , C=0 ;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz :");
        L = entrada.nextInt();
        System.out.println("Digite a quantidade de linhas da matriz :");
        C = entrada.nextInt();

        int MatrizA[][] = new int [L][C];

         LerMatriz(MatrizA);

    }
}
