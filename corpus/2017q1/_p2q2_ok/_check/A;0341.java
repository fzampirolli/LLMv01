
import java.util.Scanner;
public class Lanchonete {

    public static void main(String[] args) 
    {
        int ped=1,quant = 0;
        double valor = 0;
        int cod[] = {100,101,102,103,104,105};
        String item[]= {"pao de queijo","Bauru","Cachorro Quente", "cheeseburger", "suco"," Refrigerante"};
        double preco[] ={ 1.10,30,1.50,1.30,2.00,1.00};
        Scanner teclado = new Scanner (System.in);
        for(int i=0;i<6;i++)
        {
            System.out.print("  " + cod[i]+"    " + item[i] + "              "+ preco[i]);
            System.out.println();
        }
        while(ped !=0){
            System.out.println("Digite o codigo do produto");
            ped = teclado.nextInt();
            if(ped != 0)
            {
                System.out.println("Digite a quantidade");
                quant = teclado.nextInt();
                ped = ped-100;
                valor = valor + (quant * preco[ped]);
                ped=1;
            }

        }
        System.out.println("Total da compra:" + valor);
    }
}
