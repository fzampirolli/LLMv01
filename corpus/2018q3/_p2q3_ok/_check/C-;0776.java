
public class Q3 {

    static final int C=27, L=27;
    public static void main(String[] args) {

    int A[][] = new int [L][C];
    int B [][] = new int [C][L]; 
    GeraMatriz(A, 27, 27);

    imprimeMatriz(A, 27, 27);

    matrizTransposta(A, 27, 27);

    menorElemento (A);

    System.out.println("Fim");

    }

    static void GeraMatriz (int A[][], int L, int C) {
        for (int i=0; i<L; i++){
            for (int j=0; j<C; j++){
                A[i][j] = (int)(Math.random()*10); 
            }
        }
    }
    static void imprimeMatriz (int A[][], int L, int C){
        for (int i=0; i<L; i++){
            for (int j=0; j<C; j++){
                System.out.print(" " + A[i][j]);

                System.out.println();
            }
    }
}
    static void matrizTransposta (int A[][], int L, int C){

        GeraMatriz (A, 27, 27);
        int B [][] = new int [27][27]; 

        for (int j=0; j<L; j++){
            for (int i=0; i<C; i++){
                System.out.println(" " + B[j][i]);
            }
    }
}
    static int menorElemento (int A[][]){
        int aux = A[1][0];
        for (int i=1; i<L; i++){
            for (int j=0; j<(C/2); j++){
                   if (aux>A[i][j]){
                       aux = A[i][j];
                   } 
            }
    }
            return aux;
}
}
