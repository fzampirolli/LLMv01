
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int c= 0, pedido=0, quantidade=0,  sair = 0 ;
         int codigo[] = {100, 101, 102, 103, 104, 105};
         double preco[] = {1.1, 1.30, 1.50, 1.30, 2, 1};
         double compra =0, soma =0;
         String item[] = {"Pão de Queijo", "Bauru", "Cachorro Quente", "Cheeseburger", "Suco", "Refrigerante"};

         for(c=0; c<6;c++){
             System.out.println(codigo[c] + ": " + item[c] + "Preço: " + preco[c]);
         }

        do {
            System.out.println("Digite o número de seu pedido: ");
            pedido = entrada.nextInt();
            while (pedido <100) {
                System.out.println("Número do código invalido, por favor digite novamente: ");
                pedido = entrada.nextInt();
            }

            while (pedido>105){
                System.out.println("Número do código invalido, por favor digite novamente: ");
                pedido = entrada.nextInt();
            }
            System.out.println("Digite a quantidade desejada: ");
            quantidade = entrada.nextInt();
            System.out.println("Deseja realizar outra compra? (digite 0 para sair)");
            sair = entrada.nextInt();
            for (c=0;c<6;c++){
                if(codigo[c] == pedido){
                    compra = preco[c];
                }
            }
            soma = soma + quantidade*compra;
         }while (sair != 0);
         System.out.println("Total da compra: " + soma);

    }

}
