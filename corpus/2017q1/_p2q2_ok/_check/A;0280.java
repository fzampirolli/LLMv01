
import java.util.*;

public class ex2 {

 public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String C[] = {"Pão de Queijo","Bauru","Cachorro Quente","Cheeseburger","Suco","Refrigerante"};
        double P[] = {1.10,1.30,1.50,1.30,2.00,1.00};
        double tot = 0;
        int cod= -1,qtd;
        System.out.println("Código \t Item \t Preço unitário");
        for(int i =0; i<C.length;i++){
         System.out.println((i+100)+" \t"+C[i]+" \t\t"+P[i]);
        }
        while(cod !=0){
          System.out.print("Digite o Código do produto (100 a 105): ");
          cod = e.nextInt();
          if(cod !=0){
          System.out.print("Digite a Quantidade: ");
          qtd = e.nextInt();
          tot += P[cod-100]*qtd;
          }
        }
        System.out.println("Total da compra: "+tot);
 }
}
