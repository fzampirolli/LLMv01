
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int tamanho=0;
        int swap=0;
        System.out.println("Digite o tamanho do vetor, Ele deve ser impar e inteiro");
        tamanho=input.nextInt();
        int [] vetor= new int [tamanho];
        System.out.println("Vamos começar a preencher este vetor com valores inteiros;");
        for(int i=0;i<tamanho;i++){
            System.out.println("Digite o "+(i+1)+"° elemento do vetor");
            vetor[i]=input.nextInt();
        }
                System.out.println("Aqui esta o vetor digitado:");
        for(int i=0;i<tamanho;i++){
            System.out.print(vetor[i]+" ");
        }
                        System.out.println("para");

        for(int i=0;i<(tamanho/2);i++){

            if(vetor[i]<vetor[tamanho-1-i]){
                swap=vetor[i];            
                vetor[i]=vetor[tamanho-1-i];
                vetor[tamanho-1-i]=swap;

            }
        }
        System.out.println("Aqui esta o vetor semiparticionado:");
        for(int i=0;i<tamanho;i++){
            System.out.print(vetor[i]+" ");
        }
    }

}
