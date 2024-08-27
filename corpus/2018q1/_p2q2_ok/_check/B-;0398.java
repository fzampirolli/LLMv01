
import java.util.*;

public class P2EX2 {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        String vetorNome[]=new String[35];
        String vetorAcento[]=new String[35];
        String nome="";
        String acento="";
        String cadastro="";
        int i=0;

        CadastroCliente(vetorNome, vetorAcento,nome,acento);
        pesquisarNome(vetorNome,vetorAcento,acento);
        if(vetorNome[i]==nome){
            System.out.println("Nome:"+nome);
        }
        else
            System.out.println("");

    }
    public static void CadastroCliente(String vetorNome[], String vetorAcento[],String nome,String acento){
        Scanner entrada=new Scanner(System.in);
        for(int i=0;i<35;i++){
            System.out.println("Digite o nome do Cliente:");
            nome=entrada.nextLine();
            vetorNome[i]=nome;
            System.out.println("Digite o acento do Cliente:");
            acento=entrada.nextLine();
            vetorAcento[i]=acento;
        }
    }
    public static String [] pesquisarNome(String vetorNome[], String vetorAcento[], String acento){
        String nome="";
        for (int i=0;i<35;i++){
            if(vetorAcento[i]==acento){
                vetorNome[i]=nome;
                System.out.println("Nome:"+nome);
            }
        }
        return vetorNome;
    }
}   
