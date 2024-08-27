
import java.util.Scanner;

public class P2Ex2 {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        String nome,g;

        String vetorNome[];
        vetorNome = new String[1];
        String vetorDestino[];
        vetorDestino = new String[1];

        for(int i=0; i<1; i++){
            System.out.println("Digite o seu nome:");
            vetorNome[i]= e.nextLine();

            System.out.println("Digite o seu destino:");
            vetorDestino[i]= e.nextLine();     
        }

        System.out.println("Digite o nome que deseja :");
        nome = e.nextLine();

        System.out.print(vetorDestino[0]);

        g = PesquisarDestino(vetorDestino,vetorNome,nome);

        if (g == nome){
            System.out.println("Passageiro não existe");
        }else{
            System.out.println("O passageiro "+nome+" tem como seu destino "+PesquisarDestino(vetorDestino,vetorNome,nome));
        }

    }
    public static String PesquisarDestino(String vetorDestino[],String vetorNome[],String nome){
        String g = "" ;
        for(int i=0; i<25;i++){
            if(nome == vetorNome[i]){
                g = vetorDestino[i];
            }
        }
        return g;

    }
}
