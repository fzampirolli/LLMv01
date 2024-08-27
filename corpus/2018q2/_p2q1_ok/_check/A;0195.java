
import java.util.Scanner;

public class P2{

    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     final int MAX = 50;
     int V[] = new int [MAX];
     System.out.println("Preencher vetor: ");
     for(int i=0;i<MAX;i++){
         V[i]=(int)(Math.random()*72-21);
     }
     for(int i=0;i<MAX;i++){
         System.out.print(V[i]);
         System.out.print(" ");
     }
     System.out.println(V[9]);
     int cont=0;
     for(int i=0;i<MAX;i++){
         if(V[i]>V[9]){
           cont++;
         }
     }
     System.out.println(cont+" numeros sao maiores que "+V[9]);

     System.out.println("Insira um numero inteiro: ");
     int k;
    k = scan.nextInt();
    int x= 0;
    for(int i=0;i<MAX;i++){
        if(V[i]==k){
            x=i+1;
            System.out.println(k+" ocorreu na posição "+x);
        }
    }  
    if(x==0){
        System.out.println(k+" nao foi encontrado no vetor");
    }

    }

} 
