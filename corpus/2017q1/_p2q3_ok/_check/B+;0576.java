
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("NÚMERO DE LINHAS DA MATRIZ A: ");
        int i = scn.nextInt();
        System.out.print("NÚMERO DE COLUNAS DA MATRIZ A: ");
        int j = scn.nextInt();
        int MatrizA[][] = new int[i][j];
        int MatrizB[][] = new int[i][j];
        Modulo1(MatrizA);
        System.out.print("ESSA É A MATRIZ SEM ALTERAÇÕES \n");
        Modulo3(MatrizA);
        Modulo2(MatrizA);
        MatrizB = Modulo2(MatrizA);
        System.out.print("ESSA É A MATRIZ ALTERADA \n");
        Modulo3(MatrizB);

    }

    public static int[][] Modulo1(int Matriz[][]) {
        Scanner scn = new Scanner(System.in);
        int i = Matriz.length;
        int j = Matriz[0].length;
        for (int l = 0; l < i; l++) {
            for (int c = 0; c < j; c++) {
                System.out.print("Digite o elemento da linha " + l + " e da coluna " + c + ": ");
                Matriz[l][c] = scn.nextInt();
            }
        }
        return Matriz;
    }

    public static int[][] Modulo2(int Matriz[][]) {
        Scanner scn = new Scanner(System.in);
        int i = Matriz.length;
        int j = Matriz[0].length;

        for (int l = 0; l < i; l++) {
            if (l >= i / 2) {
                for (int c = 0; c < j; c++) {
                    Matriz[l][c] = 0;
                }
            } else {
                for (int c = 0; c < j / 2; c++) {
                    Matriz[l][c] = 0;
                }
            }

        }

        return Matriz;
    }

    public static void Modulo3(int Matriz[][]) {
        Scanner scn = new Scanner(System.in);
        int i = Matriz.length;
        int j = Matriz[0].length;
        for (int l = 0; l < i; l++) {
            System.out.print("\n");
            for (int c = 0; c < j; c++) {
                System.out.print(Matriz[l][c]);
            }
        }
        System.out.print("\n");
    }
}
