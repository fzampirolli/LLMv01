import java.util.Scanner;

public class VetorV {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

       System.out.println("Entre com um número inteiro, ímpar e maior que zero: ");
        int n = sc.nextInt();

        int [] V = new int [n];

       if(n%2 != 0 && n>0){

        for(int i = 0; i<n; i++){
            V[i]= sc.nextInt();
        }
       }

        for(int i = 0; i<n; i++){
          if(V[i]>V[n-1-i]){        
            V[i] = V[n-1-i];
          }else if(V[n-1-i]<V[i]){
            V[n-1-i] = V[i];
          }
          }              

       for(int j = 0; j<n; j++){
       System.out.printf(" O vetor é :"+V[j]);
       }
    }

}
