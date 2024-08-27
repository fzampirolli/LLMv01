
import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int n=0;
    int i=0;
    int j=0;

        System.out.println("insira o tamanho n do vetor (n deve ser ímpar) ");
        n=input.nextInt();

        int []vetor=new int[n];
        int []semipart=new int[n];
        for (i=0;i<vetor.length;i++){

        System.out.println("entre com os elementos do vetor");
        vetor[i]=input.nextInt();
        }
        for (i=0;i<vetor.length;i++){

            System.out.println(vetor[i]);
        }
        for (i=0;i<vetor.length;i++){
            for (j=0;j<vetor.length;j++){
        if (vetor[i]<vetor[i+1]) {
                vetor[i]=semipart[j];
                System.out.println(semipart[j]);
        }
        }   
    }
    }
}