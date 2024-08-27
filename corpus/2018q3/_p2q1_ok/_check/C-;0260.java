import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int tamanho; int n = 2; int x = 1; int i; int aux;

		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um tamanho para o vetor, sendo ele ímpar e positivo");
			tamanho = sc.nextInt();
			int V[]= new int [tamanho];

		for(i = 0; i<tamanho; i++) {
			System.out.println("Digite um valor para a" +i+" casa");
			V[i] = sc.nextInt();
		}
			while (x < (tamanho-n)) {
				int aux = 0;
			}
				if (V[x]>V[tamanho-n]) {
					aux = V[x];
					V[x] = V[tamanho-n];
					V[tamanho-n] = aux;

				}
							x = x+2;
							n = n+2;
}
	System.out.println("[");
	 	for (int i = 0; i< tamanho; i++) {
		 System.out.println(V[i]);
		  }
	 System.out.println("}");
}
}
