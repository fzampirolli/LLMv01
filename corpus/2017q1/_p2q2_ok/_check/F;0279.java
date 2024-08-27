
import java.util.Scanner;

public class JavaApplication3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int v1[] = new int [3];
        int v2[] = new int [3];
        int v3[] = new int [3];
        int v4[] = new int [3];
        int v5[] = new int [3];
        int v6[] = new int [3];
        float total = 0;

        Scanner sc = new Scanner (System.in);
        int i, v;

        while (v != 0){
       for(i=0;i<3;i++){
           v1[i]= sc.nextInt();
           v2[i]= sc.nextInt();
           v3[i]= sc.nextInt();
           v4[i]= sc.nextInt();
           v5[i]= sc.nextInt();
           v6[i]= sc.nextInt();

       System.out.println("Digite o codigo do item");
       v = sc.nextInt();
        System.out.println("Digite a quantidade: ");
            int q = sc.nextInt();

        if(v == 300){
            v=v1[0];
            total= (float) (1.3*q);
        }
        else if (v == 301){
            v=v2[0];
            total= (float) (1.4*q);
        }
        else if (v == 302){
            v=v3[0];
            total= (float) (1.5*q);
        }
        else if (v == 303){
            v=v4[0];
            total= (float) (1.4*q);
        }
         else if (v == 304){
            v=v5[0];
            total= (float) (2.2*q);
        }
         else if (v == 305){
            v=v6[0];
            total= (float) (1.0*q);
         }
       }
        for(i=0;i<3;i++){
            System.out.println("O valor total foi de:R$ " + total);
        }
        }
    }
}
