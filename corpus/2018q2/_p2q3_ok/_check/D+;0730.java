
public class Questao3 {

    public static void main(String[] args) {
        char matCONCEITOS [][] = new char[150][4]; 
        GeraMatriz (matCONCEITOS, 150, 4);

    }

static void GeraMatriz (char Mat [][], int nlinhas, int ncolunas){
    char conceitos [] = {'A', 'B', 'C', 'D', 'F'};
    int i, j, valor; 
    for (i=0; i<nlinhas;i++ ){
        for (j=0; j<ncolunas;j++ ){
            valor = (int)(Math.random ()*5); 
            Mat [i][j] = conceitos [valor]; 
            System.out.print (" "+ Mat[i][j]); 

        }
        System.out.println (""); 

    }

}

static float [] GeraMedia (char Mat [][], int nlinhas, int ncolunas){

    GeraMatriz(char matCONCEITOS, 150, 4);
    double Valor [][] = new double [nlinhas][ncolunas];
    for (int i=0; i<nlinhas;i++ ){
        for (int j=0; j<ncolunas;j++ ){
            if (Mat[i][j]== 'A'){
            Valor[i][j]= 4.0; 
            } 
            else if (Mat[i][j]== 'B'){
                Valor[i][j]= 3.0; 
            } 
            else if (Mat[i][j]== 'C'){
                Valor[i][j]= 2.0; 
            } 
            else if (Mat[i][j]== 'D'){
                Valor[i][j]= 1.0; 
            } 
            else if (Mat[i][j]== 'B'){
                Valor[i][j]= 0.0; 
            } 

-            
        }

        }
        }

}

}