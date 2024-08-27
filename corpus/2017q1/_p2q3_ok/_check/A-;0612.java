
import java.util.Scanner;
public class ex3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int L = 0, C= 0, linha =0, coluna =0, maior=0;
        System.out.println("Entre com o número par de linhas L da matriz: ");
        L = entrada.nextInt();
        while (L%2 > 0){
            System.out.println("Digite um numero par de linhas: ");
            L = entrada.nextInt();
        }
        System.out.println("Entre com o número de colunas C da matriz: ");
        C = entrada.nextInt();
        int A[][] = new int[L][C];
        int B[][] = new int[L][C];

        for (linha =0; linha<L; linha++){
            for(coluna = 0; coluna<C; coluna++){
                System.out.println("Entre com o valor da linha"+ linha + " da coluna " + coluna + " da matriz: " );
                A[linha][coluna] = entrada.nextInt();
            }
        }
        for (linha=(L/2); linha<L; linha++){
            for(coluna=C/2; coluna<C; coluna++){
                if (A[linha][coluna] > maior){
                    maior = A[linha][coluna];
                }
            }
        }

        for (linha=(L/2); linha<L; linha++){
            for(coluna=C/2; coluna<C; coluna++){
                B[linha][coluna] = maior;
            }
        }
        System.out.println("Matriz A: ");
        imprimeMatriz(A, L, C);
        System.out.println("Matriz B: ");
        imprimeMatriz(B, L, C);

    }

    public static void imprimeMatriz(int vet1[][], int linha, int coluna){
        int x=0, y =0;
        for (x=0; x<linha; x++){
            for (y=0; y<coluna; y++){
                System.out.print(vet1[x][y]);
            }
            System.out.println(" ");
        }

    }

}
