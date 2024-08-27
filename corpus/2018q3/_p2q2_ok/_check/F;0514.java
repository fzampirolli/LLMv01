
public class exercicio2 {

    public static void main(String[] args) {
        int L=25;
        int C=25;

        int[][]retorno= geraMatriz();
        int[][]retorno2=imprimeMatriz();
        int[][]retorno3=matrizTransposta();

        for (int i=0;i<L;i++){
        for(int j=0;j<C;j++){

            System.out.println(retorno2[i][j]);
        }
        }
    }
    static int [][] geraMatriz(){

        int L=25;
        int C=25;
        int [][]Mat=new int[L][C];
        for (int i=0;i<L;i++){
        for(int j=0;j<C;j++){
            Mat[i][j]=(int)(Math.random()*10);

        }
        }
        return Mat;

    }
    static int[][] imprimeMatriz(){
        int L=25;
        int C=25;
        int[][]Mat=new int[L][C];
      for (int i=0;i<L;i++){
        for(int j=0;j<C;j++){
            System.out.println(Mat[i][j]);
        }
        }

    return Mat; }

    static int[][]matrizTransposta(){
       int L=25;
       int C=25;
       int[][]Mat=new int[L][C];   
     for (int i=0;i<L;i++){
        for(int j=0;j<C;j++){
            Mat[i][j]=Mat[j][i];
        }
        }

    return Mat; }
}
