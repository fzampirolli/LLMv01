
import java.util.*;

public class Questao3 {

    public static void GeraMat(char Mat[][],int nlinhas, int ncolunas){
        char conceitos[]={'A','B','C','D','F'};
        int i, j, valor;
        for (i=0; i <nlinhas;i++){
            for (j=0; j <ncolunas;j++){
                valor =(int)(Math.random()*5);
                Mat[i][j]=conceitos [valor];

        }
    }
    }

     public static void ImprimeConceitoFinal(char v[],int nlinhas, int ncolunas){
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nlinhas=150;
        int ncolunas = 4;
        char Mat[][]=new char[150][4];

        GeraMat(char Mat[][],int nlinhas, int ncolunas){

    }

}
}
