
import java.util.Scanner;
public class Cardapio {

    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int codigo[] = {100, 101, 102, 103, 104, 105};
       double preco[] = {1.10, 1.30, 1.50, 1.30, 2.00, 1.00};
       int c,q;
       double total=0;
       int Item[];
       Item=Item[6];

       for (int i=0;i<6;i++){
       System.out.println(codigo[i]);
       System.out.print("\t "+preco[i]);

       do {
       System.out.println("Digite o código do produto (100 a 105): ");
       c = entrada.nextInt();
       System.out.println("Digite a quantidade do produto: ");
       q = entrada.nextInt();
       if (c==100){
           total=(q*1.10);
       }
       if (c==101){
           total=(q*1.30);
       }
          if (c==102){
           total=(q*1.50);
       }
          if (c==103){
           total=(q*1.30);
       }
          if (c==104){
           total=(q*2.00);
       }
          if (c==105){
           total=(q*1.00);
       }
          total=+total;
       }
        while (c!=0);

       }
       System.out.println("Total da compra: "+total);
       }
}
