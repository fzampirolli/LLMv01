
import java.util.Scanner;

public class QuestaoUm {
    public static int semi(int V[], int n){
        int i;
        i=0;
        if(V[i-i]<V[n])
            V[i-i]=V[n];
        else

        return V[n];

    }

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Digite o valor de N: ");
        n= Entrada.nextInt();
        int V[];
        V = new int [n];
        System.out.println("Digite o vetor ");
        for(i=0; i<n; i++){
            V[i]=Entrada.nextInt();            
        }

    }

}
