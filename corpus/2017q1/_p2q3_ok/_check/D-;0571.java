
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

       int n, k;
       Scanner entrada=new Scanner (System.in);

        System.out.println("insira o numero de linhas");
        n=entrada.nextInt();   
        System.out.println("insira o numero de colunas");
        k=entrada.nextInt();

        int A[][]=new int [n][k];

        LerMatriz(A,n,k);

    }

    public static void LerMatriz(int m[][], int n, int k){
        int i, j;
        Scanner entrada=new Scanner (System.in);

        for(i=0;i<n;i++){
            for (j=0;j<k;j++){
                System.out.println("digite a entrada"+i+","+j+"da matriz");
                m[i][j]=entrada.nextInt();
            }

        } 
        for(i=0;i<n;i++){
            for (j=0;j<k;j++){
        System.out.println("["+i+"]["+j+"]= "+m[i][j]);
            }
        }
    }

}
