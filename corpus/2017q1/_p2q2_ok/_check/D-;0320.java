
import java.util.Scanner;
public class q2 {

    public static void main(String[] args) {
       int codigo [] = {300, 301, 302, 303, 304, 305, 306};
       String item[] = {pao de queijo, bauru, cachorro quente, cheeseburger, suco, refrigerante};
       double preco [] = {1.30 , 1.40 , 1.50 , 1.50 , 2.20 , 1.00};

       for( int i = 0; i < 6; i++){
           System.out.print(" "+ codigo[i]);
           System.out.println();
           System.out.print(" "+item[i]);
           System.out.println();
           System.out.print(" "+ preco[i]);
           }

    System.out.print("Digite o codigo do produto(300 a 305): ");

    }

}
