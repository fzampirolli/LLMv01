
import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {
      int matCONCEITOS [][]= new int[150][4];
      GeraMaat(A, 2, 3);
    }

      static int GeraMaat(char Mat[][], int nlinhas, int ncolunas) {
          char conceitos []= {'A', 'B', 'C', 'D', 'F'};
          int i, j, valor;
          for (i=0; i<nlinhas; i++){
              for (j=0; j<ncolunas; j++){
                  valor= (int)(Math.random()*5);
                  Mat [i][j]=conceitos [valor];
              }

        return Mat [i][j];
      }
        return 0;
      }
    private static void GeraMedia() {
    double vetor []= new double [4];
     vetor[0]=4.0;   
     vetor[1]=3.0;
     vetor[2]=2.0;
     vetor[1]=1.0;
     vetor[3]=0.0;
     Scanner entra = new Scanner (System.in);
     System.out.println(" insira as notas do alunos: ");
     double p1= entra.nextInt();
     double atividades= entra.nextInt();
     double projeto= entra.nextInt();
     double p2= entra.nextInt();
     double media = ((p1*34)+(atividades*10)+(projeto*15)*(p2*41))/100;
     System.out.println(""+ media);

    }

    private static boolean ImprimeConceitoFinal( double media) {
        if (media<0.8){
            System.out.println(" conceito final = F");
        } else if (media<1.5){
            System.out.println(" conceito final = D ");
        } else if (media<2.5){
            System.out.println (" conceito final= C ");
        } else if (media < 3.6){
            System.out.println (" conceito final= B ");
        } else {
            System.out.println (" conceito final= A ");
        }
        return true;

    }

    }
