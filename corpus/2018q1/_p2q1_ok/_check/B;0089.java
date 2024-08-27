
import java.util.Scanner;
public class P2Q1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int V[] = new int [135];
        int i, k = 20;
        System.out.println ("Digite os valores do vetor");
        for ( i = 0; i < 135; i++){
        V[i]= entrada.nextInt();
        }

        comparaVetor (V, i, k);

        boolean returncompara = comparaVetor(V,i,k);
        if (returncompara = true){
            System.out.println ("Existe número maior que 20 nesse vetor.");
        }else{
            System.out.println("Não existe número maior que 20 nesse vetor.");
        }
    }
    public static boolean comparaVetor(int v[], int n, int k){
        boolean x = true;
            for (int i = 0; i < n; i++){
            if (v[i] < k){
                x = false;
            }
        } 
      return x;
    }
}
