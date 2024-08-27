
import java.util.Scanner;

public class Questao2 {

    private static final int TOTAL_POSICOES = 15;
    private static final String TEXTO_ENTRADA_NOME = "Digite o nome do %d passageiro:";
    private static final String TEXTO_ENTRADA_ACENTO = "Digite o acento do %d passageiro:";
    private static final String TEXTO_RESULTADO_BUSCA = "Passageiro encontrado.\n\tNome:%s\n\tAcento:%s\n\n";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetorNomes = new String[TOTAL_POSICOES],vetorAcentos = new String[TOTAL_POSICOES];
        String nomeBusca = "";
        System.out.printf("Digite os dados dos %d passageiros.\n\n",TOTAL_POSICOES);
        lerVetorPassageiros(vetorNomes, vetorAcentos);
        System.out.println("Digite o nome do usuário: ");
        nomeBusca = sc.nextLine();
        String acentoEncontrado = pesquisaAcento(vetorAcentos, vetorNomes, nomeBusca);
        if(!acentoEncontrado.isEmpty()){
            System.out.printf(TEXTO_RESULTADO_BUSCA,nomeBusca,acentoEncontrado);
        }else{
            System.out.println("Passageiro não existe.");
        }        
    }

    public static void lerVetorPassageiros(String[] vetorNome,String[] vetorAcento){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < TOTAL_POSICOES; i++) {
            System.out.printf(TEXTO_ENTRADA_NOME,i+1);
            vetorNome[i] = sc.nextLine();
            System.out.printf(TEXTO_ENTRADA_ACENTO,i+1);
            vetorAcento[i] = sc.nextLine();
        }
    }

    public static String pesquisaAcento(String[] vetorAcento,String[] vetorNome,String nome){
        for (int i = 0; i < TOTAL_POSICOES; i++) {
            if(nome.equals(vetorNome[i]))
                return vetorAcento[i];
        }
        return "";
    }

}
