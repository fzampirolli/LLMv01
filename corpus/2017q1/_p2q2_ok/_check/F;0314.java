
import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        int i=6 , j= 6 , l=6 , m=0, VetorCodigo[]=new int[i], VetorItem[]=new int[j] , VetorPrecoUnitario[]= new int[l];
        Scanner entrada = new Scanner(System.in);

        for(m=0;m<i;m++){
            System.out.println("Digite o codigo numero " + m + " do cardapio");
            VetorCodigo[m]= entrada.nextInt();
            System.out.println("Digite o numero do item  " + m + " do cardapio");
            VetorItem[m]= entrada.nextInt();
            System.out.println("Digite o preco " + m + " do cardapio");
            VetorPrecoUnitario[m]= entrada.nextInt();
        }

    }

}
