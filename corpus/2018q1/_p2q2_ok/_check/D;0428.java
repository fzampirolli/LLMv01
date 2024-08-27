
import java.util.Scanner;
public class Q2 {

    static Scanner in = new Scanner (System.in);
    static String vetorAcento [] = new String [3];
    static String vetorNome [] = new String [3];
    static String nome;
    static int i;

    public static void main(String[] args) {
        preencherVetores (vetorNome, vetorAcento);
        System.out.println ("Nome do usuário: ");
        nome = in.next ();
        pesquisarAcento (vetorNome, vetorAcento, nome );

    }

    public static void preencherVetores (String [] vetorNome, String [] vetorAcento) {
        for (i=0; i<vetorNome.length; i++) {
            System.out.println ("Nome do passageiro:");
            vetorNome [i] = in.next ();
            System.out.println ("Insira seu acento:" + "\nExemplos: 1a, 1b, 1c, 1d...");
            vetorAcento [i] = in.next ();
        }
    }

    public static void pesquisarAcento (String[] vetorNome, String[] vetorAcento, String nome )  {
        if (!"".equals(vetorNome [i])) {
            System.out.println ("X passageirx " + vetorNome[i] + " está alocadx no acento " + vetorAcento [i] + ".");
        } else {
            System.out.println (" A busca não obteve sucesso.");
         }
    }

}
