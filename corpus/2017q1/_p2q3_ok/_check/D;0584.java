
import java.util.Scanner;

public class P2Questao3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
              int linha, c = 0, i, j;

      System.out.println("Escreva a quantidade de linhas desejadas da matriz A: ");
      linha = entrada.nextInt();
      if (linha%2==0){
      System.out.println("Escreva a quantinha de colunas desejadas da matriz A: ");
      c = entrada.nextInt();
      }
      if(c%2==0){
      int A[][]=new int [linha][c];
      System.out.println("Digite os elementos da matriz A: ");
      for(i=0;i<linha;i++){
          for(j=0;j<c;j++){
              A[i][j]=entrada.nextInt();
          }
      }
       System.out.println("Matriz A: ");
      for(i=0;i<linha;i++){
          for(j=0;j<c;j++){
              System.out.print(A[i][j] + " ");
          }
          System.out.println(" ");
      }

      int imaior=0, jmaior=0;      

    for(i=0;i<linha;i++){
        for(j=0;j<c;j++){
            if(A[i][j]>A[imaior][jmaior]){
                A[imaior][jmaior]= A[i][j];

      int B[][]= new int [linha][c];
       System.out.println("Matriz B: ");
      for(i=0;i<linha;i++){
          for(j=0;j<c;j++){

              B[2][0] = A[i][j];
              B[2][1] = A[i][j];
              B[3][0] = A[i][j];
              B[3][1] = A[i][j];
              System.out.print(B[i][j] + " ");
          }
          System.out.println(" ");
      }

    }
    }
}
      }
    }
}
