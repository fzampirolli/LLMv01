
import java.util.Scanner;

public class 3 {

    public static void main(String[] args) {
        int A[][]= new int[23][23];
        GeraMatriz(A,23,23);
        imprimeMatriz(A,23,23);
        int B = matrizTransposta(A,23,23);
    }

static void GeraMatriz(int Mat[][], int L, int C){
    Scanner entrada = new Scanner (System.in);
    for(int i=0;i<L;i++){
        for(int j=0; j<C; j++){
            Mat[i][j] = (int)(Math.random()*10);
            System.out.print(" ");            
        }
     System.out.println(" ");
    }}

   static int  imprimeMatriz(int Mat[][],int L, int C){ 
    for(int i=0;i<L;i++){
        for(int j=0; j<C; j++){
            System.out.print(" "+Mat[i][j]);
                               }

            System.out.println(" ");
                        }
     System.out.println(" ");
   return(Mat[L][C]);
   }

static int matrizTransposta(int Mat[][],int L, int C){ 
    for(int i=0;i<L;i++){
        for(int j=0; j<C; j++){
        Mat[j][i]= Mat[i][j];    
         System.out.print(" "+Mat[i][j]); 
        }
         System.out.println(" ");
    }
     System.out.println(" ");
return(Mat[L][C]);
}

}
