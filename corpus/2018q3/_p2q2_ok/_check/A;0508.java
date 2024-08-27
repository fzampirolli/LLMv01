
import java.util.Scanner;

public class GustavoBonomoGuimaraes__gustavo_bonomo__Questao2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n, gpreto = 0, gbranco = 0, r = 0;
        n = in.nextInt(); 

        int A[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                A[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i%2 == 0)
                {
                    if(j%2 == 0)
                    {
                        gpreto += A[i][j];
                    }
                    else
                    {
                        gbranco += A[i][j];
                    }
                }
                else
                {
                    if(j%2 == 0)
                    {
                        gbranco += A[i][j];
                    }
                    else
                    {
                        gpreto += A[i][j];
                    }
                }
            }
        }

        if(gbranco > gpreto) r = 1;
        else if(gbranco == gpreto) r = 2;
        System.out.println(gpreto + "\t" + gbranco + "\t" + r);

    }
}
