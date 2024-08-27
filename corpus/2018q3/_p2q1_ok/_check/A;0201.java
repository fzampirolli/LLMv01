
import java.util.Scanner;

public class provaQ1{
	public static void main(){

		Scanner scan = new Scanner(System.in);
		int i, n, aux, j;

		System.out.println("Digite o número (ímpar) de elementos do vetor:\t");
		n = scan.nextInt();

		int[] V = new int[n];

		for(i = 0; i < n; i++){
			System.out.printf("Insira o %dº valor:\t", i + 1);
			V[i] = scan.nextInt();

			System.out.println();
		}

		System.out.print("V = [");
		for(i = 0; i < n; i++){
			System.out.print(V[i]);
			if(i < n - 1) System.out.print(", ");
		}
		System.out.print("]\n");

		if(n > 1) for(i = 0; i < n / 2; i++){
			j = n - i - 1;
			if(V[i] < V[j]){
				aux = V[i];
				V[i] = V[j];
				V[j] = aux;
			}
		}

		System.out.print("V = [");
		for(i = 0; i < n; i++){
			System.out.print(V[i]);
			if(i < n - 1) System.out.print(", ");
		}
		System.out.print("]\n");
	}
}