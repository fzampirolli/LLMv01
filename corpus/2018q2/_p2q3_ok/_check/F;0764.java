
public class questao3 {

    public static void GeraMat (char Mat[][], int nlinhas, int ncolunas){
        char conceitos[]={'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;
        for (i=0; i<nlinhas; i++){
            for (j=0; j<ncolunas; j++){
                valor=(int) (Math.random()*5);
                Mat[i][j]=conceitos[valor];
            }
        }

    }

}
