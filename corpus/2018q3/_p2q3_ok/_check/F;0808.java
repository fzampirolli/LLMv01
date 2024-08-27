
import java.util.Scanner;
public class EX3 {
    public void GeraMatriz (int Mat[][], int L, int C){
        for (int i = 0; i < L; i++){   
            for (int j = 0; j < C; j++){  
                Mat[i][j] = (int) (Math.random() +10);
        }
        }
    }
    public void  imprimeMatriz(int Mat[][]){
        for (int i = 0; i < 5; i++){   
            for (int j = 0; j < 5; j++){  
              System.out.println(Mat[i][j]);    
        }
        }
    } 
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int L = 5, C = 5;
       int ma[][] = new int [5][5];
       for (int i = 0; i < L; i++){   
            for (int j = 0; j < C; j++){  
              GeraMatriz(ma[i][j]);
        }
        }
      for (int i = 0; i < L; i++){   
            for (int j = 0; j < C; j++){  
              imprimeMatriz(ma[i][j]);
        }
        }

    }

}
