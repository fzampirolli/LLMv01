
import java.util.Scanner;

public class JhonnyNobredaSilva_JavaApplication3 (questao2 vetor pao de queijo) {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int validacao, contadorA=0, codigo, quantidade, qtprod, n=0;
    int A[] = {100, 101, 102, 103, 104, 105};
    String B[] = {"Pao de queijo", "Bauru", "Cachorro quente", "Cheeseburger", "Suco", "Refrigerante"};
    double C[] = {1.10, 1.30, 1.50, 1.30, 2.00, 1.00};
    double soma = 0.0;    

        for (int i = 0; i < 6; i++) {

            System.out.println("Código: " + A[i] + " Produto: " + B[i] + " Preço: " + C[i]);

        }

        System.out.println("Digite qualquer número para fazer o pedido ou 0 pra sair");
        validacao = entrada.nextInt();

        if (validacao != 0){

            System.out.println("Quantos produtos deseja comprar? ");
            qtprod = entrada.nextInt();

            for (n = 0; n < qtprod; n++) {

            System.out.println("Digite o código do produto que deseja e a quantidade em seguida ");
            codigo = entrada.nextInt();
            quantidade = entrada.nextInt();

            for (int i = 0; i < 6; i++) {

            if (A[i] == codigo){

              System.out.println("Você pediu " + quantidade + B[i] + "preço " + C[i] * quantidade + "Reais");  
              soma = soma + C[i];  
            }    

            }

        }

        } else {

            System.out.println("Obrigado!");

        }

        System.out.println("O valor total da compra é de " + soma);

    }

}
