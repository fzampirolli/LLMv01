
import java.util.Scanner;

public class questaodois {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        float preco[] = new float[6];
        float total = 0;

        String[] item = new String[6];

        int codigo[] = new int[6];
        int point;
        float quantidade;
        float entrada;
        int loop;
        boolean continuar = true;

        preco[0] = (float) 1.1;
        preco[1] = (float) 1.3;
        preco[2] = (float) 1.5;
        preco[3] = (float) 1.3;
        preco[4] = 2;
        preco[5] = 1;

        codigo[0] = 100;
        codigo[1] = 101;
        codigo[2] = 102;
        codigo[3] = 103;
        codigo[4] = 104;
        codigo[5] = 105;

        item[0] = "Pao de Queijo";
        item[1] = "Bauru";
        item[2] = "Cachorro Quente";
        item[3] = "Cheeseburguer";
        item[4] = "Suco";
        item[5] = "Refrigerante";

        while (continuar == true) {
            System.out.println("Digite o codigo do produto (100 a 105) ");
            entrada = c.nextInt();

            if (entrada != 0) {
                point = (int) (entrada - 100);
                System.out.println("Digite a quantidade: ");
                quantidade = c.nextFloat();
                total = total + (preco[point] * quantidade);

            } else {
                continuar = false;
            }
        }

        System.out.println("");
        System.out.println("Código        Item       Preço unitário");
        for (loop = 0; loop < 6; loop++) {
            System.out.print(codigo[loop]);
            System.out.print("         ");
            System.out.print(item[loop]);
            System.out.print("           ");
            System.out.print(preco[loop]);
            System.out.println("       ");

        }
        System.out.print("Total da compra: ");
        System.out.print(total);

    }
}
