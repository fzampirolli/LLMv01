
import java.util.Scanner;

public class Questao_1 
{

    public static void main(String[] args) 
    {

        Scanner scan=new Scanner(System.in);
        int a,c,d,temp;

    System.out.println("Qual o tamanho do vetor?\n");
    int i=scan.nextInt();

    int V[]=new int[i];

    for(c=0;c<V.length;c++)
    {
         System.out.println("Digite o valor da posição: "+(c+1));
        V[c]=scan.nextInt();
    }
    System.out.println();

    int meio=(V.length-1)/2;

    for(a=0;a<meio;a++)
    {
        if (V[a]<V[(i-1)-a])
        {
            temp=V[a];
            V[a]=V[(i-1)-a];
            V[(i-1)-a]=temp;
        }
    }

    System.out.println("O vetor semiparticionado é:\n");

    for(d=0;d<V.length;d++)
    {
        System.out.print(" "+V[d]);
    }
  System.out.println();
    }

}
