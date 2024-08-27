
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Digite o numero de linhas:");
        x = input.nextInt();
        System.out.println("Digite o numero de colunas:");
        y = input.nextInt();
        int A[][];
        A = new A[x][y];

        if(x%2==0){
            if(y%2==0){
                LerMatriz(A, x, y);
            }
            else{
                System.out.println("Digite um numero par.");
            }   
        }

    }
    public static void LerMatriz(int Mat[][],int x, int y){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<x; ++i){
            for(int j=0; j<y; ++j){
                System.out.println(" ");
                Mat[i][j]= input.nextInt();
                System.out.print("   " + Mat[i][j]);
            }
            System.out.println(" ");                
        }

    }

    public static void ImprimirMatriz(int Mat[][],int x, int y){
        for(int i=0; i<x; ++i){
            for(int j=0; j<y; ++j){
                System.out.print("   " + Mat[i][j]);
            }
            System.out.println(" ");                
        }
    }

}
