
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j;
        double  preco;
        double A[]= {1.10,1.30,1.50,1.30,2.00,1.00};

        System.out.println("Cód.   Item             Preço unitário");
        System.out.println("100    Pão de queijo        1,10");
        System.out.println("101    Bauru                1,30");
        System.out.println("102    Cachorro quente      1,50");
        System.out.println("103    Cheeseburguer        1,30");
        System.out.println("104    Suco                 2,00");
        System.out.println("105    Refrigerante         1,00\n");

        do{
            System.out.println("Digite o cód. do prod.(100 a 105): ");
            i = ler.nextInt();            
            i= i-100;

            System.out.println("Digite a quant. do prod.: ");
            j = ler.nextInt();        

            preco =j*A[i];

        }while((i!=0)|(j!=0));

        System.out.println("Total da compra: "+preco);

    }

}
