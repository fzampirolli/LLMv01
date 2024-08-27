
import java.util.Scanner;

public class JavaApplication2 {
static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
    int l,c;

    System.out.println("Informe a quantidade de linhas: ");
    l = entrada.nextInt();
    System.out.println("Informe a quantidade de colunas: ");
    c = entrada.nextInt();

    int A[][] = new int [l][c];
    int B[][] = new int [l][c];

        LerMatriz(A);
        System.out.println("Matriz A");
        ImprimeMatriz(A);
        System.out.println("");
        CriarMatriz(A,B);
        System.out.println("Matriz B");
        ImprimeMatriz(B);
    }
    public static void LerMatriz(int A[][]){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.println("Digite o elemento A["+i+"]["+j+"] da matriz");
                A[i][j]= entrada.nextInt();
            }
        }
    }

    public static void CriarMatriz(int A[][], int B[][]){
        int cont = A[0][0], ml, mc;
        ml = (A.length)/2;
        mc = (A[0].length)/2;

        for(int i=0;i<ml;i++){
             for(int j=0;j<mc;j++){
                 if(cont<A[i][j]){
                     cont = A[i][j];
                 }
             }
        }
        for(int i=0;i<ml;i++){
            for(int j=0;j<mc;j++){
                B[i][j]=cont;
            }
        }
        for(int i=2;i<A.length;i++){
            for(int j=2;j<A[0].length;j++){
                B[i][j]=0;
            }
        }
    }

    public static void ImprimeMatriz(int M[][]){
    for (int[] M1 : M) {
        System.out.println("");
        for (int j = 0; j<M[0].length; j++) {
            System.out.print(M1[j] + " ");
        }
    }
    } 
}