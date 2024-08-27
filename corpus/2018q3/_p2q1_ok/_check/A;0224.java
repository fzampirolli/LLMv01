
import java.util.Scanner;

public class prova2ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int n;

        System.out.println("Digite um numero positivo ímpar");
        n = entrada.nextInt();

        int V[] = new int [n];

        for(int ind=0; ind<n; ind++ ){
            System.out.println("Digite o elemento"+ind);
            V[ind]=entrada.nextInt();
        }
        int aux=0, aux1=n-1;

        for(int ind=0; ind<n/2; ind=ind+2 ){
            if(V[ind]>V[aux1]){
                aux=V[ind];
                V[ind]=V[aux1];
                V[aux1]=aux;
            }
            aux1=aux1-2;          
        }

        for(int ind=0; ind<n; ind++ ){
            System.out.println(V[ind]);                      
        }
    } 
}
