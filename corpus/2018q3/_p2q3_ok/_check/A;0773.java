
public class ex3 {

    static void GeraMatriz(int Mat[][], int L, int C){
        for(int i = 0;i< L;i++){
            for(int j = 0; j<C;j++){
                Mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    static void imprimeMatriz(int m[][], int l, int c){
        for(int i = 0;i< l;i++){
            for(int j = 0; j<c;j++){
                System.out.printf(m[i][j]+" ");
            }
            System.out.printf("\n");
        }
    }

    static int[][] matrizTranposta(int m[][], int l, int c){
        int[][] aux = new int[l][c];
        for(int i = 0;i< l;i++){
            for(int j = 0; j<c;j++){
                if(i>j){
                    aux[j][i] = m[i][j];
                    aux[i][j] = m[j][i];
                }else{
                    aux[i][j] =  m[i][j];
                    aux[j][i] = m[j][i];
                }
            }
        }

        return aux;
    }

    static int media(int m[][],int l, int c){
        int cont=0,soma=0;
        for(int i = 0;i< l;i++){
            for(int j = 0; j<c;j++){
                if(i>j){
                    cont++;
                    soma += m[i][j];
                }
            }
        }
        if(cont!=0){
            return (int)(soma/cont);    
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {

        int[][] m = new int[23][23];

        GeraMatriz(m,23,23);
        imprimeMatriz(m,23,23);
        System.out.printf("\n");
        imprimeMatriz( matrizTranposta(m,23,23),23,23);
        System.out.printf(media(m,23,23)+"\n");
    }

}
