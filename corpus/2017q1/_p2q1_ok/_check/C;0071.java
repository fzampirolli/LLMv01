
import java.util.Scanner;

public class P2QUESTAO1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, i;

        System.out.println("Escreva o tamanho do vetor A e B: ");
        n=entrada.nextInt();
        int A[]= new int [n];

        System.out.println("Escreva os elementos do vetor A: ");
        for(i=0;i<n;i++){
            A[i]=entrada.nextInt();
        }
        System.out.println("O vetor A é: ");
        for(i=0;i<n;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");

        int B[]=new int[n];
        System.out.println("Escreva os elementos do vetor B: ");
        for(i=0;i<n;i++){
            B[i]=entrada.nextInt();
        }
        System.out.println("O vetor B é: ");
        for(i=0;i<n;i++){
            System.out.print(B[i] + " ");
        }
        System.out.println(" ");

        int C[] = new int [n];
        System.out.println("O vetor C é: ");
        for(i=0;i<n;i++){

            if(A[i]>B[i]){

                System.out.print(A[i] + " ");

            }
            else{
                System.out.print(B[i] + " ");
            }
        }

    }

}
