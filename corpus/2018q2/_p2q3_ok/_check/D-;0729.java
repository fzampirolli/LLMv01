
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int matCONCEITOS [][] = new int [150][4];

        String A,B,C,D,F;

        GeraMat(Mat, nlinhas,ncolunas);
        GeraMedia(ncolunas,nlinhas);
        ImprimeConceitoFinal();
    }
    public static void GeraMat(char Mat[][],int nlinhas,int ncolunas){
        char conceitos[] ={'A','B','C','D','F'};
        int i,j,valor;
        for(i=0;i<nlinhas;i++){
              for(j=0;i<ncolunas;j++){
                  valor=(int)(Math.random()*5);
                  Mat[i][j]=conceitos [valor];

              }
        }
    }

    public static void GeraMedia()

}

    public static void ImprimeVetor(int matCONCEITOS[][]){
       for(i=0;i<nlinhas;i++){
              for(j=0;i<ncolunas;j++){
              System.out.println(matCONCEITOS[i][j]);
}
}
