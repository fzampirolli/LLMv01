
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int l, c;

    System.out.print ("Digite um número par de linhas que deseja colocar na matriz: ");
    l = entrada.nextInt();

    if (l%2!=0) {
        System.out.println ("Entrada inválida!");
        System.out.print ("Digite um número par de linhas que deseja colocar na matriz");
    }

    System.out.print ("Digite um número par de colunas que deseja colocar na matriz: ");
    c = entrada.nextInt();

    if (c%2!=0) {
        System.out.println ("Entrada inválida!");
        System.out.print ("Digite um número par de linhas que deseja colocar na matriz");
    }

    int A[][] = new int [l][c];
    int B[][] = new int [l][c];

    A = LerMatriz(l, c);
    B = CriarMatrizB (A, l, c);
    ImprimirMatriz(A, l, c);
    ImprimirMatriz(B, l, c);

    }

    public static int[][] LerMatriz (int l, int c) {
    Scanner entrada = new Scanner (System.in);
    int Matriz[][] = new int[l][c];

    System.out.println ("\nEntre com "+l*c+" valores para serem inseridos em uma matriz "+l+"x"+c);
	for (int i=0; i<l; i++)
	for (int j=0; j<c; j++){
		System.out.print ("\nEntre com o valor do elemento ["+i+"]["+j+"]: ");
		Matriz[i][j] = entrada.nextInt();
    }

    return Matriz;
    }

    public static int[][] CriarMatrizB (int Matr1[][], int l, int c) {
        int Matr2[][] = new int [l][c];

        for (int i=0; i<(l/2); i++) {
            for (int j=0; j<(c/2); j++) {
                if (Matr1[i][j] > Matr1[i+1][j]) {
                    Matr2[i][j] = Matr1[i][j];
                }
            }
        }

        for (int i=0; i>=(l/2); i++) {
                for (int j=0; j>=(c/2); j++) {
                    Matr2[i][j] = 0;
                }
            }

                return Matr2;
    }

    public static void ImprimirMatriz (int Matriz[][], int l, int c) {
        System.out.print ("\nA matriz foi preenchida com sucesso e seus valores são: ");
	for (int i=0; i<l; i++){
	System.out.print ("\n");
	for (int j=0; j<c; j++)
	System.out.print (Matriz[i][j]+" ");}
    }

}