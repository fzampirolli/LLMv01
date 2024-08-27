import java.util.Scanner;

public class Questao1 {
	public static void main (String[] args) {

		final int MAX = 50;
		int V[] = new int [MAX];
		int soma = 0, k, i = 0;

		Scanner entrada = new Scanner (System.in);

		System.out.println("Preencher vetor: ");
		for (i = 0; i < MAX; i ++) {
			V[i] = (int)(Math.random()*72-21);	   
			System.out.println(V[i] + "");

		}
		for (i = 0; i < MAX; i ++) {
			System.out.println("Digite o elemento de �ndice 9: "); 
			System.out.println(V[8] + "");  
		}
		for (i = 0; i < V[8]; i ++) {   
	        soma = soma + V[i];  
	        System.out.println("A quantidade de n�meros maiores do que o elemento de �ndice 9 �:" + soma);
		}

		System.out.println("Digite um n�mero:");
		k = entrada.nextInt();

		if (k == i){   
		System.out.println(V[i] + "");
		System.out.println("k ocorreu na posi��o " + V[i]);  
	} else {
		System.out.println("k n�o foi encontrado no vetor"); 
	}

		}
	}    
