
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cod[] = {300, 301, 302, 303, 304, 305};
        String Item[] = {"Pão de Queijo", "Bauru", "Cachorro Quente", "Cheesburger", "Suco", "Refrigerante"};
        double Preco[] = {1.30, 1.40, 1.50, 1.40, 2.20, 1.00};
        int pedido=1;

        while (pedido != 0){
        ImprimeCardapio (Cod, Item, Preco);
        LerPedido (pedido, Cod, Preco);

        }
    }

    private static void ImprimeCardapio(int[] Cod, String[] Item, double[] Preco) {
        System.out.println("Cardápio: ");
        System.out.print("Código:");
        System.out.print("   Descrição:");
        System.out.print("              Preço:");
        for (int i=0; i<6; i++){
            System.out.print("\n "+Cod[i]);
            System.out.print("       "+Item[i]);
            System.out.print("               "+Preco[i]);
        }
    }

    private static void LerPedido(int pedido, int[] Cod, double[] Preco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nDigite aqui o código do produto que você deseja: ");
        pedido = sc.nextInt();
        double valor = 0;
        while (pedido<300 || pedido>305){
            System.out.println("Código não existe. Digite aqui o código do produto que você deseja: ");
            pedido = sc.nextInt();
        }
        System.out.println("Quantidade: ");
        int qtdd = sc.nextInt();

        for (int i=0; i<6; i++){
            if (pedido == Cod[i]){
                valor = valor + qtdd * Preco[i];
            }

    }
        System.out.println("Preço: " +valor);
}
}
