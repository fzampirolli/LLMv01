
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) { 
    int L, C, i, j;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a quantidade par de linhas: ");
       L = entrada.nextInt();
       System.out.print("Digite a quantidade par de coluna: ");
       C = entrada.nextInt();
       int A[][] = new int [L][C];
       int B[][] = new int [L][C];
       A=LerVetor(L,C);
       B=CriarB(A,L,C);
       System.out.println("Matriz A:");
       ImprimeVetor(A,L,C);    
       System.out.println("Matriz B:");
       ImprimeVetor(B,L,C);    
    }
    public static int[][] LerVetor(int L, int C) {
       Scanner entrada = new Scanner(System.in);
       int i, j;       
       int A[][] = new int [L][C];
       for(i=0;i<L;i++){
           for(j=0;j<C;j++){
             A[i][j]= entrada.nextInt(); 
           }
       }
     return A; 
    }    
    public static int[][] CriarB(int A[][], int L, int C) {
       Scanner entrada = new Scanner(System.in);
       int i, j, maior =A[L/2][C/2];       
       int B[][] = new int [L][C];
       for(i=0;i<(L/2);i++){
           for(j=0;j<(C/2);j++){
             B[i][j]= 0; 
           }
       }       
       for(i=(L/2);i<(L);i++){
           for(j=(C/2);j<(C);j++){
             if(maior <A[i][j]){
                 maior = A[i][j];
             } 
           }
       }
       for(i=(L/2);i<(L);i++){
           for(j=(C/2);j<(C);j++){
               B[i][j]= maior;
           }
           }
     return B; 
    }
    public static void ImprimeVetor(int A[][], int L, int C) { 
      int i, j;
        for(i=0;i<L;i++){
           for(j=0;j<C;j++){
             System.out.print(A[i][j]+" "); 
           }
           System.out.println(" ");
       }
    }

}
