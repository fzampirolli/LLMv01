
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
     Scanner entrada=new Scanner (System.in);

     int a,c;
     String nome,returnk,vetorNome[], vetorAcento[],b,d;
     vetorNome=new String[35];
     vetorAcento=new String[35];

      for(a=0; a<35; a++){
          System.out.println("Insira o nome do passageiro:  ");
          b=entrada.nextLine();
          vetorNome[a]=b;
      }  
      for(c=0; c<35; c++){
          System.out.println("Insira o nome do passageiro:  ");
          d=entrada.nextLine();
          vetorNome[c]=d;
      }  
    System.out.println("Pesquise um nome: ");
    nome=entrada.nextLine();

    pesquisarNome(vetorNome,vetorAcento, nome);
    returnk=pesquisarNome(vetorNome,vetorAcento, nome);
    System.out.println("Resultado da pesquisa: "+returnk);
    }
     public static String pesquisarNome(String vetorNome[], String vetorAcento[],String nome){
     String acento,k=" " ;
     int a;
     for(a=0; a<35; a++){
         if (nome==vetorAcento[a]){ 
          vetorNome[a]=k;
         }
         else{
         k=("  ");}    
     }
     return (k);
     }
     }
