
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {

    Scanner ent=new Scanner(System.in);
    int c[]={100,101,102,103,104,105};
    int i[]={"Pão de queijo","Bauru","Cachorro quente","Suco","Refrigerante"};
    double P[]={1.10,1.30,1.50,1.30,2.00,1.00};        

    System.out.print("Cardápio");
    System.out.print("Código    Item        Preço unitário");
    for(int i=0;i<6;i++){
        System.out.println(c[i]+"; "+i[]+",   "+P[i]);
    }

    }

}
