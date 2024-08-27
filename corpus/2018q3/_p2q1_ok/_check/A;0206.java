
import java.util.Scanner;
public class 1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n, i, j, aux;
        System.out.println("Digite o tamanho do vetor:");
        n=entrada.nextInt();
        int V[]= new int [n];
        System.out.println("Digite os valores do vetor:");
        for(i=0; i<=n-1; i++){
        V[i]=entrada.nextInt();
        }

        i=1;
        j=n-2;
        while(i<j){
        aux=V[i];
        V[i]=V[j];
        V[j]= aux;
        i=i+2;
        j=n-4;
        }

        System.out.println("O semiparticionado ímpar de V é:");
        for(i=0;i<=n-1;i++){
                System.out.println(""+ V[i]+"");
        }
    }

}
