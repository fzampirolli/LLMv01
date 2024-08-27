import java.util.Scanner;

public class questaodois {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Scanner leitor_texto = new Scanner(System.in);

		int opcao = 10;

		String vetorNome[] = new String[35];
		String vetorAcento[] = new String[35];

		int QNTD_PASSAGEIROS = 0;

		while(opcao != 0){
			System.out.println(" =============  MENU  ============= ");
			System.out.println(" 1 - Cadastro de Passageiro  ");
			System.out.println(" 2 - Pesquisa de Passageiro  ");
			System.out.println(" 0 - Sair  ");

			opcao =  leitor.nextInt();

			if( opcao == 1 ){

				System.out.println("Por favor Insira o nome do passageiro");
				vetorNome[QNTD_PASSAGEIROS] = leitor_texto.nextLine();
				System.out.println("Por favor Insira o Acento do passageiro");
				vetorAcento[QNTD_PASSAGEIROS] = leitor_texto.nextLine();
				QNTD_PASSAGEIROS++;

				System.out.println(" =============  Cadastrado com Sucesso!  ============= ");

			} else if (opcao == 2){

				System.out.println("Por favor insira o acento do passageiro buscado:");
				String ACENTO_BUSCADO = leitor_texto.nextLine();
				String retorno = pesquisarNome(vetorNome,vetorAcento,ACENTO_BUSCADO);

				System.out.println(retorno);

				System.out.println(" ============= Busca concluída com Sucesso!  ============= ");

			} else if( opcao == 0) {
				System.out.println(" ============= PROGRAMA FECHADO COM SUCESSO  ============= ");
			} else {
				System.out.println(" =============  Por favor selecione uma opcao válida  ============= ");
			}

		}
	}

	public static String pesquisarNome(String Nomes[], String Acentos[], String acento){
		String resultadoBusca = "Acento não existe";
		for(int i = 0; i < 35; i++){
			if(Acentos[i] != null){
				if(Acentos[i].equals(acento)){
					resultadoBusca = "PASSAGEIRO ENCONTRADO --> \n NOME: " + Nomes[i] + " \n ACENTO OCUPADO: "+Acentos[i];
				}
			}
		}
		return resultadoBusca;
	}
}
