
import java.util.Scanner;

public class Questao002 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String vetorNome[] = new String[45];
       String vetorDestino[] = new String[45];
       for(int i = 0; i<45; i++){
            System.out.println("informe o nome da " + i + "ª passageiro: ");
            vetorNome[i] = ler.nextLine();
            System.out.println("Qual seu destino?");
            vetorDestino[i] = ler.nextLine();
       }
       System.out.println("\nQual destino deseja saber quem vai?");
       String destino= ler.nextLine();
       String nome = pesquisarNome(vetorDestino, vetorNome, destino);
       System.out.println(nome + "vai para esse destino!");
    }
    public static String pesquisarNome(String vetorDestino[], String vetorNome[], String destino){
        String nome = "";
        int i = 0;
        while(nome == ""){
            if(vetorDestino[i] == destino){
                nome = vetorNome[i];
            }
            i++;
        }
        return nome;
    }

}
