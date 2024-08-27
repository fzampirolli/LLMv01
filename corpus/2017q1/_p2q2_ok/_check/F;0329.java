
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

    String A[]= new String[3];
    String B[]= new String[3];
    String C[]= new String[3];
    String D[]= new String[3];
    String E[]= new String[3];
    String F[]= new String[3];

    Leia(A);
    Leia(B);
    Leia(C);
    Leia(D);
    Leia(E);
    Leia(F);

    Imprime(A);
    Imprime(B);
    Imprime(C);
    Imprime(D);
    Imprime(E);
    Imprime(F);

    }

    public static void Leia(String V[]){
    Scanner scan= new Scanner(System.in);    
    for(int i=0; i<3;i++){
    System.out.println("Inira o código, item e preço");    
    V[i]= scan.next();}}

    public static void Imprime(String V[]){

           System.out.println("Código: "+V[0]+" Item: "+V[1]+" Preço: "+V[2]);}      

}

} 
