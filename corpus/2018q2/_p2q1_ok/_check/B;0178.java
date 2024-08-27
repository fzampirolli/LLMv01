import java.util.Scanner;

public class Questao1 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    final int MAX = 20;
    int V[] = new int[MAX],i=0,k=0;

    System.out.println("Preencher o vetor:");
        for(i=0; i<MAX; i++){

        V[i] = (int)(Math.random()*72-21);
        }

        i=0;
        while(i<MAX){
            System.out.println(V[i]);
            i++;
        }

        System.out.println("O valor do vetor de índice 13 é: "+V[13]);
        i=0;
        System.out.print("Os valores dos vetores maiores ou iguais ao vetor 13 com valor igual a " +V[13]+ ", são: \n");

        while(i<MAX){

            if(V[i]>=V[13]){
            System.out.println(V[i]);
            }
            i++;
        }

        System.out.print("Digite um número para busca: ");
        k = entrada.nextInt();

        i=0;
        int t=0;

        while(i<MAX){
            while(i<MAX){  

            if(k == V[i]){
            t++;
            System.out.println("O número "+k+" esta na posição "+i+ " do vetor.");      
            }
            i++;
        }
            if(t==0){
            System.out.println("O número "+k+ " não foi encontrado no vetor.");
            }
            }

  }

}
