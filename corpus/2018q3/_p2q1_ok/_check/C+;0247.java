
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n,a=0;
        System.out.println("Digite o tamanho do Vetor: ");
        n=ler.nextInt();
        int V[]=new int [n];
        System.out.println("Digite os elementos do vetor V: ");
        for(int i=0;i<n;i++){
            V[i]=ler.nextInt();
        }
        for(int j=0;j<n;j++){
                if(V[j]<V[n-1-a]){
                    V[j]=V[n-1-a];
                    V[n-1-a]=V[j];
                }
                else{
                    if(V[j]==V[n-1-a]){
                        V[j]=V[j];
                        V[n-1-a]=V[n-1-a];

                    }
                    else{
                        if(V[j]>V[n-1-a]){
                            V[j]=V[j];
                            V[n-1-a]=V[n-1-a];
                        }
                    }
                }
            a++;   
        }
        System.out.println("Vetor semiparticionado de V: ");
        for(int i=0;i<n;i++){
            System.out.println(V[i]);
        }

    }

}
