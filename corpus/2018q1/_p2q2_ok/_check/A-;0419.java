
import java.util.Scanner;

public class P2Questao2MelissaSantos {

    public static void main(String[] args) {
        String vetorDestino[] = new String[45];
        String vetorNome[] = new String[45];

        String destino;

        int i = 0;

        Scanner tec = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        while(i<1){

            System.out.println("Digite o próximo nome de passageiro: ");
            vetorNome[i] = tec.nextLine();

            System.out.println("Digite o destino desse passageiro: ");
            vetorDestino[i] = tec.nextLine();

            i++;

        }

        System.out.println("Digite o destino: ");
        destino = scan.nextLine();

        System.out.println(pesquisarNome(vetorDestino, vetorNome, destino));

    }

    public static String pesquisarNome(String D[], String N[], String d){
        int i = 0;
        int x = 0;
        String devolver = ("");

        while (i<45){
            if (D[i].equals(d)){

                x++;
                return N[i];
            }

          i=i+1;  
        }
        if (x==0){
            devolver = ("Destino não encontrado!");
        }

        return devolver;

    }

}
