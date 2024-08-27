
import java.util.Scanner;

public class P23 {
public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int tam;

        System.out.print("Digite o tamanho do vetor: ");
        tam = entrada.nextInt();

        int vetor[] = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.print("Digite o "+(i+1)+"° elemento do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        int matriz[][] = criaçaomatriz(vetor,tam);
        int contador = 1;
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                System.out.println("O "+contador+"° elemento da matriz e: "+matriz[i][j]);
                contador++;
            }
        }
    }
    public static int[][] criaçaomatriz(int vetor[], int tam){
        int matriz[][] = new int[tam][tam];
        int contador = 1;
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if( i == j){
                    matriz[i][j] = vetor[i];
                    contador++;
                }
                else{
                    System.out.print("Digite o "+contador+"° elemento da matriz: ");
                    matriz[i][j] = entrada.nextInt();
                    contador++;
                }   
            }
        }
        return matriz;
    }

}
