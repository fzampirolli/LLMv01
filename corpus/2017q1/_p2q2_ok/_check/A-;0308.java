
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Codigo[] = new int[6];
        int Cod = 0;
        int CodPedido = 0;
        int Qtd = 0;
        double PrecoTotal = 0;
        String ItemPedido;
        Codigo[0] = 300;
        for (int i = 0; i < 5; i++) {
            Codigo[i + 1] = Codigo[i] + 1;
        }

        String Item[] = new String[6];
        Item[0] = "Pão de queijo";
        Item[1] = "Bauru";
        Item[2] = "Cachorro Quente";
        Item[3] = "Cheeseburguer";
        Item[4] = "Suco";
        Item[5] = "Refrigerante";

        Double Preco[] = new Double[6];
        Preco[0] = 1.3;
        Preco[1] = 1.4;
        Preco[2] = 1.5;
        Preco[3] = 1.5;
        Preco[4] = 2.2;
        Preco[5] = 1.0;

        do {
            System.out.print("DIGITE O CÓDIGO DO SEU PEDIDO: \n");
            Cod = scn.nextInt();
            for (int i = 0; i < 6; i++) {
                if (Codigo[i] == Cod) {
                    ItemPedido = Item[i];
                    System.out.print("DIGITE A QUANTIDADE DE " + ItemPedido + " \n");
                    Qtd = scn.nextInt();
                    PrecoTotal = PrecoTotal + Qtd * Preco[i];
                }
            }
        } while (Cod != 0);
        System.out.print("Cardápio: \n");
        for (int i = 0; i < 6; i++) {
            System.out.print(Codigo[i] + " " + Item[i] + " " + Preco[i]+"\n");
        }
        System.out.print("PREÇO TOTAL: "+PrecoTotal+"\n");

    }

}
