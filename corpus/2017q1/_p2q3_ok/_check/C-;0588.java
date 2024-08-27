
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz: ");
        int L = entrada.nextInt();

        System.out.println("Digite o número de colunas da matriz: ");
        int C = entrada.nextInt();

        int A[][] = new int[L][C];

        LerMatriz(A);
        AlteraMatriz(A);

    }
    public static void LerMatriz(int M[][]){
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<L; i++){
            for(int j=0; j<C; j++){
             System.out.println("Digite o elemento["+i+"]["+j+"] da matriz: ");
             M[i][j] = entrada.nextInt();
            }
        }
  }
    public static void AlteraMatriz(int M[][]){
      int B[][] = new int [L][C];

        for(int i=0; i<(L/2); i++){
          for(int j= 0; j<(C/2); j++){
              if(M[1-i][1-j]>M[i][j]){
                 B[i][j] = M[1-i][1-j]; 
        }
              else{
                  B[i][j] = M[i][j];
              }
      }  
    }
}
}