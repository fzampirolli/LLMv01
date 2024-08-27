
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double precos[]={1.10,1.30,1.50,1.30,2.00,1.00};
        int cod=1, i=1, quant=0;
        double tot=0;

        while(cod!=0){
            System.out.print("Digite o código do produto (100 a 105): ");
            cod=entrada.nextInt();
            if (cod!=0){
            System.out.print("Digite a quantidade do produto: ");
            quant=entrada.nextInt();
            tot=tot+quant*precos[cod-100];
            }
        }
        System.out.print("Código\t\tItem\t\t1.10\n");
        System.out.print("100\t\tPão de queijo\t\tPreço unitário\n");
        System.out.print("101\t\tBauru\t\tPreço unitário\n");
        System.out.print("102\t\tCachorro Quente\t\tPreço unitário\n");
        System.out.print("103\t\tCheeseburger\t\tPreço unitário\n");
        System.out.print("104\t\tSuco\t\tPreço unitário\n");
        System.out.print("105\t\tRefrigerante\t\tPreço unitário\n");
        System.out.print("Total da compra: "+tot);
    }

}
