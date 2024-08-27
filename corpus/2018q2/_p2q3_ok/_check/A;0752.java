
import java.lang.Math;
import java.util.Scanner;

public class 3 {

    public static void main(String[] args) {
        char[][] matCONCEITOS = new char[150][4];
        double[] medias = new double[150];
        GeraMat(matCONCEITOS, 150, 4);
        GeraMedia(matCONCEITOS, medias);
        ImprimeConceitoFinal(medias);
    }

    static void GeraMat(char Mat[][], int nlinhas, int ncolunas){
        char conceitos [] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;

        for (i=0;i<nlinhas;i++){
            for (j=0;j<ncolunas;j++){
                valor = (int)(Math.random()*5); 

                Mat[i][j] = conceitos[valor];
            }
        }
    }   

    static void GeraMedia(char[][] mat, double[] medias){
        double nota_p1, nota_atv, nota_proj, nota_p2;

        for (int i=0;i<150;i++){
            nota_p1=convertConceito(mat[i][0]);
            nota_atv=convertConceito(mat[i][1]);
            nota_proj=convertConceito(mat[i][2]);
            nota_p2=convertConceito(mat[i][3]);

            medias[i]=(nota_p1*0.37+nota_atv*0.1+nota_proj*0.15+nota_p2*0.38);
        }
    }

    static double convertConceito(char conceito){
        double conceitoNumerico = 0;

        if(conceito=='A'){
            conceitoNumerico=4;
        } else if(conceito=='B'){
            conceitoNumerico=3;
        } else if(conceito=='C'){
            conceitoNumerico=2;
        } else if(conceito=='D'){
            conceitoNumerico=1;
        } else if(conceito=='F'){
            conceitoNumerico=0;
        }
        return conceitoNumerico;
    }

    static void ImprimeConceitoFinal(double[] medias){
        for (int i=0;i<150;i++){
            if (medias[i]<0.8){
                System.out.println("Aluno:" + i);
                System.out.println("Conceito Final: F");
            } else if (medias[i]<1.5){
                System.out.println("Aluno:" + i);
                System.out.println("Conceito Final: D");
            } else if (medias[i]<2.5){
                System.out.println("Aluno:" + i);
                System.out.println("Conceito Final: C");
            } else if (medias[i]<3.6){
                System.out.println("Aluno:" + i);
                System.out.println("Conceito Final: B");
            } else {
                System.out.println("Aluno:" + i);
                System.out.println("Conceito Final: A");
            } 
        }
    }
}
