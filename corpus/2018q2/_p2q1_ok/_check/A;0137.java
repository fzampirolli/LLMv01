
import java.util.Scanner;

public class P2Q1 {

    public static void main(String[] args) {

        final int MAX=50;
        int V[]= new int[MAX];
        System.out.println("Preencher vetor:");
        for (int i=0; i<MAX; i++){

            V[i]=(int)(Math.random()*72-21);

            System.out.println(V[i]);

        }

        System.out.println(V[13]);

         int cont=0;
         for (int i=0; i<MAX; i++){
            if(V[i]>V[13]){
                cont++;

            }
        }
        System.out.println("Numero de elementos maiores que V[13]=" +cont);

        int k;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Declare o valor de K");
        k=entrada.nextInt();
        cont=0;
        for (int i=0; i<MAX; i++){
            if(V[i]==k){

                cont++;

                System.out.println("O inteiro K foi encontrado no indice:"+i);

            }
        }
        if(cont==0){

        System.out.println("O inteiro K não foi encontrado no vetor");}

    }

}
