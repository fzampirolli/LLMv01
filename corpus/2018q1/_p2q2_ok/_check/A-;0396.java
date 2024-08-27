
import java.util.Scanner;

public class P22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String vetorNome[] = new String [15], vetorAcento[] = new String [15];
        String nome;

        for(int i = 0; i < 15; i++){
            System.out.print("Digite o "+(i+1)+"° nome: ");
            vetorNome[i] = entrada.next();
            vetorAcento[i] = ("acento "+(i+1));
        }
        System.out.print("Digite o nome que deseja procurar: ");
        nome = entrada.next();

        String acento = pesquisarAcento(vetorNome, vetorAcento, nome);
        System.out.println(acento);
    }
    public static String pesquisarAcento(String Vnome[], String Vacento[], String nome){
        for(int i = 0; i < 15; i++){
            if(Vnome[i].equals(nome)){
                return Vacento[i];
            }
        }
        return " ";
    }
}
