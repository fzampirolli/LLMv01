import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int l = 0, c = 0;
        boolean validade = true ;

        do{
            System.out.print("Digite o número par de linhas: ");
            l = scan.nextInt();
            System.out.print("Digite o número par de colunas: ");
            c = scan.nextInt();
            if(l%2==0 && c%2==0){
                validade = false;
            }
        }while(validade);

        int m1[][] = new int[l][c];
        int m2[][] = new int[l][c];
        LerMatriz(m1, l, c);
        NovaMatriz(m2);
        ImprimirMatriz(m1);

    }    

    public static int[][] LerMatriz(int m[][], int L, int C) {
        for (int i = 0; i < m.length; i++) 
            for (int j = 0; j < m[0].length; j++) {
		System.out.println("Digite a posição ["+i+"] ["+j+"] da matriz");
                m[i][j] = new java.util.Scanner(System.in).nextInt();
            }            
        return m;
    }

    public static void NovaMatriz(int m[][]){
        for (int i = 0; i < m.length/2; i++) 
            for (int j = 0; j < m[0].length/2; j++){

            }
    }

    public static void ImprimirMatriz(int m[][]){
        for(int i = 0; i < m.length; i++){
            System.out.println();
            for (int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]);
            }
        }
    }

}
