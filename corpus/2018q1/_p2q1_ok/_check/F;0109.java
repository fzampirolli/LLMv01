
import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {

    boolean comparaVetor;
    int aux=20, n=0;
    int v[]=new int [3];      
        Scanner entrada = new Scanner (System.in);

        for (n=0; v[n]<=3; n++) {
        System.out.println("Digite o número n: ");

            v[n]=entrada.nextInt();

        }
   if (v[n] > aux) {
                comparaVetor = true;
                System.out.println("Existe numero mais a 20 nesse vetor");

            } else {
                comparaVetor = false;
                System.out.println("Nao existe numero maior a 20 nesse vetor");
            }

}
}
