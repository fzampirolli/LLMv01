
import java.util.Scanner;

public class Ex2 {

    static String[] nome = new String[35];
    static String[] acento = new String[35];

    static Scanner in = new Scanner(System.in);

    public static void main (String[] args){

        preenche(nome, acento);

        System.out.print("Escolha um acento: ");
        String ac = in.next();

        boolean conf = false;

        for (int i=0; i<acento.length; i++){
            if (ac.equals(acento[i])){
                conf = true;
                break;
            }
        }

        if (conf == false){
            System.out.println("Acento inexistente.");
        } else {
            String resp=pesquisarNome(ac, acento, nome);
            System.out.println("Nome do passageiro: " + resp + "\nAcento: " + ac);
        }

    }

    public static String pesquisarNome (String ac, String acento[], String nome[]){

        String busca = null;

        for (int i=0; i<acento.length; i++){
            if (ac.equals(acento[i])){
                busca = nome[i];
            }
        }

        return busca;

    }

    public static void preenche (String a[], String b[]){

        for (int i=0; i<a.length; i++){
            System.out.print("digite o nome do usuario: ");
            nome[i]=in.nextLine();
            System.out.print("digite o acento do usuario: ");
            acento[i]=in.nextLine();
        }

    }

}
