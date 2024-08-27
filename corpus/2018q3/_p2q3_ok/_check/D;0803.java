
public class provaQ3{
	public static void main(){

		int l = 21, c = 21;
		int[] A = new int[l][c];
		GeraMatriz(A, l, c);

		System.out.println("A = [");
		imprimeMatriz(A);
		System.out.println("]");

		B = matrizTransposta(A);

		System.out.println("B = [");
		imprimeMatriz(B);
		System.out.println("]");

		int maior = maiorNoTriInferior(A);
		System.out.printf("O maior número no triângulo inferior de 'A' (ou triângulo superior de 'B') é %s", maior);
	}
	static void GeraMatriz(int Mat[][], int L, int C){
		for(int i = 0, j; i < L; i++){
			for(j = 0; j < C; j++){
				Mat[i][j] = (int) (Math.random() * 10);
			}
		}
	}
	static void imprimeMatriz(int A[][]){
		int l = A.length, c = A[0].length, i, j;

		for(i = 0; i < l; i++){
			for(j = 0; j < c; j++) System.out.printf("\t%d", A[i][j]);
			System.out.println();
		}
	}
	static int[] matrizTransposta(int A[][]){
		int l = A.length, c = A[0].length, i, j, aux;
		int[] ret = new int[c][l];

		for(i = 0; i < l; i++){
			for(j = 0; j < c; j++){
				B[j][i] = A[i][j];
			}
		}

		return ret;
	}
	static int maiorNoTriInferior(int A[][]){
		int l = A.length, c = A[0].length, i, j, maior = 0;

		for(i = 0; i < l; i++){
			for(j = 0; j < i; j++){
				if(A[i][j] > maior) maior = A[i][j];
			}
		}

		return maior;
	}
}
