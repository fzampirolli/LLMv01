
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

   Scanner leia=new Scanner (System.in);
   Scanner ler = new Scanner (System.in);

   int Codigo []=new int[5];
   String Item[]=new String[5];
   float PrecoUni[]=new float[5];
   int Cod = 1;

   for (int i=0;i<5;i++)
   {
       System.out.println("Digite o Codigo nº "+ i+": ");
       Codigo[i]=leia.nextInt();
   }
       for (int c=0;c<5;c++)
   {
       System.out.println("Digite nome do Item de codigo  "+Codigo[c]+": ");
       Item[c]=ler.nextLine();
   }
       for (int i=0;i<5;i++)
       {
       System.out.println("Digite o Preco do produto de codigo  "+Codigo[i]+": ");
       PrecoUni[i]=leia.nextFloat();
       }

       for (int j=0;j<5;j++){
           System.out.println("Item "+Item[j]+"Preço unitário : "+PrecoUni[j]+"Codigo "+Codigo[j]);
           System.out.println("\n");
       }

while(Cod!=0)
{
    float soma;
    System.out.println(" CAIXA \n Digite o codigo do produto a ser somado: ");
    Cod=leia.nextInt();

}

    }

}
