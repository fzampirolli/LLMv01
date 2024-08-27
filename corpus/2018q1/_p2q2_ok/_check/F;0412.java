
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String [] vetorNome = new String [15];
        String [] vetorAcento = new String [15];

        for(int i=0; i<15; ++i){
            System.out.print("Digite um nome : ");
            vetorNome [i] = entrada.nextLine();
        }
        for(int i=0; i<15; ++i){
            System.out.print("Digite o acento do passageiro : ");
            vetorAcento [i] = entrada.nextLine();
        }
        System.out.print("Digite um nome para pesquisar : ");
        pesquisarAcento(String Nome[], String vetorAcento [], String nome );
    }

    public static String pesquisarAcento(String vetorNome[], String vetorAcento [], String nome ){ 

    }
}
