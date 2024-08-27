
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("Digite um valor qualquer :");
        int k = scan.nextInt();
        System.out.println("Preencher vetor :");
        for(int i=0;i < MAX; i++){
            V[i] = (int)(Math.random()*72-21);
        }
        for(int i=0;i < MAX; i++){
            System.out.println(V[i]);
    }
        int soma = 0;
         for(int i=0;i < MAX; i++){
             if(V[i]>V[11]){
                 soma++;
             }
         }
         for(int i=0;i < MAX; i++){
             if(V[i]== k ){
                 System.out.println("k ocorreu na posição :" + i);
             }
             else{
                 System.out.println("k não foi encontrado no vetor" );  
             }
         }
         System.out.println(" O elemento do vetor V[11] é :" + V[11] + " e a quantidade de elementos maiores do que este são :" + soma);
 }
}