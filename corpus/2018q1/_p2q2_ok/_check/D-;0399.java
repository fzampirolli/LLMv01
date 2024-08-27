
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        String  vetorAcento[] = new String[35];
        String vetorNome[] = new String[35];
        String acento[]=new String[35] ;

        System.out.println("Qual o núuero do acento? ");
        String k= entrada.nextLine();

        for(int i; i<35; i++) {
            System.out.println("Qual o nome do passageiro? ");
            vetorNome[i]= entrada.nextLine();
            System.out.println("Qual o número do acento? ");
            vetorAcento[i]= entrada.nextLine();

    }

        pesquisarNome(vetorNome[k]);

    public static pesquisarNome(String vetorAcento[], String vetorNome[], String acento[]) {

        Scanner entrada= new Scanner(System.in);

        for(int i; i<35; i++) {
           if ( acento[k] == vetorAcento[i] ) {
               System.out.print(vetorNome[i]);

        }  
    }

        return vetorNome[k];

        }

    }

}
