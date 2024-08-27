
import java.util.Scanner;

public class QUESTAO2 {

    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
        String vetorNome[] = new String [35];
        String vetorAcento[]= new String [35];
            for (int i=0; i<35; i++){
                System.out.println("Indique o nome do passageiro na posição "+i);
                vetorNome[i]= ler.next().toUpperCase();
                System.out.println("Indique o acento do passageiro na posição "+i);
                vetorAcento[i]=ler.next().toUpperCase();

        }
        pesquisarNome(vetorNome, vetorAcento);    
    }

    public static String pesquisarNome(String[] nome, String[] acento) {
        Scanner ler=new Scanner(System.in);
        String x;
        System.out.println("Digite o nome do passageiro para encontrar seu acento");
        x= ler.next().toUpperCase();
        for (int i=0; i<35; i++){
            if (nome [i] == x){
            System.out.println("O acento é"+acento[i]);
            acento[i]=ler.next().toUpperCase();
            } else {
            System.out.println(" ");

        }
        }
        return x;
   }
}   
