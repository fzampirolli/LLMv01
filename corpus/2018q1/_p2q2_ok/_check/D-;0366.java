
import java.util.Scanner;

public class Provaexercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomepessoa;
        String vetorNome[] = new String[2];
        String vetorDestino[] = new String[2];

        for (int i=0; i<2; i++){
            for (int n=0; n<2; n++){
            System.out.println("Qual o nome do passageiro " +i+ " ?: ");
            vetorNome[i] = entrada.nextLine();
            System.out.println("Qual o destino do passagiero " +n+ " ?: ");
            vetorDestino[n] = entrada.nextLine();

        }
        System.out.println("Qual o nome do passageiro que deseja buscar");
        nomepessoa = entrada.nextLine();

        PesquisarDestino(vetorNome, vetorDestino, nomepessoa);

        for(int k=0; k<2; k++){
            if (nomepessoa == vetorNome[i]){
                System.out.println("Nome passageiro: "+vetorNome[i]);
            }
            else{
                System.out.println("Passageiro não existe");
            }
        }        
        String retornopesquisa = PesquisarDestino(vetorNome, vetorDestino, nomepessoa);
            System.out.println("O destino do passageiro é: " +retornopesquisa );   

    }

}
    public static String PesquisarDestino(String nome[], String destino[], String pessoa){
        Scanner entrada = new Scanner(System.in);
        String retorno="";
        for (int i=0;i<2; i++){
            if(pessoa == nome[i]){
                retorno = destino[i];
            }
                        }
        return retorno;
        }

    }
