import java.util.*;
public class P2QUESTAO1 {
    public static void main(String[] args) {
        final int MAX = 50,k,aux;
        int V[] = new int [MAX];

        Scanner scan = new Scanner (System.in);
        System.out.println("Preencher vetor:");
            for (int i=0; i<MAX; i++){

                V[i] = (int)(Math.random()*72-21);
                System.out.println("elemento "+i+" do vetor "+V[i]);
                }
                System.out.println("O elemento de índice 7 é o: "+V[6]);  

                System.out.println("Digite um numero para fazer a busca: ");
                k=scan.nextInt();                
                for (int j=0; j>MAX; j++){   
                    if (k==V[j]){
                    System.out.println("k ocorreu na posição "+j);
                    }
                }
    }
}
