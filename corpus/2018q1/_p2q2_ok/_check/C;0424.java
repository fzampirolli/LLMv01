
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {

        int n = 25;

        preencheVetores (n);

    }

    public static void preencheVetores (int n) {
        Scanner entrada = new Scanner (System.in);

        String vetorNome[] = new String[n];
        String vetorDestino[] = new String[n];

         for (int i=0; i<n; i++){
            System.out.print("Insira o nome do passageiro " + (i+1) + ": ");
            vetorNome[i] = entrada.next();

            System.out.print("Insira o destino do passageiro " + (i+1) + ": ");
            vetorDestino[i] = entrada.next();
        }

        String nome;
        System.out.print ("Digite o nome a ser consultado: ");
        nome = entrada.nextLine();

        for (int i=0; i<n; i++){
            if (vetorNome[i].equals(nome)){
                System.out.print ("O nome é: " + vetorNome[i]);
                System.out.print ("O destino é: " + vetorDestino[i]);
            } else {
                System.out.print ("Passageiro não existe");
            }
        }
        }
    }
