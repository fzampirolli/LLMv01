
import java.util.Scanner;
public class Questao3 {

    static void GeraMat(char Mat[][], int nlinhas, int ncolunas){
        char conceitos[]={'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i=0; i<nlinhas; i++){
            for(j=0; j<ncolunas;j++){
                valor = (int)(Math.random()*5);

                Mat[i][j] = conceitos[valor];
                System.out.print (Mat[i][j]+" ");
            }
            System.out.println();
        }

    } 

     static void GeraMedia(double media[], int n){
         int A =4, B = 3, C =2, D=1, F=0;
         int atividades[] = {31,10,15,44};
         double soma;

             if (conceito=='A')
                 soma = A*atividades[];
             else if (conceito =='B')
                 soma = B*atividades[];
             else if (conceito=='C')
                 soma = C*atividades[];
             else if(conceito=='D')
                 soma =D*atividades[];
             else 
                 soma =F*atividades[];

    }
    static void ImprimeConceitoFinal(){

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char Conceitos[][] = new char [150][4];
        double Media[] = new double [150];

       GeraMat(Conceitos, 150, 4);
            }

       GeraMedia(Media,150);

}
