
import java.util.*;

public class P23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lin=150, col = 4;
        double Mat[][] = new double[lin][col];

    }
    public static void GeraMat(char Mat[][],int nlinhas, int ncolunas){
        char conceitos[]={'A','B','C','D','F'};
        int i, j, valor;
        for (i=0; i<nlinhas;i++){
            for(j=0; j<ncolunas; j++){
                valor = (int)(Math.random()*5);
                Mat[i][j] = conceitos[valor];
            }
        }
    }
    public static void GeraMedia(char Mat[][],int nlinhas, int ncolunas){
        char conceitos[]={'A','B','C','D','F'};
        int i, j, valor;
        for
    }

}
