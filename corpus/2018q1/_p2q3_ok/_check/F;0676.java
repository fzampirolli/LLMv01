
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tam, media;

        System.out.print("Digite o tamanho do vetor : ");
        tam = entrada.nextInt();

        int [] vetor = new int [tam];

        for(int i=0; i<tam; ++i){
            System.out.print("Digite o valor da posição"+(i+1)+"ºdo vetor : ");
            vetor [i] = entrada.nextInt();
        }
        matrizRec = CriarMatriz(int vetor[tam] );
        ImprimirMatriz(matrizRec);
        media = MediaMatriz(matrizRec);

    }
    public static int CriarMatriz(int vetor[], int tam) {
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int [tam][tam];

        for(int i=0; i<tam; ++i){
            for(int j=0; j<tam; ++j){
               if(i!=j){
                   System.out.print("Digite um valor para a "+(i+1)+"ºlinha e "+(j+1)+"ºcoluna : ");
                   matriz [i][j] = entrada.nextInt();
               }
               else{
                   if(i==j){
                       matriz [i][j] = vetor [];
                   }
               }
            }
        }

    return matriz[][];  

    }

    public static void ImprimirMatriz(int matriz[][], int tam){
        for(int i=0; i<tam; ++i){
            for(int j=0; j<tam; ++j){ 
                System.out.print(matriz[i][j]);                 
    }

    public static double MediaMatriz(int matriz[][]) {
        for(int i=0; i<tam; ++i){
            for(int j=0; j<tam; ++j){ 

            }
    }       
}
