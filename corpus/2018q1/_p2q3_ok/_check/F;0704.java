
import java.util.Scanner;

public class Q3 {

public static void main(String[]args){
    Scanner entry = new Scanner(System.in); 
    int tam,matrizes; 
    tam = entry.nextInt();
    int vetor[]= new int[tam];
    for(int i=0;i<tam;i++){
        vetor[i]= entry.nextInt();
    }
            public static void imprimirmatriz(int m[][]){
            for(int i=0;i<tam;i++){

            for(int j=0;j<tam;j++){
            System.out.printf("%d   ",matriz[i][j]);
            }
            System.out.println();
            }
        }
        public static int CriarMatriz(int vetor[], int tam){
        int matriz[][] = new int[tam][tam];
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                matriz[i][j]= entry.nextInt();

}
}
return matriz[][];
}
    matrizes = CriarMatriz(vetor,tam);
    imprimirmatriz(matrizes);

}
