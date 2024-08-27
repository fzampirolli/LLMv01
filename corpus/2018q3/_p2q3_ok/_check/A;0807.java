import java.util.Scanner;

public class exercicio3 {

    static void GeraMatriz (int Mat[][], int L, int C){
        for(int i=0; i<L; i++){
            for(int j=0; j<C; j++){
                Mat[i][j]=(int) (Math.random()*10);                
            }       
        }
    }

    static void imprimeMatriz (int A[][]){
        int n = A.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    static int[][] matriztransposta (int A[][]){
        int n = A.length;
        int aux=1;
        int ajuda;
        for(int i=0; i<n; i++){
                for(int j=aux; j<n; j++){
                    ajuda=A[i][j];
                    A[i][j]=A[j][i];
                    A[j][i]=ajuda;
                }
            aux++;
        }
        return A;
    }

    static int maiorElementoT (int A[][]){
        int n = A.length;
        int aux=1;
        int maiorElemento=0;

        for(int i=0; i<n; i++){
                for(int j=aux; j<n; j++){
                    if(A[j][i]>maiorElemento){
                        maiorElemento=A[j][i];
                    }
                }
            aux++;
        }
        return maiorElemento;

    }

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int n;
        int maiorElemento;

        System.out.println("Digite o valor de n");
        n =teclado.nextInt();
        System.out.print("\n");

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        GeraMatriz(A,n,n);
        System.out.println("Matriz A:");
        imprimeMatriz (A);

        B = matriztransposta(A);

        System.out.println("Matriz B:");
        imprimeMatriz (B);

        maiorElemento = maiorElementoT(A);
        System.out.println("Maior Elemento do triangulo em A");
        System.out.println(maiorElemento);

    }

}
