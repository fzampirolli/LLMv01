
import java.util.Scanner;
public class 3 {
        int A[][]= new int [27][27];
        static void GeraMatriz (int Mat[][], int L, int C){
            for(int i=0; i<L; i++){
                for(int j=0;j<C; j++){
                    Mat [i][j] = (int) (Math.random()* 10); 
                }
            }
        }      
        static void imprimeMatriz(A)(int Mat[][], int i, int j){
        for(i=0;i<=26;i++){
            for(j=0;j<=26;j++){
                 System.out.println(""+ A[i][j]+"");
            }
     }
}
        static void B= matrizTransposta (int Mat[][], int i, int j){
        for(i=0;i<=27-1;i++){
            for(j=0;j<=27-1;j++){
              System.out.println(""+ A[i][j]+"");
            }
     }
}         
                static void MenorElemento (int Mat[][], int i, int j){
        for(i=0;i<=27-1;i++){
            for(j=0;j<=27-1;j++){
              System.out.println(""+ A[i][j]+"");
            }
     }
}  