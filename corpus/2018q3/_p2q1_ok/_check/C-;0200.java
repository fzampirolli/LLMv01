
import java.util.Scanner;

public class Exercicio1p2 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int i,aux;

        System.out.println("Digite um numero inteiro que seja ímpar e postivo: ");
        int n = x.nextInt();

        int V[]= new int [n];

        for( i = 0; i<n; i++){
            System.out.println("Digite os numeros do vetor");
            V[i]=x.nextInt();   
        }

        for(i = 0; i<n;i++){
            if(V[i]<V[n-1]){
                aux = V[i];
                V[i]=V[n-1];
                V[n-1]=aux;
            }            

            System.out.println(V[i]);
        }

    }

}
