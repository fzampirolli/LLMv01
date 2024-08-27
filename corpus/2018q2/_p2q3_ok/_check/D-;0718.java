
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {    

    GeraMatriz(Mat);

    GeraMedia(Mat);

    ImprimeConceitoFinal(Mat);

    }

    public static void GeraMatriz (char Mat[][], int nlinhas, int ncolunas){
        char conceitos [] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        nlinhas = 150;
        ncolunas = 4;
        for (i = 0 ; i < nlinhas; i++){
            for (j = 0; j < ncolunas; j++){
                valor = (int)(Math.random() *5);
                Mat [i][j] = conceitos [valor];
            }
        }
    }

    public static void GeraMedia (int i, int j){
            int media [] = new int [150];
            for (i = 0; i < 150; i++){
                media [i] = (j[0]*0.37 + j[1]*0.1 + j[2]*0.15 + j[3]*0.38)/4; 
            }           
    }

    public static void ImprimeConceitoFinal (int V[]){

    }

}
