
import java.util.Scanner;
public class Questao2P2PI {

    public static void main(String[] args) {
        Scanner Teclado=new Scanner (System.in);

        System.out.println("CÓDIGO      ITEM            PREÇO UNITÁRIO  ");
        System.out.println("100       Pão de Queijo        1.10");
        System.out.println("101       Bauru                1.30");
        System.out.println("102       Cachorro Quente      1.50");
        System.out.println("103       Cheeseburguer        1.30");
        System.out.println("104       Suco                 2.00");
        System.out.println("105       Refrigerante         1.00");
        System.out.println(" ");

        System.out.println("Digite o código do produto: ");
        double produto =Teclado.nextInt();    
        System.out.println("Digite a Quantidade do produto: ");
        int quantidade =Teclado.nextInt();

        if (produto==100) {
            double preco=1.10;
            double valortotal=preco*quantidade;      
        System.out.println("Total da compra: " +valortotal);
        }
        else {
            if (produto==101) {
                double preco=1.30;
                double valortotal=preco*quantidade;      
        System.out.println("Total da compra: " +valortotal);
            }
            else { 
                if (produto==102) { 
                    double preco=1.50;
                    double valortotal=preco*quantidade;      
        System.out.println("Total da compra: " +valortotal);
                }
                else {
                    if (produto==103) { 
                        double preco = 1.30; 
                        double valortotal=preco*quantidade;      
        System.out.println("Total da compra: " +valortotal);
                    }
                    else { 
                        if (produto==104) { 
                            double preco=2.00;
                            double valortotal=preco*quantidade;      
        System.out.println("Total da compra: " +valortotal);
                        }
                        else {
                            if (produto==105) {
                                double preco=1.00;
                                double valortotal=preco*quantidade;      
        System.out.println("Total da compra: " +valortotal);
                            }
                        }
                    }                    
                }
            }
        }

    }

}
