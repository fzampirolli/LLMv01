import java.util.Scanner;
public class Ex3{
  public static void main (String [] args){ 	
    Scanner leitor = new Scanner(System.in);
    int A [][] = new int;

    A[][] = GeraMatriz;

static void GeraMatriz (int Mat[][], int L=23, int C=23){
    for (int i=0; i <L; i++){
        for (int j=0; j<C; j++){
            Mat [i][j] = (int)(Math.random()*10);
        }
    }

static void imprimeMatriz (int Mat[][], int L=23, int C=23){
    for (int i=0; i <23; i++){
        for (int j=0; j<23; j++){
            System.out.println (A[i][j]);
        }
    }
static void MatrizTrasposta (int Mat[][], int L=23, int C=23){
        for (int i=0, int k=0; i <L , k< L ; i++, k++){
        for (int j=0,int l; j<C, l<C; j++, l++){
            if (i!=j){

                aux = Mat[i][j];
                Mat[i][j]= Mat[l][k];
                Mat[i][j]= aux;
            }
}
    static void media (int Mat[][], int L=23, int C=23){
    for (int i=0; i <23; i++){
        for (int j=0; j<23; j++){
            if (j<i){

            }
        }

        }

}
}
}
