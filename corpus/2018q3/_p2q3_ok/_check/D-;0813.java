
public class 3 {
public static void GeraMatriz(int Mat[][],int L,int C){
    for (int i=0;i<L;i++){
         for (int j=0;j<C;j++){
             Mat[i][j]=(int)(Math.random()*10);
         }
    }
}
public static void Imprime_MatrizA (int Mat[][]){
    for (int l=0;l<Mat.length;l++){
         for (int c=0;c<Mat.length;c++){
             System.out.print(Mat[l][c]+" ");
         }
         System.out.println();
    }
}
public static void matriz_TranspostaA (int Mat[][], int MatB[][]){
    for (int i=0;i<Mat.length;i++){
         for (int j=0;j<Mat.length;j++){
             if (i==j){
                 MatB[i][j]=Mat[i][j];
             } else {
                MatB[i][j]=Mat[i+1][j+1]; 
             }
         }
         System.out.println();
    }
}
public static int media (int MatA[][],int media){
    int n=0;
    for (int i=0;i<MatA.length;i++){
         for (int j=0;j<MatA.length;j++){
             if (i==j-1){
            n=n+1;    
             media = (MatA[i][j]+media)/n;  
             }
         }
    }
    return media;
}
    public static void main(String[] args) {
       int L=21,C=21;
       int media = 0;
       int MatA [][] = new int [L][C]; 
       int MatB [][] = new int [L][C]; 
       System.out.println("Matriz A");
       Imprime_MatrizA(MatA);
       System.out.println("Matriz transposta de A");
      matriz_TranspostaA(MatA,MatB);
      System.out.println("Média");
      media(MatA,media);
    }

}
