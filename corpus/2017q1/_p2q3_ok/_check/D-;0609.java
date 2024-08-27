
import java.util.Scanner;

public class q3 {
    public static void main (String []args){

        Scanner entrada = new Scanner (System.in);

        int l,c;
        System.out.println("Informe o numero par de linhas: ");
        l = entrada.nextInt();
        System.out.println("Informe um numero par de colunas: ");
        c = entrada.nextInt();

        int A[][]= new int [l][c];

        LeMatriz (A);

    }

    public static void LeMatriz (int m[][]){
        Scanner entrada = new Scanner (System.in);
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.println("Digite os valores da matriz: ");
                m[i][j]=entrada.nextInt();
            }
        }

    }

}
