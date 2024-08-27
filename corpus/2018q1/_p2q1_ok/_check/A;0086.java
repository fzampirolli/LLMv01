
import java.util.Scanner;

public class pi {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tam,valor=40;
        System.out.println("digite o tamanho do vetor:");
        tam = entrada.nextInt();
        int vetor[] = new int[tam];
        for (int i=0;i<tam;i++){
            System.out.println("digite um valor:");
            vetor[i]=entrada.nextInt();
        }
        comparaVetor(vetor,tam,valor);
        if (comparaVetor(vetor,tam,valor)==true){
            System.out.println("Existe valor igual a 40 nesse vetor");
        }
        else{
            System.out.println("Nao existe numero igual a 40 nesse vetor");
        }

    }
    public static boolean comparaVetor(int v[],int n,int k){
       Scanner entrada = new Scanner(System.in);
       boolean comp = false;
       for (int j=0;j<n;j++){
           comp = v[j]==k;
       }
       return comp;

    }

}
