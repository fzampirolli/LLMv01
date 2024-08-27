
import java.util.Scanner;
public class xadrez {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Entre com o tamanho do tabuleiro: ");
        int valores = 0, i, j = 0, pr=0, br=0, r=0;
        int n = entrada.nextInt();
        int [][] matriz_A = new int [n][n];

            for (i=0; i<n; i++)
		{
		    for (j=0; j<n; j++){
                valores = entrada.nextInt(); 
                matriz_A [i][j] = valores;
            }
        }
        for (int k=0;k<n;k++)
        {
           for (int m=0;m<n;m++)
           {
               if ((k+m)%2 == 0)
               pr = pr + matriz_A[k][m];
               if ((k+m)%2 != 0)
               br = br + matriz_A[k][m];
           }
        }
        if (pr>br)
        {
            r=0;
        }
        else if (br>pr)
        {
            r=1;
        }
        else
        {
            r=2;
        }

                System.out.println (br+" "+pr+" "+r);
    }
}
