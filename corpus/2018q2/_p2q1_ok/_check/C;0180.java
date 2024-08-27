
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {

		final int MAX = 50;
		int V[] = new int [MAX];
		System.out.println("Preencher vetor: ");
		for (int i = 0; i < MAX; i++) {
			V[i] = (int)(Math.random()*72-21);
		}

		System.out.println("\nVetor = ");
		for (int i = 0; i < MAX; i++) {
			System.out.print(V[i] + " ");
		}

		int cont12 = 0;
		for (int i = 0; i < MAX; i++) {
			if (V[i] > V[12]) {
				cont12++;
			}
		}
		System.out.println("\nV[12] = " + V[12] + "\nQuantidade de elementos maior do que V[12]: " + cont12);

		Scanner input = new Scanner(System.in);
		System.out.println("Procure um n�mero inteiro: ");
		int k = input.nextInt();

	}

}
