
import java.util.Scanner;
public class SergioAugustoDosSantosJunior__junior_santos__P2(questao1) {

    public static void main(String[] args) {
        final int MAX=50;
        int cont,   L=1, cont2;
        int V[]=new int [MAX];
        System.out.println("Preencher o vetor:");
        for(int i=0;i< MAX;i++ ){
            V[i]= (int)(Math.random()*72-21);
        }
        System.out.println("Valores do Vetor:");
        for(int i=0;i< MAX;i++ ){
           System.out.print(V[i] +" ");
        }
                System.out.println("Elemento do indice 5:" +V[5]);

                    for (cont=0;cont<MAX;cont++){
                        if(V[5]<V[cont]){
                        System.out.println("cont:"+V[cont]);   
                        }
                    }

                    System.out.println("Escreva um numero inteiro:");
                    Scanner sc = new Scanner(System.in);
                    int k = sc.nextInt();
                    for (cont2=0;cont2<MAX;cont2++){
                        if(k==V[cont2]){
                            System.out.println("Ocorreu:"+V[cont2]);
                        }
                       if(k!=V[cont2]){
                        System.out.println("k não foi encontrado no vetor");  
                        }

                    }
    }
}
