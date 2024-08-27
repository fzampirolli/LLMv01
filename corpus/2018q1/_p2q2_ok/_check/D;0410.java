
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String vetorNome [] = new String [45];
        String vetorDestino [] = new String [45];

        formarVetorNome( vetorNome, 45);
        formarVetorDestino(vetorDestino, 45);

    }
    public static String pesquisarNome(String A [], String B[], String k ){

        Scanner entrada = new Scanner(System.in);

        String n,d;
        int N =0;
        int D=0;

        System.out.println("Digite o nome do passageiro:");
        n = entrada.next();

        while(N<45){
            if(A[N] == n){
                return n ;
            }else {
                return "";
            }
        }

    }

    public static String formarVetorNome(String A [], int n){
            Scanner entrada = new Scanner(System.in);

            int i = 0;

            while(i<n){
            System.out.println("Digite o nome do passageiro: ");
            A[i] = entrada.next();
            }
          return A[n];  
    }

    public static String formarVetorDestino(String B[], int m){
            Scanner entrada = new Scanner(System.in);

            int i = 0;

            while(i<m){
            System.out.println("Digite o destino do passageiro: ");
            B[i] = entrada.next();
            }
          return B[m]; 
    }
}
