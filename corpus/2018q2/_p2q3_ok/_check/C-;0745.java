
public class Questao3 {
    public static void main(String[] args) {

        char matriz[][]=new char [150][4];
        float V[]=new float[150];
        GeraMat(matriz,150,4);
                for(int i=0;i<150;i++){
            for(int j=0;j<4;j++){
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
        GeraMedia(matriz,150,4);

    }

    public static void GeraMat(char Mat[][], int nlinhas, int ncolunas){
        char conceitos []={'A','B','C','D','F'};
        int i,j,valor;
        for(i=0;i<nlinhas;i++){
            for(j=0;j<ncolunas;j++){
                valor=(int)(Math.random()*5);
                Mat[i][j]=conceitos[valor];
            }
        }
    }

    public static void GeraMedia(char M[][], int nlinhas, int ncolunas){
        float v[]=new float [ncolunas];
        int ma[][]=new int[150][4];
        for(int i=0;i<nlinhas;i++){
            for(int j=0;j<ncolunas;j++){
                if("A".equals(M[i][j])){
                    ma[i][j]=4;
                }
                else{
                    if("B".equals(M[i][j])){
                    ma[i][j]=3;
                }
                    else{
                        if("C".equals(M[i][j])){
                    ma[i][j]=2;
                    }
                        else{
                            if("D".equals(M[i][j])){
                    ma[i][j]=1;
                        }
                            else{
                                if("F".equals(M[i][j])){
                                ma[i][j]=0;
                                }
                            }
                        }
                    }
                }
                                for( i=0;i<150;i++){
            for(j=0;j<4;j++){
                System.out.print(" "+ma[i][j]);
            }
            System.out.println(" ");
        }

                for( j=0;j<150;j++){
                v[j]=((M[i][0]*34/100)+(M[i][1]*10/100)+(M[i][2]*15/100)+(M[i][3]*41/100))/100;

                    }
                }
                        for(i=0;i<150;i++){
                                    System.out.print(" "+v[i]);
                        }
            }
    }
}
