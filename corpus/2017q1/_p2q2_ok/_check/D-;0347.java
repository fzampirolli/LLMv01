
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int cod [] = {100,101,102,103,104,105};
        double custo [] = {1.10,1.30,1.50,1.30,2.00,1.00};
        String item [] = new String [6];

        System.out.print("Código" + "\t" + "Item" + "\t" + "Preço Unitário");
        System.out.println();
        for (int i=0; i<6; i++)
            System.out.println( cod [i] +  "\t" + "Pao de Queijo\t"  + custo [i]);    
        }

    }
