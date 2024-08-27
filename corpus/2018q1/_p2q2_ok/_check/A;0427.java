
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

        int tam = 35;
        String vetorNome[] = new String [tam], vetorAcento[] = new String[tam], acento;
        Scanner entrada = new Scanner(System.in);

        PreencheVetor(vetorNome,vetorAcento);
        System.out.println();
        System.out.println("Informe o acento que deseja consultar:");
        acento = entrada.nextLine();
        if("' '".equals(pesquisarNome(vetorAcento,vetorNome,acento))){
            System.out.println("O acento não existe.");
        }else{
        System.out.println("O passageiro(a) "+pesquisarNome(vetorAcento,vetorNome,acento)+ " está no acento "+acento+".");       
        }
    }  
    public static String pesquisarNome(String vacento[], String vnome[], String acento){
        int c;
        boolean teste = true;
        String nome = "x";
        for(c=0;c<vacento.length;c++){
            if(vacento[c].equals(acento)){
                nome = vnome[c];
                teste = false;
            }
        }
        if (teste){
            nome = "' '";
        }
        return nome;
    }
    public static void PreencheVetor(String vnome[], String vacento[]){
        int c;
        Scanner entrada = new Scanner(System.in);

        for(c=0;c<vnome.length;c++){
            System.out.println("Infome o nome do passageiro(a):");
            vnome[c] = entrada.nextLine();
            System.out.println("Infome o acento do passageiro(a):");
            vacento[c] = entrada.nextLine();
        }
    }
}
