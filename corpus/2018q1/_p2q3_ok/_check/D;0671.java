
import java.util.Scanner;

public class Provaexercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tam,mediatotal;

        System.out.println("Qual o tamanho do seu vetor? ");
        tam = entrada.nextInt();

        int vetor[] = new int[tam];
        for(int i=0; i<tam; i++){
            System.out.println("Qual o valor " +i+ " do vetor?? ");
            vetor[i] = entrada.nextInt();
        }

        int matrizes[][];
        matrizes = CriandoMatriz(vetor,tam);

        ImprimeMatriz(matrizes, tam);

        mediatotal = MediaMatriz(matrizes,tam);
        System.out.println("A média de todos os termos da matriz é: "+mediatotal);
    }

        public static int[][] CriandoMatriz(int v[], int tamanho){
    Scanner entrada = new Scanner(System.in);

    int matriz[][] = new int [tamanho][tamanho];
    for(int linha=0; linha < tamanho; linha++){
        for(int coluna=0; coluna<tamanho; coluna++){
            if( matriz[linha][coluna] == v[coluna]){
                matriz[linha][coluna] = v[coluna];
            }
            else{
                System.out.println("Digite um valor para a matriz:");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }
    }
         return matriz; 

}

    public static void ImprimeMatriz(int M[][], int tamanho){

        for(int linha=0; linha<tamanho; linha++){
            for(int coluna=0; coluna<tamanho; coluna++){
                System.out.println("Na posição["+linha+"]["+coluna+"] o valor é: "+M[linha][coluna]);
            }
        }

}

    public static int MediaMatriz(int M[][], int tamanho){
        int media=0,soma=0, contnum=0;
        for(int linha=0; linha<tamanho; linha++){
            for(int coluna=0; coluna<tamanho; coluna++){
                soma = soma + M[linha][coluna];
                contnum++;
            }
            media = soma/contnum;

    }
        return media;
    }
}