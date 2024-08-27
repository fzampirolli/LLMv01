
import java.util.Scanner;

public class Q2P2PI {

    public static void main(String[] args) {

        int i;
        Scanner entrada = new Scanner(System.in);
        String vetorAssento[] = new String[35];
        String vetorNome[] = new String[35];
        String nomepassageiro,numassento;
          for(i=0;i<35;i++){
              System.out.println("Digite seu nome: ");
              nomepassageiro = entrada.nextLine();
              vetorNome[i] = nomepassageiro;
              System.out.println("Digite o número de seu assento: ");
              numassento = entrada.nextLine();
              vetorAssento[i] = numassento;

              pesquisarNome(vetorNome, vetorAssento);

    }
    }

      public static String pesquisarNome(String vetorNome[], String vetorAssento[]){
          Scanner entrada = new Scanner(System.in);
          String n; int i;
          System.out.print("Digite nome para encontrar Assento: ");
          n = entrada.nextLine();
          for (i = 0;i<35;i++){
              if (n == vetorNome[i]){ 
                  System.out.println("Seu assento é: ");
                  System.out.println(vetorAssento[i]);
              }
          }
     ; 
      return vetorAssento[i];
      }

       public static String pesquisarAssento(String vetorNome[], String vetorAssento[]){
       String n; int i;
       Scanner entrada = new Scanner (System.in);
       System.out.print("Digite assento para associar nome: ");
          n = entrada.nextLine();
          for (i = 0;i<35;i++){
              if (n == vetorNome[i]){
                  System.out.println("Nome é: ");
                  System.out.println(vetorNome[i]);
              }
              }
           return vetorNome[i];
       }
}
