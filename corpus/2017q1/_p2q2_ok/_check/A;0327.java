
import java.util.Scanner;
public class P202 {
static int N=6;
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   	int cod[] = {100,101,102,103,104,105};
	String item[] = {"pão de queijo  ", "bauru          ", "cachorro quente", "cheeseburger   ", "suco           ", "refrigerante   "};
	double preco[] = {1.10,1.30,1.50,1.30,2.00,1.00};
	int i,x=1,y,z;
	double total=0;
	System.out.println ("Cardápio:");
	System.out.println("\nCódigo      Item      Preço unitário");
	for (i=0;i<6;i++){
		System.out.println ("\n"+ cod[i]+"      "+item[i]+"      "+preco[i]);
	}

	while(x>0){
	System.out.println ("\nQual o código do item que deseja?");
	x=entrada.nextInt();
	if (x==0){
           System.out.println("Total da compra: "+ total);
	}

	System.out.println ("Qual a quantidade que deseja deste produto?");
	y = entrada.nextInt();	
	z=x-100;
	total = total + y*preco[z];

	}

	System.out.println("Total da compra: "+ total);

	}
}
