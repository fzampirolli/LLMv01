
import java.util.Scanner;
public class modulos {

    public static void main(String[] args) {
        int [][] Matriz_A = new int [25][25];
        Matriz_A = GeraMatriz(Mat,L,C);

    }

    static void GeraMatriz (int Mat [][], int L, int C)
    {
        for (int i =0; i < L; i++)
            for (int j=0; j < C; j++)
                Mat [i]][j]= (int) (Math.random()*10);
    }
  }
}
