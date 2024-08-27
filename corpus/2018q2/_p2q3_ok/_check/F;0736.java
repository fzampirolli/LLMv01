
public class Questao3i {

        static void GeraMat(char Mat[][], int nlinhas, int ncolunas){
            char conceitos [] = {'A', 'B','C', 'D', 'F'};
            int i,j, valor;
            for(i=0; i<150; i++){
                for(j=0; j<4; j++){
                    valor= (int)(Math.random()*5);
                    Mat[i][j]= conceitos[valor];
                }

        }

    }

}
