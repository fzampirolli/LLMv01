
import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tam;
        System.out.println("Digite o tamanho do vetor: ");
        tam = entrada.nextInt();
        int v[] = new int[tam];
        for (int i=0; i<tam;i++){
            System.out.println("digite um valor: ");
            v[i] = entrada.nextInt();
        }
        int matrizRec=criarMatriz(v,tam);
        ImprimirMatriz(matrizRec[][],tam);
        System.out.println(matriz[i][j]);
        mediaMatriz(matrizRec[][],tam);
        System.out.println("a media e :"+ mediaimpares);
    }
    public static int criarMatriz(int vetor[],int tamanho){
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[tamanho][tamanho];
        for (int i=0;i<tamanho;i++){
            for(int j=0;j<tamanho;j++){
                if(i==j){
                    matriz [i][j]= vetor[i];
                }
                System.out.println("digite um valor: ");
                matriz[i][j]=entrada.nextInt();
        }
    }
    return matriz[tamanho][tamanho];
}
    public static int ImprimirMatriz(int matriz[][],int tama){
        for (int i=0;i<tama;i++){
            for (int j=0;j<tama;j++){
                System.out.println(matriz[i][j]);
            }
        }
        return matriz[tama][tama];
    }
    public static int mediaMatriz(int matriz[][],int tamanho){
        Scanner entrada = new Scanner(System.in);
        int somaimpar=0,mediaimpares,qimpar=0;
        for (int i=0;i<tamanho;i++){
            for(int j=0;j<tamanho;j++){
                if(matriz[i][j]%2==1){
                    somaimpar=somaimpar + matriz[i][j];
                    qimpar++;
                }
            }
        }
        mediaimpares=somaimpar/qimpar;
        return mediaimpares;
    }
}
