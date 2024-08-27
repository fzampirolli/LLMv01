
import java.util.Scanner;

public class prova2ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int n;

        System.out.println("Digite um numero positivo ímpar");
        n = entrada.nextInt();

        int A[][] = new int [n][n];

        int indc=0, indl=0;

        while (indl<n){
            while(indc<n){
             A[indl][indc]=entrada.nextInt();
             indc++;
            }
        indl++;
        indc=0;
        }

        int npreta=0 , nbranca=0 , r=0;

        indl=0; 

        while (indl<n){

             if(indl/2==1){
             indc=1;
             }else if(indl/2==0){
             indc=0;
             }            
            while(indc<n){
              npreta=npreta+A[indl][indc]; 
              indc=indc+2;
            }
        indl++;
        }

         nbranca=0;
        indl=0;

        while (indl<n){
            while(indc<n){
             nbranca=nbranca+A[indl][indc];
             indc++;
            }
        indl++;
        indc=0;
        }

         System.out.println(npreta+" "+nbranca+" "+r);

    }

}
