
import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        char matCONCEITOS [][]= new char [150][4];
        char matCONCEITOS1 [][]= new char [150][4];
        float media[] = new float [150];
        GeraMat (matCONCEITOS, 150, 4);

            for (int i = 0; i<150 ; i++){
                for (int j= 0; j<4 ; j++){
                    matCONCEITOS1[i][j]= matCONCEITOS[i][j];
                }
            }

        GeraMedia(matCONCEITOS1, 150,4, media);
        ImprimeConceitoFinal (media);

    }

    public static void GeraMat (char Mat[][], int nlinhas , int ncolunas){
        char conceitos [] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i = 0; i< nlinhas; i++){
            for (j=0 ; j<ncolunas ; j++){
                valor = (int)(Math.random()*5);
                Mat[i][j] = conceitos [valor];
            }
        }

    }

    public static void GeraMedia (char Mat[][], int nlinhas ,int ncolunas, float media[]){
        for (int i = 0; i<nlinhas ; i++){
            for (int j = 0; j<ncolunas ; j++){
                if (Mat[i][j] == 'A'){
                    Mat [i][j] = 4;
                } 
                if (Mat[i][j] == 'B'){
                    Mat [i][j] = 3;
                }
                if (Mat[i][j] == 'C'){
                    Mat [i][j] = 2;
                }
                if (Mat[i][j] == 'D'){
                    Mat [i][j] = 1;
                }
                if (Mat[i][j] == 'F'){
                    Mat [i][j] = 0;
                }                         
            }      
        }

        for (int i=0 ;i< nlinhas ; i++){
            media [i]= ((Mat[i][0]*37) + (Mat[i][1]*10) + (Mat[i][2]*15)+ (Mat[i][3]*38) )/100; 
        }

    }

    public static void ImprimeConceitoFinal (float media[]){
        for (int i=0 ; i<150 ; i++){
            if (media[i] <0.8){
                System.out.println ("Conceito final do aluno "+(i+1) +" é = F");
            } else if (media[i]<1.5){               
                System.out.println ("Conceito final do aluno "+(i+1) +" é = D");
            } else if (media [i]<2.5){
                System.out.println ("Conceito final do aluno "+(i+1) +" é = C");
            } else if (media [i]< 3.6){
                System.out.println ("Conceito final do aluno "+(i+1) +" é = B");
            } else 
                System.out.println ("Conceito final do aluno "+(i+1) +" é = A");

            }
    }

}
