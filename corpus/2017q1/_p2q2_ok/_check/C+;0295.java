
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {

        System.out.println("CARDÁPIO");
        System.out.println("Código  Item             Preço Unitário");
        System.out.println(" 100    Pão de Queijo ----  R$ 1,10");
        System.out.println(" 101    Bauru ------------  R$ 1,30");
        System.out.println(" 102    Cachorro quente --  R$ 1,50");
        System.out.println(" 103    Cheeseburger -----  R$ 1,30");
        System.out.println(" 104    Suco -------------  R$ 2,00");
        System.out.println(" 105    Refrigerante------  R$ 1,00");

        int Cod[] = {100, 101, 102, 103, 104, 105};
        double Valor[] = {1.1 , 1.3, 1.5, 1.3, 2.0 , 1.0};

        Scanner entrada = new Scanner(System.in);
        int c = 1;
        double q;

        while(c !=0){
        System.out.println("Digite o código do produto (100 a 105): ");
        c = entrada.nextInt();

       for(int i=0; i<6; i++){
           if(Cod[i]==c){

           }
       }

        System.out.println("Digite a quantidade do produto: ");
        q = entrada.nextDouble();

        double pagar = 0;

  } 
 }
}
