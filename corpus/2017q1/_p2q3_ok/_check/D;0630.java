
import java.util.Scanner; 

public class Q3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);        
        int L, C, i, j; 

        System.out.print("Digite um valor par de linhas: ");
        L = entrada.nextInt();

        System.out.print ("Digite um valor par de colunas: ");
        C = entrada.nextInt(); 

        LerMatriz(L,C);
        ImprimeMatrizQualquer(L,C);

    }

        public static void LerMatriz (int lin, int col) {
        Scanner entrada = new Scanner (System.in);

        int matrizA[][] = new int [lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Digite o valor para a posição " + i + "x" + j + " da matriz: ");
                matrizA[i][j] = entrada.nextInt(); 
            }
        }

    }

        public static void ImprimeMatrizQualquer (int lin, int col) {

            int matrizA[][] = new int [lin][col];

                for (int i = 0; i < lin; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(matrizA[i][j] + " ");
                    }
                        System.out.println();  
                }    

    }

}
