import java.util.Scanner;

public class TabuleiroXadrez {

	private static Scanner scanner = new Scanner(System.in);

	private static int brancas = 0, pretas = 0;

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int[][] A = new int[n][n];

		lerMatriz(A, n);
		lerCasasMatriz(A, n);

		System.out.print(brancas + " " + pretas + " ");
		if(brancas > pretas) {
			System.out.println("0");
		}else if(brancas < pretas) {
			System.out.println("1");
		}else{
			System.out.println("2");
		}

		scanner.close();
	}

	public static void lerMatriz(int[][] matriz, int indice) {
		for(int i = 0; i < indice; i++) {
			for(int j = 0; j < indice; j++) {
				matriz[i][j] = scanner.nextInt();
			}
 		}
	}

	public static void lerCasasMatriz(int[][] matriz, int indice) {
		brancas = 0;
		pretas = 0;
		for(int i = 0; i < indice; i += 2) {
			for(int j = 0; j < indice; j += 2) {
				brancas += matriz[i][j];
			}
			for(int j = 1; j < indice; j +=2) {
				pretas += matriz[i][j];
			}
		}
		for(int i = 1; i < indice; i += 2) {
			for(int j = 1; j < indice; j += 2) {
				brancas += matriz[i][j];
			}
			for(int j = 0; j < indice; j += 2) {
				pretas += matriz[i][j];
			}
		}
	}
}
