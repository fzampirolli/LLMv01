import java.util.Scanner;

public class VetorSemiparticionado {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Insira a capacidade do vetor: ");
		int n = scanner.nextInt();

		int[] V = new int[n];
		obterVetor(V, n);
		semiparticionarVetor(V, n);
		imprimirVetor(V, n);

		scanner.close();
	}

	public static int[] obterVetor(int[] vetor, int indice) {
		for(int i = 0; i < indice; i++) {
			System.out.println("Insira o valor " + i + " do vetor:");
			vetor[i] = scanner.nextInt();
		}
		return vetor;
	}

	public static void semiparticionarVetor(int[] vetor, int indice) {
		for(int i = 0; i < indice / 2; i++) {
			if(vetor[i] > vetor[indice - (i + 1)]) {
				int valor = vetor[i];
				vetor[i] = vetor[indice - (i + 1)];
				vetor[indice - (i + 1)] = valor;
			}
		}
	}

	public static void imprimirVetor(int[] vetor, int indice) {
		System.out.print("Vetor V=[ ");
		for(int i = 0; i < indice; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}
}
