
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {

        int codigo, qtde=0;
        double pcototal=0;
        int cod[]={300, 301, 302, 303,304,305};
        String item[]={"Pão de Queijo","Bauru","Hot Dog","Cheese burguer","Suco","Refri"};
        double pco[]={1.3,1.4,1.5,1.5,2.2,1.0};
        for(int i=0;i<item.length; i++){
            System.out.println(cod[i]+" "+item[i]+" "+pco[i]);  
        } 

        System.out.println("Digite o Código do produto desejado: ");
        Scanner sc = new Scanner (System.in);
        codigo=sc.nextInt();
        while(codigo!=0){
            for(int i=0;i<6;i++){
               if(codigo==cod[i]){
                   System.out.println("Digite a qtde desejada: ");
                   qtde=sc.nextInt();

               }
              pcototal=(qtde*pco[i])+pcototal; 
              qtde=0;
            }
            System.out.println("Digite o Código do produto desejado: ");

        codigo=sc.nextInt();

        }

        System.out.println("Total da compra: "+pcototal);
    }

}
