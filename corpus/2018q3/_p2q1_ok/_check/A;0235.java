
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int n;

        System.out.print("Informe a dimensão do seu vetor: ");
        n = ent.nextInt();

        int V[] = new int [n];

        for(int i=0; i<n; i++){
            System.out.print("\nInforme o elemento cujo índice é "+i+" : ");
            V[i] = ent.nextInt();
        }

        System.out.println("");

       V = semiparticionado(V);

       System.out.print("\n O semiparticionado do vetor informado tem os seguintes elementos: ");

       for(int i=0; i< n; i++){

           System.out.print(V[i]+" ");
       }

    }

    public static int[]semiparticionado (int v[]){
        int tam = v.length;
        int j = 1;
        for(int i = 0; i< tam/2; i = i+2){
            if(v[i]> v[tam-j]){
                int aux = v[i];
                v[i] = v[tam-j];
                v[tam-j] = aux;
            }
            j = j+2;
        }

        return v;
    }
}
