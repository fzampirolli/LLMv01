
import java.util.Scanner;
public class Questao2 {
static final int Tam=3;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j;
        String vetorNome[]= new String[Tam];
        String vetorAcento[]= new String[Tam];
        String nome;
        String Acent;
        for(i=0;i<Tam;i++){
            System.out.println("Informe o nome do passageiro: \n");
            vetorNome[i]=sc.nextLine(); 
            System.out.println("Informe acento do passageiro: "+vetorNome[i]+".");
            vetorAcento[i]=sc.nextLine();
            }

            System.out.println("Digite o nome do passageiro que deseja buscar: \n");
            nome=sc.nextLine();

            for(i=0;i<Tam;i++){
              if(vetorNome[i] == null ? nome != null : !vetorNome[i].equals(nome)){
                  System.out.println("Passageiro não existe. /n");
                }
              else{
               PesquisarAcento(vetorAcento,vetorNome,nome);
              }
            }
     }

    public static String PesquisarAcento(String[] vetorAcento,String[] vetorNome,String nome){
    String Acent="Passageiro não existe ";

    int i;
    for(i=0;i<Tam;i++){
        if(vetorNome[i].equals(nome)){
            System.out.println("O acento do passageiro é o: "+vetorAcento[i]);
            Acent=vetorAcento[i];
        }
    }
    return Acent;
    }

}
