
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo[] = new int [6];
        double preco[] = new double [6];       
        String produto[] = new String [6];
        int n;
        double k,p;

        for(int i=0;i<3;i++){
            System.out.println("\n informe o nome do prduto");
            produto[i] = input.next();

            System.out.println("\n informe o codigo do prduto");
            codigo[i] = input.nextInt();

            System.out.println("\n informe o preço do prduto");
            preco[i] = input.nextDouble();
        }

        System.out.println("codigo  item      preço     ");
        for(int i=0;i<6;i++){ 
            System.out.println(codigo[i]+"     " +produto[i]+"       " + preco[i]);

        }

        int u=1;
        while(u!=0){
            System.out.println("Informe o codigo do pedido[300 3005] ");
            n=input.nextInt();
            System.out.println(produto[n]+"   "+preco[n-1] );
            System.out.println("Informe a quantidade ");
            k=input.nextInt(); 
            p = preco[n]*k;
            System.out.println("digite 0 para parar ou 1 para continuar");
            u=input.nextInt();
        }

    }

}
