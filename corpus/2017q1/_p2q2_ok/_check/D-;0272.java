
import java.util.Scanner;

public class BrunaRibeiroOliveira_EXERCICIO 2 BRUNA {

    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    double A[] = {1.10,1.30,1.50,1.30,2,1};
    int x=1, z;
    double total;
        System.out.println("Código       Item         Preço Unitério");
        System.out.println(" 100     Pão de Queijo        1.10");
        System.out.println(" 101        Bauru             1.30");
        System.out.println(" 102    Cachorro Quente       1.50");
        System.out.println(" 103     Cheeseburguer        1.30");
        System.out.println(" 104        Suco              2.00");
        System.out.println(" 105     Refrigerante         1.00");

        while (x!=0){

            for (int i=0; i<=5; i++){
            System.out.println("Digite o código do produto (100 a 105):");
            A[i] = input.nextDouble();

                System.out.println("Digite a quantidade do produto:");    
                z = input.nextInt();
                total = A[i]*z;
                System.out.println("Total da Compra: "+total+".");

            }
        }        

    }

}
