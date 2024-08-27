
import java.util.Scanner;

public class P2Ex2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int i,c,x=0,qt;
        double total=0;
        String Item[] = {"Pão de Queijo","Bauru","Cachorro Quente","Cheeseburguer","Suco","Refrigrante"};
        int codigo[] = {300,301,302,303,304,305};
        double preco[]={1.30,1.40,1.50,1.40,2.20,1.00};

         System.out.println("Código" + " Item" + "      Preço Unitário");
        for(i=0;i<6;i++)
        {

            System.out.println(codigo[i]+ "   " +Item[i] + "    " + preco[i]);
        }

        System.out.println("Digite o código do produto(300 a 305) : ");
        c = entrada.nextInt();

        while(c!=0)
        {
            for( i=0;i<6;i++)
            {
                if(codigo[i]== c)
                {
                    System.out.println("Digite a quantidade do produto: ");
                    qt = entrada.nextInt();
                    total = total + preco[i]*qt;

                }

            }

            System.out.println("Digite um código entre 300 a 305");
            c = entrada.nextInt();
        }

        System.out.println("Total da compra: " + total);

    }

}
