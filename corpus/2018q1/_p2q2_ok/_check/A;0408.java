
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String vetorNome[], vetorDestino[], destino, passageiro;
        int tam = 2;
        vetorNome = new String[tam];
        vetorDestino = new String[tam];

        System.out.println("Digite os elementos do vetor:");
        lerVetores(vetorNome, vetorDestino, tam);

        System.out.print("\nDigite um destino: ");
        destino = input.next();

        passageiro = pesquisarNome(vetorNome, vetorDestino, tam, destino);

        if (passageiro == null){
            System.out.println("Destino não existe!");
        }
        else
            System.out.println("Passgeiro " + passageiro + " com destino a " + destino);

    }

    public static void lerVetores(String N[], String D[], int tam){
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i< tam ; i++){
            System.out.println("\nPassageiro " + i);
            System.out.print("- Nome: ");
            N[i] = input.next();
            System.out.print("- Destino: ");
            D[i] = input.next();
        }
    }

    public static String pesquisarNome(String N[], String D[], int tam, String destino){
        boolean t = false;
        String nome = null;
        for(int i = 0 ; i< tam ; i++){
            if(D[i].equals(destino)){
                nome = N[i];
            }
        }
        return nome;
    }
}
