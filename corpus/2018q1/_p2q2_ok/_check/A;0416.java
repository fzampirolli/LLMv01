
import java.util.Scanner;

public class ex2 {
    static int tamanho=2;
    public static void main(String[] args) {
        String vetorNome[]=new String[tamanho];
        String vetorAcento[]=new String[tamanho];     
        String acento;

        Scanner entrada=new Scanner(System.in);

        lerVetor(vetorNome,vetorAcento);

        System.out.print("digite o acento: ");
        acento=entrada.next();

            for(int i=0;i<tamanho;i++){
                if(acento.equals(vetorAcento[i])){
                    System.out.println("nome do passageiro: "+pesquisarNome(vetorAcento,vetorNome,acento)+"  acento: "+acento);
                }
            }

    }
    public static void lerVetor(String vetorNome[],String vetorAcento[]){

        Scanner entrada=new Scanner(System.in);

        for(int i=0;i<tamanho;i++){
            System.out.print("Digite o nome do passageiro: ");
            vetorNome[i]=entrada.next();
            System.out.print("Digite o acento do passageiro: ");
            vetorAcento[i]=entrada.next();
        }

    }
    public static String pesquisarNome(String vetorAcento[],String vetorNome[],String acento){
        int i;
        String nome="''";

        for(i=0;i<tamanho;i++){
            if(acento.equals(vetorAcento[i])){
                nome=vetorNome[i];

            }

        }   

        return nome;
    }

}
