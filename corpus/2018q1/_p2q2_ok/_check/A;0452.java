
import java.util.*;

public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String vetorNome [] = new String [45];       
        String vetorDestino[] = new String[45];
        String destino [] = new String [1];
        System.out.print ("Digite o nome e o destino do passageiro, respectivamente:");
        Nome_e_destino (vetorNome, vetorDestino);
        System.out.println("Digite o nome de um destino:");
        destino [0] = entrada.nextLine();
        pesquisarNome (vetorDestino, vetorNome, destino);
        if(pesquisarNome(vetorDestino, vetorNome, destino).equals (" ")){
            System.out.println("Localização não existe");
        }
        else{
            System.out.println("Passageiro que vai para esta localização:"+ pesquisarNome(vetorDestino, vetorNome, destino));
        }
    }
    public static String pesquisarNome (String vetorDestino[], String vetorNome[], String destino[]){
        String nome [] = new String [1];
         for (int i=0; i<45; i++){
             if (vetorDestino[i].equals(destino [0])){
                 nome[0] = vetorNome[i];
                 i = 44;
             }
             else{
                 nome[0] = " ";
             }
         }
         return nome[0];
    }
    public static void Nome_e_destino (String vetorNome[], String vetorDestino[]){
        Scanner entrada = new Scanner (System.in);
        for (int i=0; i<45; i++){
            vetorNome[i] = entrada.nextLine();
            vetorDestino[i] = entrada.nextLine();
            System.out.println("");
        }
    }       
}
