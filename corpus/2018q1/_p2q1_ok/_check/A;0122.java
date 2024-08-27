
import java.util.Scanner;
public class 1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com o tamanho do vetor : ");
        int n = leia.nextInt();
        int v[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Entre com o " + (i+1) + "° elemento do vetor :");
            v[i] = leia.nextInt();
        }

        if(comparaVetor(v,n,40)){
            System.out.println(" \nExiste numero igual a 40 nesse vetor.");

        }else{
            System.out.println(" \nNão existe numero igual a 40 nesse vetor.");
        }

    }

    public static boolean comparaVetor(int v[],int n, int k){

        int cont = 0;
        for(int i = 0; i < n;i++){
            if(v[i] == k){
                cont++;
            }
        }

        return (cont != 0);
    }

}
