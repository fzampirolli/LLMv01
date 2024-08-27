
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int pedido, qtd;
        float total = 0;
        int codigo[] = {300, 301, 302, 303, 304, 305};
        String item[] = {"Pao de Queijo", "Bauru    ", "Cachorro Quente", "Cheeseburguer", "Suco    ", "Refrigerante"};
        float preco[] = {13 , 14 , 15 , 14 , 22 , 10};

        System.out.println("Codigo\tItem    \t\tPreco Unitario");
        for(int i=0; i<6; i++){
            System.out.println(codigo[i] + "\t" + item[i] + "\t\t" + preco[i]/10);
        }
        System.out.println();
        System.out.print("Digite o codigo do produto (300 a 305): ");
        pedido = ent.nextInt();
        while(pedido != 0){
            System.out.print("Digite a quantidade do produto: ");
            qtd = ent.nextInt();
            total = preco[pedido-300]/10 * qtd + total;
            System.out.print("Digite o codigo do produto (300 a 305): ");
            pedido = ent.nextInt();
        }
        System.out.println();
        System.out.println("Total da compra: " + total);
    }
}
