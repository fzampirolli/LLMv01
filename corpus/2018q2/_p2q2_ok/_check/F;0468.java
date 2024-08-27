
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[];
        int fileiras, cadeiras;
        int fs, cs;
        System.out.println("Quantas fileiras estão vendidas? ");
        fileiras = entrada.nextInt();
        fs = 20 - fileiras;
        System.out.println("Quantas cadeiras estão vendidas? ");
        cadeiras = entrada.nextInt();
        cs = 220 - cadeiras;

        System.out.println(" Estão ocupadas "+ fileiras +" Fileiras, e estão ocupadas "+ cadeiras+" Cadeiras");
        System.out.println(" Estao sobrando "+fs+ " Fileiras e "+cs+" cadeiras");

    }

}
