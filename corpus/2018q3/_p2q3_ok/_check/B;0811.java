
public class exerc3 {

    public static void GeraMatriz(int Mat[][], int L, int C){
        for(int i=0; i<L; i++){
            for(int j=0; j<C; j++){
                Mat[i][j] = (int) (Math.random()*10);
            }
        }
    }

    public static void imprimeMatriz(int Mat[][]){
        for(int i=0; i<Mat[0].length; i++){
            for(int j=0; j<Mat[1].length; j++){
                System.out.printf("%d ", Mat[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int[][] matrizTransposta(int Mat[][]){
        int aux;

        for(int i=0; i<Mat[0].length/2; i++){

                aux = Mat[i][i+1];
                Mat[i][i+1] = Mat[i+1][i];
                Mat[i+1][i] = aux;

        }
        return Mat;
    }

    public static int MaiorTriangulo(int Mat[][]){
        int maior = 0;
        for(int i=0; i<Mat[0].length; i++){
            for(int j=0; j<Mat[1].length; j++){
                if( i > j ){
                    if (Mat[i][j] > maior){
                        maior = Mat[i][j];
                    }
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        int MatrizA[][] = new int [4][4];
        int MatrizB[][] = new int [4][4];

        GeraMatriz(MatrizA, 4, 4);

        imprimeMatriz(MatrizA);

        System.out.println("\n");

        MatrizB = matrizTransposta(MatrizA);
        imprimeMatriz(MatrizB);

        System.out.printf("\nO maior elemento do triângulo inferior a diagonal de A é: %d", MaiorTriangulo(MatrizA));
    }

}
