
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        int[] DiagonalPrincipal = lerDiagonalPrincipal();
        int[][] matriz = CriarMatriz(DiagonalPrincipal);
        System.out.printf("Matriz:\n\n%s",imprimirElementos(matriz, "\n","\t"));
        float media = mediaMatriz(matriz);
        System.out.print("\n\n");
        System.out.printf("A média é %.2f\n\n",media);
    }

    private static String imprimirElementos(int[][] matriz,String separadorLinha,String separadorColuna){
        String msgRetorno = "";
        for (int i = 0; i < matriz.length; i++) {
            msgRetorno = msgRetorno.concat(imprimirElementos(matriz[i], separadorColuna))
                                         .concat((matriz.length!=i+1)?separadorLinha:"");
        }
        return msgRetorno;
    }

    private static String imprimirElementos(int[] vetor,String separador){
        String msgRetorno = "";
        for (int i = 0; i < vetor.length; i++) {
           msgRetorno = msgRetorno.concat(String.valueOf(vetor[i])
                                        .concat((vetor.length!=i+1)?separador:""));
        }
        return msgRetorno;
    }

    private static int[] lerDiagonalPrincipal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz:");
        int tamanho = sc.nextInt();
        System.out.println("Digite os valores da diagonal principal:");
        int[]v = new int[tamanho];
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite a posição %d:",i+1);
            v[i] = sc.nextInt();
        }
        return v;
    }

    private static int[][] CriarMatriz(int[] DiagonalPrincipal) {
        final int tam = DiagonalPrincipal.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os elementos da Matriz(sem os elementos da diagonal principal):");
        int[][] matriz = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if(i==j){
                    matriz[i][j] = DiagonalPrincipal[i];
                }else{                
                    System.out.printf("Digite a posição %d,%d da matriz:",i+1,j+1);
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
        return matriz;
    }

    public static float mediaMatriz(int[][] matriz){
        final int tamanho = matriz.length;
        int contador = 0;
        float soma = 0,media = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if(matriz[i][j] % 5 != 0){
                    contador++;
                    soma+=matriz[i][j];
                }
            }
        }
        if(contador != 0){
            media = soma/contador;
        }else{
            System.out.println("\n\nNenhum valor não multiplo de 5.");
        }
        return media;
    }
}
