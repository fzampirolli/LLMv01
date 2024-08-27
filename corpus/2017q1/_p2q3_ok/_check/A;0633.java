
import java.util.Scanner;

public class P2Ex3 {

    public static void ImprimeMatriz(int A[][], int L, int C)
    {
        for(int i=0;i<L;i++)
        {
            System.out.println("");
            for(int j=0;j<C;j++)
            {
                System.out.print(A[i][j]);

            }

        }

        System.out.println(" ");
    }

    public static int[][] MatrizB(int A[][], int L,int C)
    {
        int aux,i,j;

        aux = A[0][0];

        for( i=0;i<L/2;i++)
        {
            for( j=0;j<C/2;j++)
            {
                if(A[i][j]>aux)
                {
                    aux = A[i][j];

                }

            }
        }

       for( i=0;i<L/2;i++)
        {
            for( j=0;j<C/2;j++)
            {
                A[i][j] = aux;

            }
        }

       for(i=L/2;i<L;i++)
       {
           for(j=0;j<C;j++)
           {
               A[i][j]= 0;
           }
       }

       for(i=0;i<L;i++)
       {
           for(j=C/2;j<C;j++)
           {
               A[i][j] = 0;
           }
       }

    return A;
}

    public static int[][] LerMatriz(int A[][], int L,int C)
    {
        Scanner entrada= new Scanner(System.in);
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.println("Digite um número");
                A[i][j]= entrada.nextInt();
            }

        }

        return A;

    }

    public static void main(String[] args) {
        int C,L;

        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite o número de Linhas par");
        L = entrada.nextInt();
        System.out.println("Digite o número de colunas par");
        C = entrada.nextInt();

        while(L%2!=0 || C%2!=0)
        {
        System.out.println("Digite o número de Linhas par!"  );
        L = entrada.nextInt();
        System.out.println("Digite o número de colunas par! " );
        C = entrada.nextInt();
        }
         int A[][] = new int[L][C];
         int B[][] = new int[L][C];
       A= LerMatriz(A,L,C);
        System.out.println("Matriz A ");
       ImprimeMatriz(A,L,C);
        System.out.println("Matriz B ");
      B= MatrizB(A,L,C); 
        ImprimeMatriz(B,L,C);

    }

}
