
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        String nome = new String ();
        Scanner sc = new Scanner(System.in);
        String vetorNome [] = new String[35];
        String vetorAcento[] = new String[35];
        for(int i=0; i<5; i++){
            System.out.println("Digite o nome do passageiro: ");
            vetorNome[i] = sc.next();
            System.out.println("Informe o acento do passageiro: ");
            vetorAcento[i] = sc.next();
        }
        System.out.println("Informe o acento que se deseja buscar: ");
        String acento = sc.next();
       nome =  PesquisarNome(vetorNome, vetorAcento, acento);
        System.out.print("O nome da pessoa é= "+ nome);
    }

    public static String PesquisarNome(String[]vetorNome, String[] vetorAcento, String acento ){
        String nome = new String ();
        for(int i=0;i<5;i++){
            if(acento.equals(vetorAcento[i])){
                System.out.println("O nome da pessoa é= "+ vetorNome[i]+ " e o acento é o= "+ acento); 
                nome = vetorNome[i];
}     
        }
         return nome;
}
}
