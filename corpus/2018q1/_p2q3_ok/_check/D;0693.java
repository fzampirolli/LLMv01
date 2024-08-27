
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
       int tam;
       int i;
       Scanner sc = new Scanner(System.in);

      System.out.println("Digite o tamanho desejado do vetor: \n");
      tam= sc.nextInt();
      int vetor[]= new int[tam];

       for(i=0;i<tam;i++){
        System.out.println("Digite o "+(i+1)+"º valor do vetor.\n");
        vetor[i]=sc.nextInt();   
       }
matriz(vetor,tam);
imprimir(matriz,tam);
    }

    public static int[][] matriz(int A[],int n){
        Scanner sc = new Scanner(System.in);
       int i,j;
       int matriz[][]=new int[n][n];
       for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j){
                matriz[i][j]=A[i];   
            }
            else{
            System.out.println("Digite o elemento ["+i+"] ["+j+"] da matriz");
            matriz[i][j]=sc.nextInt();
            }
        }

    }
   return matriz;    
}

    public static void imprimir(int matrizI[][],int n ){
        int matriz[][]=new matrizI[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println(matriz[i][j]);
            }
        }

    }

}