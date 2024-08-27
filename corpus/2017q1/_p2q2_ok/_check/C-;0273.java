
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i=0,j=0, k=0, codigopedido=1, c=0, qtde=0;
    double conta=0;
    int codes[];
        codes = new int [i];
    String nomes[];
        nomes = new String [j];
    int puni[];
        puni = new int [k];
    for (i=0;i<6;i++){ 
        System.out.println("Digite os códigos dos produtos: ");
        sc.nextInt(codes[i]);
    }
    for (j=0;j<6;j++){ 
        System.out.println("Digite os nomes dos produtos: ");
        sc.next(nomes[j]);
    }
    for (k=0;k<6;k++){ 
        System.out.println("Digite os preço unitário dos produtos: ");

        sc.nextInt(puni[k]);
    }

    System.out.println("Código   Item   Preço Unitário");
    i = 0;
    j = 0;
    k = 0;
    while (i<6){
        System.out.println(codes[i]+"  "+nomes[j]+"  "+puni[k]); 
        i++;
        j++;
        k++;
    }
    while (codigopedido != 0){
    System.out.println("Digite o código do seu pedido (100 a 105): ");
    sc.nextInt(codigopedido);
     for (i=0;i<6;i++){
         if (codigopedido == codes[i]){
             i=c;
         }
     System.out.println("Digite a Quantidade de Produtos");
     sc.nextInt(qtde);
     conta = conta+qtde*puni[c];
     }
    }
    System.out.println("Total da compra: "+conta);
    }

}
