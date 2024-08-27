
public class Questao3 {

    public static void main(String[] args){
        int matconceitos[][] = new int [150][4];

        System.out.print("xxxx ");
    }

    static void GeraMat(char mat[][], int nlinhas, int ncolunas){
        char conceitos[] = {'A', 'B', 'C', 'D','F'}; 
        int i, j, valor;
        for (i=0; i<nlinhas; i++){
           for (j=0; j<ncolunas; j++){
               valor = (int)(Math.random()*5);
               mat[i][j] = conceitos[valor];
           }

        }
    }
    static double GeraMedia(double [][]media){
        int soma, med;

        for (i=0; i<nlinhas; i++){
           for (j=0; j<ncolunas; j++){
               med = (conceitos[valor])/4

        return med;
    }
}
