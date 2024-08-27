import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int constante_tamanho_vetor = scanner.nextInt();
		int[] vetor = new int[constante_tamanho_vetor];

	    for(int i=0; i < constante_tamanho_vetor; i++){

			System.out.println("Digite o valor do vetor na posição: " + "[ " + i + " ]");
			vetor[i] = scanner.nextInt();

		}

	    int[][] matriz = criaMatriz(scanner, vetor, constante_tamanho_vetor);
	    imprimeMatriz(matriz, constante_tamanho_vetor);
	    double media = calculaMedia(matriz, constante_tamanho_vetor);
	    System.out.println("A média aritmetica entre os valores impares da matriz é: " + media);

	}

	public static int[][] criaMatriz(Scanner scanner, int[] vetor, int tamanho_vetor){

		int[][] matriz = new int[tamanho_vetor][tamanho_vetor];

		for (int i=0; i< tamanho_vetor; i++){
			for(int j=0; j < tamanho_vetor; j++){

				if(i != j){

				   System.out.println("Informe o valor para a posição: " + " [ "+ i + " ] " + " [ " +  j + " ] ");
				   matriz[i][j] = scanner.nextInt();

				}
				else{

					matriz[i][j] = vetor[i];
				}

			}

		}

		return matriz;	

	}

	public static void imprimeMatriz(int[][] matriz, int tamanho){

		System.out.println("A matriz criada foi: ");

		for(int i=0; i< tamanho; i++){
			for(int j=0; j <tamanho; j++){
				System.out.println(matriz[i][j] + " ");

			}

		}

	}

	public static double calculaMedia(int[][] matriz, int tamanho){

		double media = 0;
		int quantidadeImpares = 0;
		int somatoria = 0;

		for (int i=0; i< tamanho; i++){
			for(int j=0; j < tamanho; j++){

				if(matriz[i][j] % 2 != 0){

				   somatoria += matriz[i][j];
				   quantidadeImpares++;

				}

			}

		}

		media = somatoria/quantidadeImpares;

		return media;
	}

}
