
import java.util.Scanner;
public class LuanFelipeSampaio__luan_sampaio__Questao_2 
{
    public static void main(String[] args) 
    {
       Scanner scan=new Scanner(System.in);
       int somapreto=0, somabranco=0;

       int n=scan.nextInt(); 

       int A[][]=new int[n][n];

    for(int c=0;c<n;c++)
    {   for (int l=0;l<n;l++)
        {
        A[c][l]=scan.nextInt();
        }
    }

    for(int c=0;c<n;c++)
    {   for (int l=0;l<n;l++)
        {
        if((c==l)||(c-l==2)||(c-l==-2))
        {
            somapreto=somapreto+A[c][l];
        }
        else
        {
            somabranco=somabranco+A[c][l];
        }
        }
    }

    if (somapreto>somabranco)
    {
        System.out.println(somapreto+" "+somabranco+" 0");
    }
    else if (somapreto<somabranco)
    {
        System.out.println(somapreto+" "+somabranco+" 1");
    }
    else
    {
        System.out.println(somapreto+" "+somabranco+" 2");
    }
    }

}
