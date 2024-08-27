
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Quantidade par de linhas (deve ser par): ");
        int l = ent.nextInt();
        while(l%2 != 0){
            System.out.println("Quantidade de linhas deve ser par!");
            System.out.print("Informe a quantidade de linhas (deve ser par): ");
            l = ent.nextInt();        
        }

        System.out.print("Quantidade par de colunas (deve ser par): ");
        int c = ent.nextInt();
        while(c%2 != 0){
            System.out.println("Quantidade de colunas deve ser par!");
            System.out.print("Informe a quantidade de colunas (deve ser par): ");
            c = ent.nextInt();        
        }
        System.out.println();

        int A[][] = new int [l][c];
        int B[][] = new int [l][c];

        System.out.println("Informe os elementos da matriz A");
        leMatriz(A, l, c);
        System.out.println();

        novaMatriz(A, B, l, c);

        System.out.println("Matriz A:");
        escreveMatriz(A, l, c);
        System.out.println();

        System.out.println("Matriz B:");
        escreveMatriz(B, l, c);
        System.out.println();
    }

    public static void leMatriz(int mat[][], int l, int c){
        Scanner ent = new Scanner(System.in);
        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                System.out.print("Informe o elemento da linha " +i+ " e da coluna " +j+ ": ");
                mat[i][j] = ent.nextInt();
            }
        }
    }

    public static void escreveMatriz(int mat[][], int l, int c){
        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void novaMatriz(int mat1[][], int mat2[][], int l, int c){

        int maior = 0;

        for(int i=0; i<l/2; i++){
            for(int j=c/2; j<c; j++){
                if(maior < mat1[i][j]) maior = mat1[i][j];
            }
        }

        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                if(i>=l/2)mat2[i][j] = 0;
                else if(j<c/2)mat2[i][j] = 0;
                else mat2[i][j] = maior;
            }
        }
    }
}
