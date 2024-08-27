
import java.util.*;

public class ex2 {
    public static void main(String [] args){
            Scanner input = new Scanner (System.in);
            int somapreta=0;
            int somabranca=0;
            System.out.println("Digite n: ");
            int n = input.nextInt();
            int A[][]=new int[n][n];
           for (int i=0;i<n;i++){
               for (int j=0;j<A[i].length;j++){
                   System.out.println("Numero de graos na proxima casa: ");                          
                   A[i][j]= input.nextInt();
               }
                          } 
    for (int i=0;i<n;i++){
        for (int j=0;j<A[i].length;j+=2){
        somapreta=somapreta+A[i][j]; 

    }
    i=i+1;}
    for (int i=1;i<n;i++){
        for (int j=1;j<A[i].length;j+=2){
        somabranca=somabranca+A[i][j]; 

        }
    }

    System.out.println("Graos na preta "+somapreta);
    System.out.println("Graos na branca "+somabranca);
    if(somapreta>somabranca){
        System.out.println("Preta vence!");
    }
        else if(somabranca==somapreta){
                System.out.println("Empate!");
                }
                else{
                System.out.println("Branca vence!");
                }
    }    
    }
