
import java.util.Scanner;

public class P2EX2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] vetorNome = new String[35];
        String[] vetorAcento = new String[35];

        String acento;
        preencherVetores(vetorNome, vetorAcento);
        System.out.println("Insira o acento que você quer pesquisar");
        acento = in.next();
        if(pesquisarNome(vetorNome, vetorAcento, acento)==""){
            System.out.println("acento não existe");
        }
        else{
            System.out.println("nome do passageiro: "+pesquisarNome(vetorNome, vetorAcento, acento)+"  acento: "+acento);
        }

    }
    public static String pesquisarNome(String vNome[], String vAcento[], String acento){
        String retorno ="";
        for (int i = 0; i < 35; i++) {    
            if(acento.equals(vAcento[i])){
                retorno = vNome[i];
            }
        }
        return retorno;
    }

    public static void preencherVetores(String vetorNome[],String vetorAcento[]){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 35; i++) {
            System.out.println("Inserir nome do "+i+"° passageiro: ");
            vetorNome[i] = in.next();
            System.out.println("Inserir acento do "+i+"° passageiro: ");
            vetorAcento[i] = in.next();
        }
    } 

}
