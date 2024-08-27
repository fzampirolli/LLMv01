
import java.util.Scanner;

public class Questao2P2 {

    public static void main(String[] args) {
       Scanner leitor=new Scanner (System.in);
       int cod,quant;
       double soma=0;
        System.out.println("Código     Item            Preço Unitário ");
        System.out.println("100        Pão de Queijo             1.10 ");
        System.out.println("101        Bauru                     1.30 ");
        System.out.println("102        Cachorro Quente           1.50 ");
        System.out.println("103        Cheeseburger              1.30 ");
        System.out.println("104        Suco                      2.00 ");
        System.out.println("105        Refrigerante              1.00 ");

       System.out.println();
        System.out.println("Digite o código do produto(100 a 105): ");
        cod=leitor.nextInt();
        if (cod == 0){
            System.out.println("Total da compra: "+soma);

        }
        else {
            if (cod == 100){
            System.out.println("digite a quantidade: ");
            quant=leitor.nextInt();            
            soma=soma+(1.10*quant); 
            System.out.println("Digite o código do produto(100 a 105): ");
            cod=leitor.nextInt();
        if (cod == 101){
            System.out.println("digite a quantidade: ");
            quant=leitor.nextInt();          
            soma=soma+(1.30*quant);
            System.out.println("Digite o código do produto(100 a 105): ");
            cod=leitor.nextInt();
        if (cod == 102){
            System.out.println("digite a quantidade: ");
            quant=leitor.nextInt();
            soma=soma+(1.50*quant);
            System.out.println("Digite o código do produto(100 a 105): ");
            cod=leitor.nextInt();
        if (cod == 103){
            System.out.println("digite a quantidade: ");
            quant=leitor.nextInt();
           System.out.println("Digite o código do produto(100 a 105): ");
           cod=leitor.nextInt();

            soma=soma+(1.30*quant);
        if (cod == 100){
            System.out.println("digite a quantidade: ");
            quant=leitor.nextInt();
            System.out.println("Digite o código do produto(100 a 105): ");
            cod=leitor.nextInt();

            soma=soma+(2.00*quant);
        if (cod == 100){
            System.out.println("digite a quantidade: ");
            quant=leitor.nextInt();
            System.out.println("Digite o código do produto(100 a 105): ");
            cod=leitor.nextInt();
            soma=soma+(1.00*quant);
        }

    }

}
}
        }
            }
        }
    }
}
