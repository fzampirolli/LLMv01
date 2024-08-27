
import java.util.Scanner;
public class questao3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

    int L, C, i, j;

    System.out.println("Digite dimensão para na linha L: ");
    L=teclado.nextInt();

    System.out.println("Digite Coluna C:");
    C=teclado.nextInt();

    float matrizA[][];
    matrizA = new float [L][C];

    for(i=0;i<L;i++){
    for(j=0; j<C; j++){
    System.out.println("Digite o elemento da linha "+(j+1)+" coluna "+(i+1)+":");
    matrizA[i][j]=teclado.nextFloat();
  }
 }

    for(i=0;i<L;i++){
    for(j=0; j<C; j++){
    System.out.println(matrizA[i][j]);
    }
    }

     for (i=0;i<5;i++){
    System.out.println(matriz[i][n]);
    }

}
