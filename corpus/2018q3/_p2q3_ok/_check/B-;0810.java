
public class questao3 {

    public static void main(String[] args) {
        int[][] a = new int[25][25];

        GeraMatriz(a,25,25);
        imprime(a,25,25);
        transposta(a,25,25);

    }

    public static void GeraMatriz(int Mat[][], int l, int c) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                Mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }    

    public static void imprime(int Mat[][], int l, int c) {
        for (int i = 0; i <l ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("\t" + Mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void transposta(int Mat[][], int l, int c) {
        int[][] b = new int[25][25];
        for (int i = 0; i <l ; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = Mat[j][i];
            }            
        }
    }    

}
