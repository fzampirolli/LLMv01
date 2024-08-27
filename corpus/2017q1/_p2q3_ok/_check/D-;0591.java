
import java.util.Scanner;

public class P2E03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l,c,lt=0,ct=0;
        System.out.println("Digite o número de linhas da matriz :");
        l=input.nextInt();
        if (l%2!=0){
            while (l%2!=0){
            System.out.println("Digite apenas números pares");
            System.out.println("Digite o número de linhas da matriz :");
            l=input.nextInt();
            }
        }

        System.out.println("Digite o número de colunas da matriz :");
        c=input.nextInt();
        if (c%2!=0){
           while (c%2!=0){
            System.out.println("Digite apenas números pares");
            System.out.println("Digite o número de colunas da matriz :");
            c=input.nextInt();

            } 
        }

        int A[][]=new int[l][c];
        LerMatriz(A,l,c);

        for (int il=0;il<l;il++){
            for (int ic=0;ic<c;ic++){
                System.out.println("Digite o valor do quadrante da linha "+(il+1)+" e coluna "+(ic+1));
                A[l][c]=input.nextInt();
            }
        }

    }
    public static void LerMatriz (int Vet1[][],int l, int c){
        int ll=l, cc=c;
        Scanner input = new Scanner(System.in);

        for (int il=0;il<l;il++){
            for (int ic=0;ic<c;ic++){
                System.out.println("Digite o valor do quadrante da linha "+(il+1)+" e coluna "+(ic+1));
                Vet1[il][ic]=input.nextInt();
            }
        }

    }

}
