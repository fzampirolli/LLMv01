
import java.util.Scanner;

public class Cardapiolanchonete2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a = 1, b, c, soma = 0;
        int z;
        int Cod[] = {100, 101, 102, 103, 104, 105};
        String Item[] = {"Pao de Quijo", "Bauru", "Cachorro quente", "Cheeseburger", "Suco", "Refrigerante"};
        double Pre[] = {(1.10), (1.30), (1.50), (1.30), (2.00), (1.00)};

        System.out.println("Codigo  Item             Preco unitário");

        for (int i=0; i<6; i++){
           System.out.print(Cod[i]);
           System.out.print("     ");
           System.out.print(Item[i]);
           System.out.print("   ");
           System.out.print(Pre[i]);
           System.out.println();
        }
        System.out.println();
        while(a != 0){
        System.out.println("Digite o codigo do produto (100 a 105) epara encerrar digite 0:");
        a = entrada.nextDouble();
        while(a != 0){
        System.out.println("Digite a quantidade desejada:");
        b = entrada.nextDouble();
        z = a-100;
        c = b*Pre[z];
        soma = soma+c;
        }
        }

        System.out.print("Valor Total:");
        System.out.println(soma);

    }

}
