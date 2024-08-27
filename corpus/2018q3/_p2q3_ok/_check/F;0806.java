
public class Questao3 {

    public static void main(String[] args) {

    GeraMatriz(Mat[][],27,27);
    ImprimeMatriz();

    }

    public static void GeraMatriz(int Mat[][], int L, int C){
        for(int i=0;i<L;i++){
            for(int j=0;j<C;j++){
                Mat[i][j] = (int) (Math.random()*10);

            }
        }
    }

     public static void ImprimeMatriz(){
      int i,j;
      int A[][] = null;
         for(i=0;i<27;i++){
            for(j=0;j<27;j++){
             System.out.println(A[i][j]+" ");
             } 
            System.out.println(" ");
     }

    }

          public static int[][] Transposta(){

     }

         public static int[][] Diagonal(){  

}
