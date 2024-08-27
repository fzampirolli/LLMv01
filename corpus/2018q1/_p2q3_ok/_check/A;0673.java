
    import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        int tam, vetor[], i, matrizRec[][];
        float media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor.");
        tam = sc.nextInt();

        vetor = new int[tam];

        for (i = 0; i < tam; i++){
            System.out.println("Digite os valores do vetor.");
            vetor[i] = sc.nextInt();
        }

        matrizRec = CriarMatriz(vetor, tam);

        ImprimirMatriz(matrizRec, tam);

        media = MediaMatriz(matrizRec, tam);

        System.out.println("A média é: " + media);
    }

    public static int[][] CriarMatriz (int vetor[], int tam){
        int i, j, matriz[][];
        matriz = new int[tam][tam];

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < tam; i++){
            for (j = 0; j < tam; j++){
                if (i != j){
                    System.out.println("Digite o valor da linha"+ (i+1) +" e coluna "+ (j+1));
                    matriz[i][j] = sc.nextInt();
                }

                if (j == i){
                    matriz[i][j] = vetor[i];
                }
            }
        }

        return (matriz);
    }

    public static void ImprimirMatriz (int matrizRec[][], int tam){
        int i, j;

        System.out.println("Matriz:");

        for (i = 0; i < tam; i++){
            for (j = 0; j < tam; j++){
                System.out.print(matrizRec[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static float MediaMatriz (int matrizRec[][], int tam){
        int i, j, a = 0, V[], b = 0, soma = 0;
        float media = 0;

        for (i = 0; i < tam; i++){
            for (j = 0; j < tam; j++){
                if (matrizRec[i][j] % 5 != 0){
                a++; 
                }
            }
        }

        V = new int[a];

        for (i = 0; i < tam; i++){
            for (j = 0; j < tam; j++){
                if (matrizRec[i][j] % 5 != 0){
                V[b] = matrizRec[i][j];
                b++;
                }
            }
        }

        for (b = 0; b < a; b++){
           soma = soma + V[b]; 
        }

        media = soma/a;

        return (media);
    }
}
