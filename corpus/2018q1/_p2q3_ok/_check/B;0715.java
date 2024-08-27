import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        int tam, media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        tam = input.nextInt();
        int vetor[] = new int [tam];
        int matrizes, imprimirMatriz;

        for(int i = 0; i<tam; i++){
            for(int j = tam+1; j>0; j--){
                vetor[i] = j-1;
            }
        }
        matrizes = CriarMatriz(vetor);
        media = Media(matrizes);
        imprimirMatriz = ImprimirMatriz(matrizes);
    }
public static int[][] CriarMatriz(int vetor[]){
    Scanner input = new Scanner(System.in);
    int nova_matriz[][] = new int [vetor.length][vetor.length];
    System.out.println("Digite os valores da matriz: ");
    for(int i = 0; i<vetor.length; i++){
        for(int j = 0; j<vetor.length; j++){
            nova_matriz[i][j] = input.nextInt();
        }
    for(int m = 0; m<vetor.length; m++){
            nova_matriz[m][m] = vetor[m];
        }
    }    
        return nova_matriz;
}
public static int[][] ImprimirMatriz(int matrizRec[][]){
    for(int i=0; i<matrizRec.length; i++){
         for(int j=0; j<matrizRec.length; j++){
        System.out.print(matrizRec[i][j] + " " + "\n");
         }
    }
        return matrizRec;
}

public static int Media(int matriz_e[][]){
    int calc_media = 0;
    int res, cont = 0;
    for(int i =0; i<matriz_e.length; i++){
        res = (matriz_e[i][i])/5;
        if(res%5==0){
            cont = cont + matriz_e[i][i];
        }
        calc_media = cont/9;
        System.out.println("A media da soma é: "+calc_media);

    }
        return calc_media;
}
