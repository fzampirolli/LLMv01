
public class Questao03 {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int L, C;
    int A[][] = new int [L][C];

    LerMatriz(A);
    MatrizB(B);
    ImprimeMatriz(A);
    ImprimeMatriz(B);

    }

    public static void LerMatriz(int Mat1[][]) {

    int l, c;

    System.out.println("Digite o número de linhas:");
    L = entrada.nextInt();

    System.out.println("Digite o número de colunas:");
    C = entrada.nextInt();

    for(l = 0, l < L, l++) {

    for(c = 0, c < C, c++) {

    System.out.println("Digite o elemento da linha" + l "e coluna" + c ":");

    }
    }

    return Mat1 [][];

    }

    public static void MatrizB(int Mat1[][]) {

    int N = 0, L, C, i, j;
    int A[][] = new int [L][C];
    int Mat1 = new int [i][j];

    for(L = 2, L < 4, L++) {

    for(C = 2, C < 4, C++) {

    if (A[2][2]>A[2][3] && A[2][2]>A[3][2] && A[2][2]>A[3][3]){

        N = A[2][2];        
    }

    if (A[2][3]>A[2][2] && A[2][3]>A[3][2] && A[2][3]>A[3][3]){

        N = A[2][3];         
    }

     if (A[3][2]>A[2][2] && A[3][2]>A[2][3] && A[3][2]>A[3][3]){

        N = A[3][2];         
    }

      if (A[3][3]>A[2][2] && A[3][3]>A[3][2] && A[3][3]>A[3][2]){

        N = A[3][3];         
    }

    }
    }

    Mat1 [2][2] = Mat1 [2][3] = Mat1 [3][2] = Mat1 [3][3] = N; 
    Mat1 [0][0] = Mat1 [0][1] = Mat1 [0][2] = Mat1 [0][3] = Mat1 [1][0] = Mat1 [1][1] = Mat1 [1][2] = Mat1 [1][3] = Mat1 [2][0] = Mat1 [2][1] = Mat1 [3][0] = Mat1 [3][1] = 0;

    return Mat1 [][]

    }

    public static void ImprimeMatriz(int Mat1[][]) {

    for(l = 0, l < L, l++) {

    for(c = 0, c < C, c++) {

    System.out.println(Mat1[][]);

    }
    }

    }    

}
