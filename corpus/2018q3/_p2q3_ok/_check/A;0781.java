
public class MatrizTransposta {

	public static void main(String[] args) {
		int n = 5;
		int[][] A = new int[n][n];

		geraMatriz(A, n, n);
		imprimeMatriz(A);
		int[][] B = matrizTransposta(A);
		int menorElemento = menorElemento(A);
	}

	public static void geraMatriz(int Mat[][], int L, int C) {
		for(int i = 0; i < L; i++) {
			for(int j = 0; j < C; j++) {
				Mat[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void imprimeMatriz(int matriz[][]) {
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(" ");
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] matrizTransposta(int[][] matriz) {
		int n = matriz.length;
		int[][] matrizTransposta = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i > j) {
					matrizTransposta[i][j] = matriz[j][i];
					matrizTransposta[j][i] = matriz[i][j];
				}else{
					matrizTransposta[i][j] = matriz[i][j];
				}
			}
		}

		return matrizTransposta;
	}

	public static int menorElemento(int[][] matriz) {
		int i = 0;
		int n = matriz.length;

		for(int j = 0; j < n; j++) {
			for(int k = 0; k < n; k++) {
				if(i > j) {
					if(matriz[i][j] < i) {
						i = matriz[i][j];
					}
				}
			}
		}

		return i;
	}
}
