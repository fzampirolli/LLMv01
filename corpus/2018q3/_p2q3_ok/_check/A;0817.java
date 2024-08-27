
import java.lang.Math;

public class Q3 {
    public static int lado = 27;
    public static int [] [] Matriz=new int [lado][lado];
    public static int [] [] Matriz2;

    public static void GeraMatriz(int Mat[][],int L, int C){
        for(int i =0;i<L;i++){
            for(int j=0;j<C;j++){
                Mat[i][j]=(int)(Math.random()*10);
            }
        }
    }

    public static void ImprimeMatriz(int Mat[][],int L, int C){
        for(int i =0;i<L;i++){
            for(int j=0;j<C;j++){
               System.out.print(Mat[i][j]+" "); 
            }
            System.out.println();
        }
    }
        public static int[][] matrizTransposta(int Mat[][],int l){
        int [] [] Mat2=new int [lado][lado];
        for(int i =0;i<l;i++){
            for(int j=0;j<l;j++){
               Mat2[i][j]=Mat[j][i];
            }
            System.out.println();
        }
        return Mat2;
    }
  public static int MaiorElemento(int Mat[][],int l){
        int Maior=Mat[0][1];
        for(int i =0;i<l;i++){
            for(int j=i+1;j<l;j++){
               if(Maior<Mat[j][i]){
                   Maior=Mat[j][i];
               }
            }
        }
        return Maior;
    }

    public static void main(String[] args) {
        GeraMatriz(Matriz,lado,lado);
        System.out.println ("Matriz A");
        ImprimeMatriz(Matriz,lado,lado);
        Matriz2=matrizTransposta(Matriz,lado);
                System.out.println ("Matriz b");
        ImprimeMatriz(Matriz2,lado,lado);
        System.out.println ("Maior elemento do tringulo superior de A:"+MaiorElemento(Matriz,lado));
    }

}
