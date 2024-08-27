
public class Questao3 {
    public static void main(String[] args) {
        int l=27,c=27;
        int A[][]=new int [l][c];
        int B[][]=new int[c][c];
        GeraMatriz(A,l,c);
        imprimeMatriz(A,l,c);
        matrizTransposta(A,l,c);
        MenorElemento(A,l,c);

    }
    static void GeraMatriz (int Mat[][], int L, int C){
        for (int i=0;i<L;i++){
            for(int j=0;j<C;j++){
                Mat[i][j]=(int) (Math.random()*10);
            }
        }
    }
    static void imprimeMatriz (int Mat[][],int l,int c){
        for (int i=0;i<l;i++){
            System.out.println();
            for (int j=0;j<c;j++){
                System.out.print(Mat[i][j]+ " ");
            } 
        }
    }
    static void matrizTransposta (int Mat[][],int l, int c){
        int i,j;
        for (i=0;i<l;i++){
            for (j=0;j<c;j++){
                if(j>i){
                    int aux = Mat[i][j];
                    Mat[i][j]=Mat[j][i];
                    Mat[j][i]=aux;
                }
            }
        }
    }
    static int MenorElemento (int Mat[][], int l, int c){
        int menor=Mat[0][0];
        for (int i=0;i<l;i++){
            for (int j=0;j<l;j++){
                if(i>j && Mat[i][j]<menor){
                    menor=Mat[i][j];
                }
            }
        }
        return menor;
    }
}
