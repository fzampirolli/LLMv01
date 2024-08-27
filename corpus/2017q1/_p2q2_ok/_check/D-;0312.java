
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); 
        int c, q;
        double t=0;
       System.out.println("Digite o código do produto(300 a 305): ");
        c= entrada.nextInt();
        if(c==0){
         System.out.println("Total da compra: " +t);}
        else{
        System.out.println("Digite a quantidade do produto: ");
        q= entrada.nextInt();
        if(c==300){
        t= q*(1.30);}
        if(c==301){
        t= q*(1.40);}
        if(c==302){
        t= q*(1.50);}
        if(c==303){
        t= q*(1.50);}
        if(c==304){
        t= q*(2.20);}
        if(c==305){
        t= q*(1.00);}
        System.out.println("Total da compra: " +t);

    }
}
}