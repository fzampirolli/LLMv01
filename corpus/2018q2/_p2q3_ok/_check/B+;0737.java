
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nlinhas = 150;
        int ncolunas = 4;
        char matCONCEITOS[][] = new char[nlinhas][ncolunas];
        int matCONCEITOSnum[][] = new int[nlinhas][ncolunas];
        GeraMat(matCONCEITOS,matCONCEITOSnum,nlinhas,ncolunas);
        GeraMedia(matCONCEITOSnum);

    }

    static void GeraMat(char MatCONCEITOS[][], int MatCONCEITOSnum[][], int nlinhas, int ncolunas){
        char conceitos[] = {'A','B','C','D','F'};
        int conceitosnum[] = {0,1,2,3,4};
        int i,j,valor;
        for(i=0;i<nlinhas;i++){
            for(j=0;j<ncolunas;j++){
                valor = (int)(Math.random()*5); 

                MatCONCEITOS[i][j]=conceitos[valor];
                MatCONCEITOSnum[i][j]=conceitosnum[valor];
            }
        }
    }

    public static double GeraMedia(int MatCONCEITOSnum[][]){
        double media = 0;
        double medias[] = new double[150];
        for(int i=0;i<150;i++){
            for(int j=0;j<4;j++){
                if(j==0){
                    media = media + (MatCONCEITOSnum[i][j]*39);
                }
                else if(j==1){
                    media = media + (MatCONCEITOSnum[i][j]*10);
                }
                else if(j==2){
                    media = media + (MatCONCEITOSnum[i][j]*15);
                }
                else if(j==3){
                    media = media + (MatCONCEITOSnum[i][j]*36);
                }
            }
            media = media/100;
            medias[i] = media;
            media = 0;
        }
            for(int i=0;i<150;i++){
            System.out.println(medias[i]);
        }
            return medias[150];
    }

    public static void ImprimeConceitoFinal(){

    }

}
