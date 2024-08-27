
import java.util.Scanner;

public class P2q3 {
    public int CriarMatriz(int vetor[], int tam){
        int matriz [][] = new int [tam][tam];
        int i, j=0, b, d, e, f;
        System.out.println("Digite os elemtos da matriz:");
        for (b=0; b< tam; b++){
            for (d=0; d< tam; d++){
            matriz [b][d] = entrada.nextInt();
        }}
        for (i = 0; i==j; i++){
            matriz [i][j] = vetor [i];
        }
        for (e=0; e< tam; e++){
            for (f=0; f< tam; f++){
        System.out.println( matriz [e][f]);
    }}
    }
    public int ImprimirMatriz(int CriarMatriz[][], int tam){
        int e, f;
        int matrizRec[][] = new int [tam][tam];
        for (e=0; e< tam; e++){
                for (f=0; f< tam; f++){
        matrizRec [][]= CriarMatriz[tam][tam];
                }}
        for (e=0; e< tam; e++){
            for (f=0; f< tam; f++){
        System.out.println( matrizRec [e][f]);
    }}
    }

    public int MediaMatriz(int CriarMatriz[][], int tam){
        int e, f, cont = 0, soma=0, media=0;
        for (e=0; e< tam; e++){
                for (f=0; f< tam; f++){
        if (CriarMatriz[e][f]%5 == 0){
            soma = CriarMatriz[e][f];
            cont ++;
        }}}
        media = soma / cont;
        System.out.println( +soma);
    }

    public static void main(String[] args) {
    int c, tam;
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite o tamanho do vetor:");
    tam = entrada.nextInt();
    int vetor[] = new int [tam];
    System.out.println("Digite os elementos do vetor:");
       for (c=0; c<tam; c++){
           vetor[c]=entrada.nextInt();
       }

    System.out.println(+CriarMatriz[][]);
    System.out.println(+MediaMatriz);
    } 
    }
