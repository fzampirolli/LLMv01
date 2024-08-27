
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        final int MAX=50;
        int V[]= new int [MAX];

        System.out.println("Preencher vetor:");

        for (int i=0;i<MAX; i++){
            V [i]= (int)(Math.random()*72-21);

        }
        Scanner leitor= new Scanner (System.in);
        int k,n;
        int i = 0;
        System.out.println("insira o tamanho do vetor"+ (i+1)+":");
      V[i]= leitor.nextInt();                 
        System.out.println("insira um número k:");
        k= leitor.nextInt();
        for (k=0; k< MAX; k++){
            System.out.println("k ocorre na posição :"+ k);   

        }

    }      

}
