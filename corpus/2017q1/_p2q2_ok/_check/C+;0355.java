
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        int Código[]={300,301,302,303,304,305};
        String Item[] = {"pãodequeijo","Bauru","cachorro quente", "Cheesburguer", "Suco", "Refrigerante"};
        double PreçoUnitário[] = {1.30, 1.40, 1.50, 1.50, 2.20, 1.00};
        Scanner entrada=new Scanner (System.in);

        System.out.println("Código");
        ImprimeVetor1(Código);
        System.out.println("Item");
        ImprimeVetor2(Item);
        System.out.println("Preço");
        ImprimeVetor3(PreçoUnitário);
        int quantidade, preço, codigo;
        System.out.println("Digite o codigo do pedido ");
        codigo=entrada.nextInt();
        System.out.println("digite a quantidade ");
        quantidade=entrada.nextInt();

        if(codigo!=0){ 
            double soma=0;
            while(codigo>299 && codigo<306){
       if(codigo==300){
            soma=(soma+1.30)*quantidade;
        } 
       if(codigo==302){
            soma=(soma+1.50)*quantidade;
        }
        if(codigo==301){
            soma=(soma+1.40)*quantidade;
        }
        if(codigo==303){
            soma=(soma+1.50)*quantidade;
        }
        if(codigo==304){
            soma=(soma+2.20)*quantidade;
        }
        if(codigo==305){
            soma=(soma+1.00)*quantidade;
        }

        }
            System.out.println(soma);
        }   

    }

    public static void ImprimeVetor1(int Vet1[]){
        int i;
        Scanner entrada= new Scanner (System.in);     
        for(i=0;i<6;i++){
            System.out.println( Vet1[i]);
        }
    }
     public static void ImprimeVetor2( String Vet2[]){
        int i;
        Scanner entrada= new Scanner (System.in);     
        for(i=0;i<6;i++){
            System.out.println( Vet2[i]);
        }
    }
     public static void ImprimeVetor3( double Vet3[]){
        int i;
        Scanner entrada= new Scanner (System.in);     
        for(i=0;i<6;i++){
            System.out.println( Vet3[i]);
        }
    }

}
