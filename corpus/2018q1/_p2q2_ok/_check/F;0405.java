
import java.util.Scanner;

public class QUESTAO2 {
    private static Object teclado;

    public static void main(String[] args) {

        String vetNome [] = new String[15];
        String vetAcento [] = new String [15];
        String n = null;
        String resultado; 
        int i = 0;

        while(i<15){

        PreencherNome(vetNome);
        PreencherAcento(vetAcento);

        resultado = pesquisarAcento(vetNome, vetAcento, n);

        System.out.println("O nome do passageiro é:" + vetNome[i]);
        System.out.println("O acento desse passageiro é:" + resultado);

        i++;
    }

    public static void PreencherNome (String vnome[]){

        Scanner teclado = new Scanner(System.in);

       int i = 0;

            System.out.println("Digite o nome do passageiro:");
            vnome[i] = teclado.nextLine();
        }

    public static void PreencherAcento (String vacento[]){

        Scanner teclado2 = new Scanner(System.in);

         int i =0;

            System.out.println("Digite o acento:");
             vacento[i] = teclado2.nextLine();

    }

    private static String pesquisarAcento(String[] vetorNome, String[] vetorAcento, String nome) {

        int i =0;

       if(i<=0){
           nome= vetorAcento[i];
        }
    return nome;
    }

}

}
