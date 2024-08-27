
import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {

         final int MAX=50;
         int V[]=new int [MAX];
         System.out.println("Preencher vetor");
         for (int i=0;i<MAX;i++){

             V[i]=(int)(Math.random()*72-21);
         }

         for(int i=0;i<MAX;i++){
             System.out.print(" "+V[i]);
         }
         System.out.println(" ");

         System.out.println("O elemento 6 do vetor é: "+V[5]);  
         int cont=0;
         for(int i=0;i<MAX;i++){
            if(V[5]<V[i]){  
            cont++;
            }
         }
         System.out.println("A quantidade de números maiores que "+V[5]+" é: "+cont);

         Scanner teclado = new Scanner (System.in);
         System.out.println("Digite um número inteiro k:");
         int k=teclado.nextInt();

         for(int i=0;i<MAX;i++){
             if(V[i]==k){
                 System.out.println("k ocorreu na posição "+(i+1));
             }
             else{
                 System.out.println("k não foi encontrado no vetor"); 
             }
         }
}

}   
