
import java.util.*;

public class P21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAX = 50;
        int V[] = new int[MAX];
        int c=0,k;
        System.out.println("Preencher vetor: ");
        for (int i = 0; i<MAX; i++){
            V[i]= (int)(Math.random()*72-21);
            System.out.println(V[i] + " ");
            if(V[i]>V[14]){    
                c = c + 1;
            }
        }
        System.out.println("O elemento 14 é: " + V[14]);
        System.out.println("O nº de elementos maior que o elemento 14 é: " + c);
        System.out.println("Digite um valor de k: ");
        k = entrada.nextInt();
        int x = 0;
        for(int i =0;i<MAX;i++){
            if(k == V[i]){
                x = x+1;
                System.out.println(k + " ocorreu na possição: " + i);     
            }
        }
        if(x==0){
            System.out.println(" k não ocorre no vetor");
        }
    }
}    
