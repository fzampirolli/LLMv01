
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        double total, val[] = {1.3, 1.4, 1.5, 1.4, 2.2, 1.0};
        System.out.println("Codigo \t Item \t\t Preco");
        System.out.println("300 \t Pao de queijo \t 1,20");
        System.out.println("301 \t Bauru \t\t 1,40");
        System.out.println("302 \t Cachorro quente 1,50");
        System.out.println("303 \t Cheeseburger \t 1,40");
        System.out.println("304 \t Suco \t\t 2,20");
        System.out.println("305 \t Refrigerante \t 1,00");
        total = choice(val);
        System.out.print("Total = "+total);
    }
    public static double choice(double val[]){
        int choice[] = {1, 1};
        double total=0;
        Scanner red = new Scanner(System.in);
        while(choice[0] != 0){
            System.out.print("Digite o codigo do produto: ");
            choice[0] = red.nextInt();
            if(choice[0]==0){break;}
            System.out.print("Digite a quantidade do produto: ");
            choice[1] = red.nextInt();
            total += (val[choice[0]-300] * choice[1]);
        }
        return total;
    }

}
