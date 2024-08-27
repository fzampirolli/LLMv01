
import java.util.Scanner;

public class Questao1 {

	static int n, a = 0, k = 40; 
	static boolean teste = false;
	static int v[] = new int[n];

	static Scanner scanner = new Scanner(System.in);

	public static boolean testaVetor(int v[], int n, int k) {

		while (a < n) {
			if (v[a] == k) {
				a++;
				teste = true;
			} else {
				a++;
			}
		}
		return teste;
	}

	public static void main(String[] args) {

		System.out.println("Digite o tamanho do vetor: ");
		n = scanner.nextInt();

		System.out.println("Digite os valores, um a um: ");
		a = scanner.nextInt();
		a++;

		while (a < (v.length)) {
			v[a] = scanner.nextInt();
			a++;
		}

		a = 0;

		testaVetor(v, n, k);

		if (testaVetor(v, n, k) == true) {
			System.out.println("Existe número igual a 40 nesse vetor.");
		} else {
			System.out.println("Não existe número igual a 40 nesse vetor.");
		}

	}

}
