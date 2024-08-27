import java.util.Scanner;
public class P23 {
    public static void main(String[] args)
    {
        int n, i, j, aux;
        Scanner fin=new Scanner(System.in);

        System.out.println("Defina o tamanho do vetor:");
        n=fin.nextInt();
        int V[]=new int[n], M[][]=new int[n][n];

        for(aux=0; aux<n; aux++){
            System.out.println("Digite um elemento do vetor:");
            V[aux]=fin.nextInt();
        }
        M=CriarMatriz(V, n);
        ImprimirMatriz(M, n);
        MediaMatriz(M, n);
    }

    private static int[][] CriarMatriz(int [] N, int n) {
        int A[][]= new int[n][n], i, j;
        Scanner fin=new Scanner(System.in);
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i!=j){
                    System.out.println("Digite um valor para a matriz");
                    A[i][j]=fin.nextInt();
                }else if(i==j){
                    A[i][j]=N[i];
                }
            }
        }
        return A;
    }

    private static void ImprimirMatriz(int[][] M, int n) {
        int i, j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(M[i][j]+" ");
                if(j==(n-1)){
                    System.out.println();
                }
            }
        }

    }

    private static void MediaMatriz(int[][] M, int n) {
        int i, j;
        double conta, soma=0;

        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                conta=(M[i][j])%5;
                if(conta==0){
                    soma+=M[i][j];
            }
        }
    }
        System.out.println("A média é: "+soma);
}

}
