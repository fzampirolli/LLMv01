
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Codigo[] = {300, 301, 302, 303, 304, 305};
        String Item[] = {"Pão de Queijo", "Bauru", "Cachorro quente", "Cheeseburger", "Suco", "Refrigerante"};
        double Preco[] = {1.30, 1.40, 1.50, 1.40, 2.20, 1.00};

        int codEscolhido;
        int qtdEscolhido;
        double total = 0;

        ImprimeCardapio(Codigo, Item, Preco);

        do
        {   
            System.out.print("Digite o código do produto(300 a 305): ");
            codEscolhido = sc.nextInt();
            if(codEscolhido == 0)
            {
                break;
            }

            System.out.print("Digite a quantidade do produto: ");
            qtdEscolhido = sc.nextInt();

            total = total + (qtdEscolhido * Preco[codEscolhido - 300]);
        }
        while(codEscolhido != 0);

        System.out.println();
        ImprimeCardapio(Codigo, Item, Preco);
        System.out.println("Total da compra: " + total);

    }

    private static void ImprimeCardapio(int[] Codigo, String[] Item, double[] Preco) {

        System.out.println("Código  Item    Preço unitário");
        for(int n = 0; n < 6; n++)
        {
            System.out.print(Codigo[n] + "      " + Item[n] + "   " + Preco[n]);
            System.out.println();
        }
        System.out.println();
    }

}
