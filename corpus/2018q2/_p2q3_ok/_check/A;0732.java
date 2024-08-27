
import java.util.*;

public class Prova3 {

    public static void main(String[] args) {
    char x [][]= new char [150][4];
        int i,j;
        GeraMat ( x , 150 , 4);
        double conc [][]= new double [150][1];

            Média(x,conc);
            Imprime(conc);

    }
    public static void GeraMat (char mat [][], int nlinhas, int ncolunas){
    char conceitos[]= {'A','B','C','D','F'};
    int i,j,valor;
    for (i=0;i<nlinhas;i++){

       for (j=0;j<ncolunas;j++){

           valor= (int)(Math.random()*5);
           mat[i][j]=conceitos[valor];
       }
    }}

    public static void Média(char x [][], double conceitos [][]){
    int i,j;

        for (i=0;i<150;i++){
            conceitos [i][0] = 0;

        for (j=0;j<4;j++){

            if (j==0){

            if (x[i][j]=='A'){

            conceitos[i][0] = conceitos[i][0] + 4*0.31;

         } else if (x[i][j]=='B'){

             conceitos [i][0] = conceitos [i][0] + 3*0.31;

             } else if (x[i][j]=='C'){

                 conceitos [i][0] = conceitos [i][0] + 2*0.31;

             }  else if(x[i][j]=='D')
                     {

                conceitos [i][0] = conceitos [i][0] + 1*0.31;
            }
            }
                     if (j==1){

            if (x[i][j]=='A'){

            conceitos[i][0] = conceitos[i][0] + 4*0.1;

         } else if (x[i][j]=='B'){

             conceitos [i][0] = conceitos [i][0] + 3*0.1;

             } else if (x[i][j]=='C'){

                 conceitos [i][0] = conceitos [i][0] + 2*0.1;

             }  else if(x[i][j]=='D'){

                conceitos[i][0] = conceitos[i][0] + 1*0.1;
            }        

    }if (j==2){

            if (x[i][j]=='A'){

            conceitos[i][0] = conceitos[i][0] + 4*0.15;

         } else if (x[i][j]=='B'){

             conceitos [i][0] = conceitos [i][0] + 3*0.15;

             } else if (x[i][j]=='C'){

                 conceitos [i][0] = conceitos [i][0] + 2*0.15;

             }  else if(x[i][j]=='D'){

                conceitos[i][0] = conceitos[i][0] + 1*0.15;
            }        

    }if (j==3){

            if (x[i][j]=='A'){

            conceitos[i][0] = conceitos[i][0] + 4*0.44;

         } else if (x[i][j]=='B'){

             conceitos [i][0] = conceitos [i][0] + 3*0.44;

             } else if (x[i][j]=='C'){

                 conceitos [i][0] = conceitos [i][0] + 2*0.44;

             }  else if(x[i][j]=='D'){

                conceitos[i][0] = conceitos[i][0] + 1*0.44;
            }        

                    }
                 }
        }
    }

    public static void Imprime(double conceitos [][]) {
        int i;
        int a=1;

        for (i=0;i<150;i++){
        if (conceitos[i][0]>3.6){

        System.out.println("aluno " + a + "Conceito A" );
        }
        else if (conceitos[i][0]>2.5){

        System.out.println("aluno " + a + "Conceito B" );
        }
        else if (conceitos[i][0]>1.5){

        System.out.println("aluno " + a + "Conceito C" );

        }else if (conceitos[i][0]>0.8){

        System.out.println("aluno " + a + "Conceito D" );
        } else {

        System.out.println("Aluno " + a + " Conceito F");}

        a++;
        }

    }}
