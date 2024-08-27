
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {

        int A[]= {300 , 301, 302 , 303, 304, 305};

        double C[]= {1.30 ,1.40 , 1.50 , 1.40 , 2.20 , 1.00};        

        for( int i=0; i<6 ; i++){
            System.out.println("Código"+ A[i]+ "Preço" +C[i]);
        }

        Scanner scan= new Scanner(System.in);
        int n=1, q;
        double soma=0;

        while(n>0){
            System.out.println("Qual o código?");
        n= scan.nextInt();
        System.out.println("Qual a quantidade? ");
        q= scan.nextInt();
           n=n-300;
            System.out.println("Código" +A[n]+ "Preço" +C[n]);
            soma= soma + q* C[n];
        }
        System.out.println("Valor total: " +soma);

    }

}
