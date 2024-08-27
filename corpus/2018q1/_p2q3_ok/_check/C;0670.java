
import java.util.Scanner;

public class Questao3 {
static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int tam,k = 20,i;
        System.out.println("Digite o tamanho do vetor");
        tam = input.nextInt();
        int vetor[] = new int[tam];
        int matriz[][] = new int[tam][tam];
        for (i=0; i<tam; i++){
            System.out.println("Digite o valor da posição"+i);
            vetor[i]= input.nextInt();
        }
        CriarMatriz(vetor,tam);
        ImprimirMatriz(matriz,tam);
    }
    public static int CriarMatriz(int v[], int tam){
        int matriz[][] = new int[tam][tam];
        int i,j;
         for (i=0; i<tam; i++){
             for (j=0; j<tam; j++){
                 if (i==j){
                      matriz[i][j] = v[i];
                 }
                 else{
                System.out.println("Digite o valor da linha "+i+" e coluna " +j);
                 matriz[i][j] = input.nextInt();
              }  
             }
}
         return matriz[tam][tam];
    }
    public static void ImprimirMatriz(int m[][], int tam){
        int i,j;
         for (i=0; i<tam; i++){
             for (j=0; j<tam; j++){
                 System.out.println("Digite o valor da matriz"+m[i][j]);

    }
}
    }
}
