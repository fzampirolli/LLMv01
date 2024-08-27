
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int cod[]={300,301,302,303,304,305};
        double preco[]= {1.30 , 1.40 , 1.50 , 1.40 , 2.20 , 1.00};
        String PaodeQueijo = null, Bauru = null, Cachorroquente = null, Cheeseburguer = null, Suco = null, Refrigerante = null;
        String item[] ={PaodeQueijo, Bauru, Cachorroquente, Cheeseburguer, Suco, Refrigerante};
        int n;
        double soma=0, somat=0;

        System.out.println("Código \t Item \t Preço Unitario");

        for (int i = 0; i <cod.length; i++) {
          System.out.println(cod[i]+ "\t" +item[i]+ "\t" +preco[i]);  
        }

        for ( int i = 0;   i<cod.length && i>0; i++) { 
        System.out.println("Digite o codigo do produto (300 a 305):");
        cod[i]= i;
        System.out.println("Digite a quantidade do produto:");
        n=input.nextInt();

            soma=preco[i]*n;
            somat=soma+soma;
        }

        System.out.println("Total da compra="+somat);

    }

}