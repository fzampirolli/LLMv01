
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

       int n,k,i;
       Scanner sc= new Scanner(System.in);

       System.out.println("Insira o tamanho do vetor: \n");
       n=sc.nextInt();
        int v[]= new int[n];
       for(i=0;i<n;i++){
           System.out.println("Insira o "+(i+1)+"º Valor do vetor. \n");
           v[i]=sc.nextInt();   
       }

        comparaVetor(v,n,k);
    }
    public static boolean comparaVetor(int v[],int n, int k){
      int i;

                for(i=0;i<n;i++){
                   if (v[i]>20)){

                }  
              }

    }
}
