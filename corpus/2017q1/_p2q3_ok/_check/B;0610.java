
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int l, c, i, j;

        System.out.println("Digite o número de linhas da matriz: ");
        l=entrada.nextInt();

        System.out.println("Digite o número de colunas da matriz: ");
        c=entrada.nextInt();

        int A[][] = new int [l][c];

        System.out.println("Elementos da matriz: ");
        for(i=0;i<l;i++){
            for(j=0;j<c;j++){
                A[i][j]=entrada.nextInt();
            }
        }

        System.out.println("Matriz A: ");
         for(i=0;i<l;i++){
            for(j=0;j<c;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }

        int imaior=0, jmaior=0;

        for(i=0;i<l;i++){
            for(j=0;j<c;j++){
                if(i>j && A[i][j]>A[imaior][jmaior]){
                    A[imaior][jmaior]=A[i][j];
                }
            }
        }    

        int B[][] = new int [l][c];

        for(i=0;i<l;i++){
            for(j=0;j<c;j++){
                if(i>j){
                    B[i][j]=A[imaior][jmaior];
                }
                else{
                    B[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz B: ");
        for(i=0;i<l;i++){
            for(j=0;j<c;j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
