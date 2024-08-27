
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
     char matCONCEITOS[][] = new char[150][4];

  GeraMat(matCONCEITOS,150,4);

    }
    static void GeraMat(char Mat[][],int nlinhas, int ncolunas){
        char conceitos[] = {'A','B','C','D','F'};
        int i,j,valor;
        for(i=0;i<nlinhas;i++){
            for(j=0;j<ncolunas;j++){
                valor=(int)(Math.random()*5); 

                Mat[i][j]=conceitos[valor];
            }
        }

        GeraMedia(Mat,150,4);

    }
    static void GeraMedia(char Mat[][],int nlinhas, int ncolunas){
        int i,j;
        double Conceito[][] = new double[150][5];
        for(i=0;i<nlinhas;i++){
            for(j=0;j<ncolunas;j++){
                if(Mat[i][j]=='A'){
                    Conceito[i][j]=4;
                }
                else if(Mat[i][j]=='B'){
                    Conceito[i][j]=3;
                }
                       else if(Mat[i][j]=='C'){
                        Conceito[i][j]=2;
                       }
                        else if(Mat[i][j]=='D'){
                            Conceito[i][j]=1;
                                }
                               else if(Mat[i][j]=='F'){
                                Conceito[i][j]=0;
                                }
            }
        }

        for(i=0;i<nlinhas;i++){
            Conceito[i][4]=((34*Conceito[i][0])+(10*Conceito[i][1])+(15*Conceito[i][2])+(41*Conceito[i][3]))/100;
        }

        ImprimeConceitoFinal(Conceito,150,5);
    }
    static void ImprimeConceitoFinal(double Conceito[][], int nlinhas,int ncolunas){
        int i;
        char ConceitoFinal[][] = new char[150][1];
        for(i=0;i<nlinhas;i++){
            if(Conceito[i][4]<0.8){
                ConceitoFinal[i][0]='F';
            }
            else if(Conceito[i][4]<1.5){
                ConceitoFinal[i][0]='D';
            }
            else if(Conceito[i][4]<2.5){
                ConceitoFinal[i][0]='C';
            }
            else if(Conceito[i][4]<3.6){
                ConceitoFinal[i][0]='B';
            }
            else{
                ConceitoFinal[i][0]='A';
            }
        }

        for(i=0;i<nlinhas;i++){
         System.out.println(ConceitoFinal[i][0]);   
        }
    }
}
