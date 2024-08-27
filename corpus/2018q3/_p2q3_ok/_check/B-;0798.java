
public class Questao03 {

    public static void main(String[] args) {

        int A[][] = new int [21][21];
        int a =21;
        int b = 21;

        GeraMatriz(A,a,b);
        imprimeMatriz(A);
        System.out.print(menorelemento(A));
    }

    public static void GeraMatriz (int Mat[][], int L, int C){
        for(int i=0; i<L; i++){
            for(int j=0; j<C; j++){
                Mat[i][j]= (int)(Math.random() * 10);
            }
        }

    }

    public static void imprimeMatriz(int m[][]){
        for (int i=0; i< 21; i++){
            for(int j=0; j<21; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int menorelemento(int mat[][]){
        int soma=0;
        int menor = mat[1][0];
        for (int i=0; i< 21; i++){
            for(int j=0; j<21; j++){
                if(i>j){
                    if(mat[i][j]<menor){
                        menor = mat[i][j];
                    }
                }
            }
        }
        return menor;
    }
}
