
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int Cod[]={300,301,302,303,304,305};
        String Item[]={"Pão de queijo","Bauru","Cachorro Quente","Cheeseburger","Suco","Refrigerante"};
        double Preço[]={1.30,1.40,1.50,1.50,2.20,1.00};
        int n;
        for(n=0;n<6;n++){
            System.out.print(Cod[n]+" ");
            System.out.print(Item[n]+" ");
            System.out.print("R$"+Preço[n]+" ");
            System.out.println();
        }
        int a=1,b,i;
        double total=0;
        while(a>0){
            System.out.print("Digite o código do produto (300 a 305): ");
            a= entrada.nextInt();
            if(a>0){
            System.out.print("Digite a quantidade do produto: ");
            b= entrada.nextInt();
            for(i=0;i<6;i++){
                if(a==Cod[i]){
                    total=total+ b*Preço[i];
                }
            }
            }
        }
        System.out.print("Total da compra: R$"+total+"0");
    }

}
