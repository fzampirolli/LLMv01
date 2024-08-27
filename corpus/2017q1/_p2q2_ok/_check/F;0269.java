
import java.util.Scanner;

public class JavaApplication2Q2p2pi {

    public static void main(String[] args) {

        float x;
        float A[]={100, 1, 1,10};
        float B[]={101,2, 1,30};
        float C[]={102,3, 1,50};
        float D[]={103, 4, 1,30};
        float F[]={104,5, 2,00};
        float G[]={105,6, 1,00};
        float V[]=new float [2];

        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite o código de seu pedido(100 a 105): ");
        V[0]=teclado.nextFloat();

        if (V[0]=100){ 
            System.out.println("o Preço do seu pedido é 1,10");

        }
        if(V[0]=101){
            System.out.println("O preço do seu pedido é 1,30");}
        if(V[0]=102){
            System.out.println(" O preço do seu pedido é 1,50 ");
        }
        if(V[0]=103){
            System.out.println (" O preço do seu pedido é 1,30");}
        if(V[0]=104){ 
            System.out.println("O preço do seu pedido é 2,00");}

        if(V[0]=105){
            System.out.println("o preço do seu pedido é 1,00");}

        if (V[0])
        {
            System.out.println("compra encerrada.");}

        }

    }

}
