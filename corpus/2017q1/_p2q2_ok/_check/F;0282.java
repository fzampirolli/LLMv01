
import java.util.Scanner;
public class P2Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Valid = 0;

        while (Valid == 0){
            System.out.print("Digite o Código do Produto: ") ;
            int prod = sc.nextInt();
                if(prod == 0){
                    Valid = 1;
                }
                else{
                    System.out.print("Digite a quantidade do produto: ");
                    int quant = sc.nextInt();
                    System.out.println();
                }
           }
        }
    }
