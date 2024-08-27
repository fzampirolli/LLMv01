
import java.util.*;
public class Prova {

    public static void main(String[] args) {

    Scanner sca = new Scanner (System.in);
        final int MAX = 50;
    int cont, i;
    cont=0;
    int V[] = new int [MAX];
    System.out.println("Preencher o vetor");
    for (i=0;i<MAX;i++){
        V[i]=(int)(Math.random()*72-21);
        System.out.println(V[i]);
    }

    System.out.println("O número dentro do V[12] é " + V[12]);
    for (i=0;i<MAX;i++){
    if (V[i]>V[12]){
    cont++;
                   }
    }
    System.out.println("A quantidade de números maiores que o número dentro do V[12] é " + cont);

    int k;
    System.out.println("Agora digite um número qualquer para verificarmos se ele pertence ao vetor ");
    k=sca.nextInt();
    int A[] = new int [50];   
    int a=0;                  
    cont=0;
    for (i=0;i<MAX;i++){
    if (k==V[i]){
    System.out.println("o número "+  k + " apareceu no vetor na posição " + i);
    cont++;
     }}
    if (cont==0){
    System.out.println("o número  " + k + " não foi encontrado em nenhuma posição");

    }

    }

}
