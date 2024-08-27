
import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in);
        int linha=0, coluna=0;
        int A[][], B[][]

        System.out.println("Numero de linhas par:");
        linha=teclado.nextInt();
        System.out.println("Numero de colunas par:");
        coluna= teclado.nextInt();

        A[][]= Ler(linha,coluna);

    }

    public static int Ler (int a, int b)
    {
        int A[][];
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite os elementos: ");

        for(int l=0; l<a;l++)
        {
            for(int c=0; c<b; c++)
            {
              A[l][c] = teclado.nextInt();  
            }
        }
        return A;

    }
}
