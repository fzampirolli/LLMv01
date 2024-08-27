
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
        int cod[] = new int [6];
       String Item[] = new String[6];

       Double Preco[] = new Double [6];

          cod[0] = 300;
          cod[1] = 301;
          cod[2] = 302;
          cod[3] = 303;
          cod[4] = 304;
          cod[5] = 305;

          Preco[0] = 1.30;
          Preco[1] = 1.40;
          Preco[2] = 1.50;
          Preco[3] =  1.40;
          Preco[4] = 2.20;
          Preco[5] =  1.00;

          Item[0] ="Pão de queijo";
          Item[1] ="Bauru";
          Item[2] ="Hot dog";
          Item[3] ="Cheesburguer";
          Item[4] ="Suco";
          Item[5] ="Refrigerante";

        for (int i = 0; i<6;i++)
        {

          System.out.println("Código "+cod[i]+ " Item "+ Item[i]+ " Preço: " +Preco[i]);

       }
        int j,qtd;
                double totalCompra=0;

        do {

        System.out.print("Digite o código do produto ");
        j = ler.nextInt();

         if (j == 300)
        {
            j =1;

        }
          if (j == 301)
        {
             j =2;
        }
           if (j == 302)
        {
             j =3;
        }
            if (j == 303)
        {
             j =4;
        }
             if (j == 304)
        {
             j =5;
        }
              if (j == 305)
        {
             j =6;
        }

        if (j!=0)
        {
         System.out.print("Digite a quantidade do produto ");
         qtd = ler.nextInt();
        totalCompra = totalCompra + ((Preco[j-1]*qtd));
        }

        }
        while(j!=0);

         System.out.println("Código "+cod[j]+ " Item "+ Item[j]+ " Preço total: "+ totalCompra);

    }

}
