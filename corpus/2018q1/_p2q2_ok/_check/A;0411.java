import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args){

		int constante_tamanho_vetor = 2;
		String[] vetorNome = new String[constante_tamanho_vetor];
		String[] vetorDestino = new String[constante_tamanho_vetor];
		Scanner scanner = new Scanner(System.in);
		String nomeDestino = "";
		String nomePassageiro = "";

		vetorNome = preencheVetor(constante_tamanho_vetor, scanner, " Nome. ");
		vetorDestino = preencheVetor(constante_tamanho_vetor, scanner, " Destino. ");

		System.out.println("Informe o nome do destino: ");
		nomeDestino = scanner.nextLine();
		nomePassageiro = pesquisaNome(vetorDestino, vetorNome, nomeDestino, constante_tamanho_vetor);

		if(nomePassageiro.equals(" ")){
			System.out.println("Destino nao existe.");

		}
		else{
			System.out.println("O nome do passageiro que ira ao destino: " + nomeDestino + " e: " + nomePassageiro);
		}

	}

	public static String[] preencheVetor(int tamanho_vetor, Scanner scanner, String mensagem_entrada){

		String[] vetor_retorno = new String[tamanho_vetor];

		for(int i=0; i < tamanho_vetor; i++){

			System.out.println("Digite a palavra para a posicao: " + "[ " + i +  " ] " + " do vetor " + mensagem_entrada);
			vetor_retorno[i] = scanner.nextLine();

		}

		return vetor_retorno;

	}

	public static String pesquisaNome(String[] vetorDestino, String[] vetorNome, String destino_k, int tamanho_vetor){

		String passageiro_k = " ";

		for (int i=0; i < tamanho_vetor; i++){

			if(vetorDestino[i].equalsIgnoreCase(destino_k)){

				passageiro_k = vetorNome[i];

			}

		}

		return passageiro_k;

	}

}
