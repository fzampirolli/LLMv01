
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tamanho = new Scanner(System.in);
        System.out.printf("Insira um número par para a quantidade de linhas para a matriz");
        int L = tamanho.nextInt();
        System.out.printf("Insira um número par para a quantidade de colunas para a matriz");
        int C = tamanho.nextInt();
        int A[][] = LeiaMatriz(L,C);
        int B[][] = MudaMatriz(A,L,C);
                    Imprime(A,L,C,"Matriz A");
                    Imprime(B,L,C,"Matriz B")

    }

     public static int[][] LeiaMatriz(int linha, int coluna){

         Scanner matriz = new Scanner(System.in);
         int m[][] = new int[linha][coluna];

         for(int i = 0; i<linha;i++){
             for(int j = 0; j< coluna; j++ ){
                 System.out.printf("Insira o elemento"+i+","+j+"da matriz");
                 m[i][j] = matriz.nextInt();
             }
         }
         return m;
     }
      public static int [][] = MudaMatriz( int m[][],int linha1 int coluna1){

         int matrizsalva[][] = new int[Linha1][coluna1];
         int q3lin = linha 1/2;
         int q3col = coluna1/2 - 1;
         int numMaior = 0;

         for( int i = q3lin;i<linha1;i++){
             for(int j = q3col; j<coluna1;j++){
                 if(i>= q3lin&&J<=q3col){
                     matrizsalva[i][j] =numMaior;

                 }
                 else{matrizsalva{[i][j]=0;
             }
         }
      }
             return matrizsalva;

}
          public static void Imprime(int m[][], int linha2, int coluna2,String nome){
              System.out.println(nome);
              for(int i - 0; i, linha2;i++){
                  for(int j = 0; j< coluna2;j++)
              }
          }
