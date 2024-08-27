
public class Questao_3 
{
    public static void main(String[] args) 
    {
        int L=21,C=21;
        int A[][]=new int [L][C];

        Geramatriz(A,L,C);
        Imprimematriz(A,L,C);
        MatrizTransposta(A,L,C);
        Maior(A,L,C);
    }
    public static int[][] Geramatriz(int A[][],int L, int C)
    {
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<C;j++)
            {
                A[i][j]=(int)(Math.random()*10);
            }
        }

    return A;
    }

    public static void Imprimematriz(int A[][],int L,int C)
    {
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(" "+A[i][j]);
            }
        System.out.println();    
        }
    }

    public static int [][] MatrizTransposta(int A[][],int L,int C)
    {   
        int B[][]=new int[21][21];

        for(int i=0;i<L;i++)
        {
            for(int j=0;j<C;j++)
            {
                B[i][j]=A[j][i];
            }

        }

    return B;    
    }

    public static void Maior(int A[][],int L,int C)
    {
        int maior=A[1][0];

        for(int i=0;i<L;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(i>=j)
                {   
                    if(maior<A[i][j])
                    {
                    maior=A[i][j];
                    }
                }
            }
        }
        System.out.println("\nO maior é "+maior); 
    }
}
