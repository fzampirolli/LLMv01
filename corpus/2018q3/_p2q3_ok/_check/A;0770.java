
public class Questao3
{
    public static void main(String[] args)
    {
        int A[][] = new int[25][25], B[][] = new int[25][25];
        GeraMatriz(A, 25, 25);
        ImprimeMatriz(A);
        B = MatrizTransposta(A);
        System.out.println("Maior valor acima da diagonal principal da matriz A: " + MaiorElemento(A));

    }

    static void GeraMatriz(int Mat[][], int L, int C)
    {
        for(int i = 0; i < L; i++)
        {
            for(int j = 0; j < C; j++)
            {
                Mat[i][j] = (int) (Math.random()*10);
            }
        }
    }

    static void ImprimeMatriz(int matriz[][])
    {
        int L = matriz.length, C = matriz[0].length; 

        for(int i = 0; i < L; i++)
        {
            for(int j = 0; j < C; j++)
            {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    static int[][] MatrizTransposta(int matriz[][])
    {
        int L = matriz.length, C = matriz[0].length, matriz_buff[][] = new int[L][C];

        for(int i = 0; i < L; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(i != j)
                {
                    matriz_buff[i][j] = matriz[j][i];
                    matriz_buff[j][i] = matriz[i][j];
                }
                else matriz_buff[i][j] = matriz[i][j];
            }
        }
        return matriz_buff;
    }

    static int MaiorElemento(int matriz[][])
    {
        int L = matriz.length, C = matriz[0].length, maior = matriz[0][1]; 

        for(int i = 0; i < L; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(j > i && matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
}