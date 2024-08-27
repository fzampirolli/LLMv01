
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       int Cod[] = new int[6];
       double Pr[] = new double[6];
       String it[] = new String[6];

       int num=1;
       int i;
       int cont=0;
       double qtd, cont1 = 0;

       Cod[0] = 300;
       Cod[1] = 301;
       Cod[2] = 302;
       Cod[3] = 303;
       Cod[4] = 304;
       Cod[5] = 305;

       it[0] = "Pao de Queijo";
       it[1] = "Bauru";
       it[2] = "Cachorro quente";
       it[3] = "Cheeseburger";
       it[4] = "Suco";
       it[5] = "Refrigerante";

       Pr[0] = 1.30;
       Pr[1] = 1.40;
       Pr[2] = 1.50;
       Pr[3] = 1.40;
       Pr[4] = 2.20;
       Pr[5] = 1.00;

       while(num!=0){
        System.out.println(" Codigo  |      Item      | Preco unitario");
        for(i=0;i<5;i++){
        System.out.print("   "+Cod[i]+"   |"+it[i]);
        if(i==0){
            System.out.print("   |");
        }
        else{
            if(i==1){
                System.out.print("           |");
            }
            else{
                if(i==2){
                   System.out.print(" |"); 
                }
                else{
                    if(i==3){
                      System.out.print("    |");   
                    }
                    else{
                        if(i==4){
                            System.out.print("            |");  
                        }
                        else{
                            if(i==5){
                              System.out.print("    |");    
                            }
                        }
                    }
                }          
            }
        }
        System.out.println(" "+Pr[i]+" ");

        }
        System.out.println("Digite o codigo do produto desejado");
        num = entrada.nextInt();
        if(num!=0){
        System.out.println("Digite a quantidade");
        qtd = entrada.nextInt();

        for(i=0;i<5;i++){
          if(num==Cod[i]){
              cont = i;
          }        
        }

        cont1=(Pr[cont]*qtd)+cont1;  
    }
       }

       System.out.println("Total da Compra = R$"+cont1);

    }

}
