
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int ind=0;
        int quant=0;
        double total=0.0;
        int codigo[] = {300, 301, 302, 303, 304, 305};
        double preco[] = {1.30, 1.40, 1.50, 1.40, 2.20, 1.00};
        String item[] = {"Pão de Queijo", "Bauru", "Cachorro quente", "Cheeseburguer", "Suco", "Refrigerante"};

        for (ind=0; ind<6; ind++) {
        System.out.print ("\n"+codigo[ind]+" ");
        System.out.print (item[ind]+" ");
        System.out.print (preco[ind]+ " ");
        }        

        System.out.println("\nDigite o código do produto (300 a 305): ");
        codigo [ind] = entrada.nextInt();

        System.out.println ("Digite a quantidade do produto: ");
        quant = entrada.nextInt();
        }

    }

}
