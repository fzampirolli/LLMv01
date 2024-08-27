
import java.util.Scanner;
public class P2 {

    public static void main(String[] args) {
        int L,C;        
          Scanner entrada = new Scanner(System.in);
          System.out.println("Quantas linhas terá a matriz A?: ");
          L=entrada.nextInt();
          System.out.println("Quantas colunas terá a matriz A?: ");
          C=entrada.nextInt();
          int A[][]=Lematriz(L, C);
          int B[][]= CriaB(A,L,C);
          System.out.println("Matriz A: ");
          Imprimematriz(A,L,C);
          System.out.println("Matriz B: ");
          Imprimematriz(B,L,C);

    }
    public static int[][] Lematriz (int L, int C){
        Scanner entrada = new Scanner(System.in);
        int i=0, j=0;
        int matriz [][]= new int[L][C];
        while(i<L){
            while(j<C){
                System.out.println("Digite o elemento "+i+"x"+j+" da matriz");
                matriz[i][j]=entrada.nextInt();
                j++;                
            }
            i++;
            j=0;
        }
        return matriz;
    }

    public static int[][] CriaB(int[][] M, int L, int C){
        int l, c, i, j, aux=0;
        Scanner entrada = new Scanner(System.in);       
        l=L/2;
        i=l;
        c=C/2;
        j=0;
        while(l<=i & i<L){
            while(j<c-1){
                if(M[i][j]>M[i][j+1] & M[i][j]>aux){
                    aux=M[i][j];
                }
                if(M[i][j]<M[i][j+1] & M[i][j+1]>aux){
                    aux=M[i][j+1];
                }
                j++;
            }
            i++;
            j=0;
        }
        i=0;
        j=0;
        int B [][]= new int [L][C];
        while(i<L){
            while(j<C){
                if(l<=i & j<c){
                    B[i][j]=aux;
                }
                else{B[i][j]=0;}
                j++;
            }
            i++;
            j=0;
        }
        return B;

    }

    public static void Imprimematriz(int[][] N, int L, int C){
        int i=0, j=0;
        Scanner entrada = new Scanner(System.in);    
        while(i<L){
            while(j<C){
                System.out.print(" "+N[i][j]+" ");
                j++;
            }
            System.out.println("");
            i++;
            j=0;
        }
    }
}
