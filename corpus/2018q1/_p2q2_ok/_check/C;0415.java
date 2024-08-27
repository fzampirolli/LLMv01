
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);

       String[] vetorNome=new String[5];
       String[] vetorAcento=new String[5];
       String acento, result;

       vetorNome=PreencherNome(vetorNome);
       vetorAcento=PreencherAcento(vetorAcento);

       System.out.println("Digite o acento em que voce deseja ver o nome da pessoa");
       acento=entrada.nextLine();

       result=pesquisarNome(vetorNome, vetorAcento, acento);
       if(result=="nome"){
           System.out.println("Nome do passageiro" +result);
       }
       else{
           System.out.println("Acento não existe");
       }

    }

    public static String[] PreencherNome(String vetorNome[]){
        int i;
        Scanner entrada=new Scanner(System.in);

        for(i=0; i<5; i++){
            System.out.println("Digite o nome do passageiro");
            vetorNome[i]=entrada.nextLine();
        }
        return vetorNome;
    }

     public static String[] PreencherAcento(String vetorAcento[]){
        int i;
        Scanner entrada=new Scanner(System.in);

        for(i=0; i<5; i++){
            System.out.println("Digite o acento");
            vetorAcento[i]=entrada.nextLine();
        }
        return vetorAcento;
     }

    public static String pesquisarNome(String vetorNome[], String vetorAcento[], String acento){
         int i;
         String nome;

          for(i=0; i<5; i++){
             if(acento==vetorAcento[i]){
               nome=vetorNome[i];

             }

          }
             return nome;

    }

}
