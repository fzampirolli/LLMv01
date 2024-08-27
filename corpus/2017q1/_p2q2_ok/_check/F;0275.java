
import java.util.Scanner;
public class CristianeAkemiMarquesEnobe_q2_cardapio(2) {
    public static void main (String[]args){
        double compra=0.00
        int codigo[] ={300,301,302,303,304,305};
        string opcao []={Pao_de_queijo, Bauru, Cachorro_quente, Cheeseburguer, suco, refrigerante};
        double preco [] = {1.30 ,1.40, 1.50, 2.20, 1.00};

        ImprimirCardapio (codigo, opcao, preco);

    }
   public static void ImprimirCardapio (int codigo[], string opcao [], double preco){
       for (int i=0; i<6; i++){
            System.out.print (codigo[i] + " ");
            System.out.print (opcao[i] + " ");
            System.out.print (preco[i] + " ");
        }
   } 
}
