
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 50;
        int V[] = new int[MAX];
        System.out.println("Preencher vetor:");
        for(int i=0;i<MAX;i++){
            V[i] = (int)(Math.random()*72-21);
        }

        System.out.println("");
        System.out.println("Os elementos do vetor são:");
        for(int i=0;i<MAX;i++){
            System.out.print(V[i]+" ");
        }
        System.out.println("");
        System.out.println("");

        int cont=0;
        for(int i=0;i<MAX;i++){
            if(V[i]>V[11]){
                cont=cont+1;
            }
        }
        System.out.println("Elemento de índice 11: "+V[11]);
        System.out.println("Número de elementos maiores que ele: "+cont);
        System.out.println("");

        int k,num=0;
        System.out.println("Digite um número para buscar sua existência no vetor.");
        k = sc.nextInt();
        System.out.println("");
        for(int i=0;i<MAX;i++){
            if(V[i]==k){
                System.out.println("O número "+k+" ocorreu no índice "+i);
                num=num+1;
            }
        }

        if(num==0){
            System.out.println("O número "+k+" não foi encontrado no vetor.");
        }

    }

} 