
import java.util.Scanner;

public class QUESTAO3 {

    public static void main(String[] args) {

        Scanner ler= new Scanner (System.in);
        int x;
        System.out.println("Quantos elementos tem o vetor?");
        x= ler.nextInt();
        int [] v = new int [x];
            for (int i=0; i<x; i++){
                System.out.println("Quais os valores do vetor na posição : " +i);
                v[i]= ler.nextInt();
    }

            chamado(v, x);
  }
    public static int chamado (int v[],int x){
        Scanner ler= new Scanner (System.in);
        int l;
        System.out.println("Quantas linhas tem a matriz?");
        l= ler.nextInt();
        int c;
        System.out.println("Quantas colunas tem a matriz?");
        c= ler.nextInt();
        int[][] M = new int [l][c];
         for (int i=0; i<l; i++){
             for (int j=0; j<c; j++){
                 System.out.println("Quais são os valores da matriz na linha "+ i + "e na coluna "+ j);
                 M[i][j]=ler.nextInt();
             }
         }

        return 0;

    }

}
