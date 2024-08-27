
import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
     Scanner entrada=new Scanner (System.in);

     int vetor[], tam,n,elemento, matriz[][];
     System.out.println("Insira o tamanho do vetor");
     tam=entrada.nextInt();
     vetor=new int[tam];

     for(n=0; n<tam; n++){
          System.out.println("Insira o elemento do vetor: ");
          elemento=entrada.nextInt();
          vetor[n]=elemento;
      }

     CriarMatriz(vetor,tam);
     int returncriar;
     returncriar=CriarMatriz(vetor,tam);
     System.out.println(" "+returncriar+" ");

     ImprimirMatriz(matriz,tam);
     int returnimprimir;
     returnimprimir=ImprimirMatriz(matriz,tam);
     System.out.println(" "+returnimprimir+" ");

     MediaMatriz(matriz,tam);
     int returnmedia;
     returnmedia=MediaMatriz(matriz,tam);
     System.out.println("A média é "+returnmedia);

    }

    public static int CriarMatriz (int vetor[],int tam){
        Scanner entrada=new Scanner (System.in);
        int matriz[][],i,j,k;
        matriz=new int[tam][tam];
         for(i=0; i<tam; i++){
           for(j=0; j<tam; j++){
          System.out.println("Insira o elementos para sua matriz: ");
          k=entrada.nextInt();
          matriz[i][j]=k;}}

         return (matriz[i][j]);
      }

    public static int ImprimirMatriz (int matriz[][],int tam){
    Scanner entrada=new Scanner (System.in);
    int i,j; 
    for(i=0; i<tam; i++){
          for(j=0; j<tam; j++){
          return (matriz[i][j]);
    }}
    }
    public static int MediaMatriz (int matriz[][],int tam){
    Scanner entrada=new Scanner (System.in);
    int i,j,soma=0,media; 
    for(i=0; i<tam; i++){
          for(j=0; j<tam; j++){
          soma=matriz[i][j]+soma;
    }}
    media=soma/tam;
    return (media);
    }
}
