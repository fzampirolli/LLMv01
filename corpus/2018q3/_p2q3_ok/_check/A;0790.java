
public class Ex3 {

	static int i = 0;
    public static void main(String[] args) {

        int tam = 21; 

        int[][] A = new int[tam][tam]; 
        GeraMatriz(A, tam, tam);
        imprimeMatriz(A);
        int[][] B = matrizTransposta(A);
        MenorValor(A);
    }

    public static void GeraMatriz(int Mat[][], int L, int C)
    {
        for(i = 0; i < L; i = i + 1)
        {
            for(int j = 0; j < C; j = j + 1)
            {
                Mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public static void imprimeMatriz(int Mat[][])
    {
        int tam = Mat.length; 

        for(i = 0; i < tam; i = i + 1)
        {
            for(int j = 0; j < tam; j = j + 1)
            {
                System.out.print(Mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] matrizTransposta(int Mat[][])
    {
        int tam = Mat.length; 
        int[][] Transposta = new int[tam][tam];

        for(i = 0; i < tam; i = i + 1)
        {
            for(int j = 0; j < tam; j = j + 1)
            {
                Transposta[j][i] = Mat[i][j];
            }
        }

        return Transposta;
    }

    public static void MenorValor(int Mat[][])
    {
        int tam = Mat.length; 
        int MenorValor = Mat[0][1];

        for(i = 0; i < tam; i = i + 1)
        {
            for(int j = 0; j < tam; j = j + 1)
            {
                if(j > i)
                {
                    if(Mat[i][j] < MenorValor)
                    {
                       MenorValor = Mat[i][j];
                    }
                }
            }
        }

        System.out.println("Menor dos elementos do triangulo superior a diagonal: " + MenorValor);
    }

}
