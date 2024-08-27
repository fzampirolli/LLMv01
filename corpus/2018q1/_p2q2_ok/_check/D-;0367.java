
import java.util.*;
import java.lang.*;

public class EmpresaAerea {

    public static void main(String[] args) {
       int n,i; 
       Scanner scan = new Scanner(System.in);

       System.out.println("Digite a quantidade de pessoas");
       n = scan.nextInt();

       String vetorNome[] = new String [n];
       String vetorDestino[]= new String[n];

       int m = n+n;
       String resp[] = new string[m];

       resp[] = pVet(vetorNome, vetorDestino, n);

       for(i=0;i<n;i++){
       System.out.println(vetorNome[i]);           
       }

    }
    public static String pVet(String vetorNome[], String vetorDestino[], int n){
        int i;
        Scanner scan = new Scanner(System.in);

        for(i=0;i<n;i++){
            System.out.println("Digite o nome do passageiro");
            vetorNome[i] = scan.next();
            System.out.println("Digite o destino do passageiro");
            vetorDestino[i]= scan.next();
        }

        return vetorNome;

    }

}
