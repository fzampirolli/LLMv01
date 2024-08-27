
public class Q3P2 {

    public static void main(String[] args) {

        int L=27;
        int C=27;
        int A[][]= new int [L][C];

        GeraMatriz(A,27,27);
        imprimeMatriz(A,27,27);

    }

    static void GeraMatriz(int Mat[][], int L, int C){
        for (int i=0; i<L; i++){
            for (int j=0; j<C; j++){
                Mat[i][j] = (int)(Math.random()*10);
            }
        }
    }
    static void imprimeMatriz(int A[][], int L, int C){
        int i; int j;
        for(i=0;i<27;i++){
            for (j=0;j<27;j++){
               System.out.println(A[i][j] + " ");
            }
        }
    }
}
