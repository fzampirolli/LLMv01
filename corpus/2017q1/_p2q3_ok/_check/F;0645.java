
import java.util.Scanner;

public class Questao3P2 {

    public static void main(String[] args) {

        int l=0, c=0;
        int i, k;
        int[][] A=new int [l][c];
        Scanner leitor= new Scanner (System.in);
        System.out.println("Digite um numero par de linhas:");
        l = leitor.nextInt();
         System.out.println("Digite um numero par de colunas:");
        c = leitor.nextInt();
        if (l%2!=0 || c%2!=0 ){
            System.out.println("Apenas numeros pares, rode o programa novamente!");
           }
        for (i=0;i<l;i++){
            for(k=0;k<c;k++){

                System.out.println("Digite o valor da linha "+i+" coluna "+k);
                A[i][k]=leitor.nextInt();
            }

        }

    }

}
