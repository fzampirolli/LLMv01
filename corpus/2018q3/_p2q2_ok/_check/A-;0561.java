
import java.util.Scanner;

public class Ex2matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as dimensoes da matriz: ");
	int n = entrada.nextInt();
        int m[][] = new int [n][n];

        for (int l=0; l<m.length; l++)
        {
            for (int c=0; c<m.length; c++)
            {
                System.out.print("Digite o elemento da linha "+l+" e coluna "+c+": ");
                m[l][c] = entrada.nextInt();
            }
        }

        System.out.println("");

        for (int l=0; l<m.length; l++)
        {
            for (int c=0; c<m.length; c++)
            {
                System.out.print(m[l][c]);
                System.out.print(" ");              
            }
             System.out.println();
        }

        int sp1=0;
        for (int i=0; i<m.length; i=i+2)
        {
            for (int j=0; j<m.length; j=j+2)
            {
                sp1=sp1+m[i][j];                
            }
        }

        int sp2=0;
        for (int i=1; i<m.length; i=i+2)
        {
            for (int j=1; j<m.length; j=j+2)
            {
                sp2=sp2+m[i][j];                
            }
        }

        int sb1=0;
        for (int i=0; i<m.length; i=i+2)
        {
            for (int j=1; j<m.length; j=j+2)
            {
                sb1=sb1+m[i][j];                
            }
        }

         int sb2=0;
        for (int i=1; i<m.length; i=i+2)
        {
            for (int j=0; j<m.length; j=j+2)
            {
                sb2=sb2+m[i][j];                
            }
        }

        int spreto=sp1+sp2, sbranco=sb1+sb2, r;        
        if (spreto>sbranco)
        {
            r=0;
        }

        else if (spreto<sbranco)
        {
            r=1;
        }
        else 
            r=2;

        System.out.println();
        System.out.println(spreto+" "+sbranco+" "+r);

    }

}
