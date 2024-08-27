
import java.util.*;
public class Cardapio {
    public static void main(String[] args) {

        float c[]= new float[6];
        String a[]= new String[6];
        int p, q, i=0, j=0, h=0;
        float d=0 , e=0;

        c[0]= 1,10 ;
        c[1]= 1,30 ;
        c[2]= 1,50 ;
        c[3]= 1,30 ;
        c[4]= 2,00 ;
        c[5]= 1,00 ;

        a[0]= "Pao de Queijo";
        a[1]="Bauru";
        a[2]="Cachorro quente";
        a[3]="Cheeseburger";
        a[4]="Suco";
        a[5]="Refrigerante";

        for(j=0; j<6; j++){
            h=100+j;
            System.out.println(h+" "+a[j]+" "+c[j]);
        }

        System.out.println("digite o codigo do produto: ");
        Scanner scan= new Scanner (System.in);
        p=scan.nextInt();
        System.out.println("digite a quantidade: ");
        Scanner quan= new Scanner (System.in);
        q=quan.nextInt();

        while(p!=0){
            d=c[p-100]*q;
            e= e+ d;
            i++;

            System.out.println("digite o codigo do produto: ");
            p=scan.nextInt();
            System.out.println("digite a quantidade: ");
            q=quan.nextInt();

        }

        for(j=0; j<6; j++){
            h=100+j;
            System.out.println(h+" "+a[j]+" "+c[j]);
        }

        System.out.println("Total da compra :"+e);
    }

}
