
import java.util.Scanner;

public class P2Questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String setor1[][] = new String[10][11];
        String setor2[][] = new String[10][11];
        int i, setor, fila,cadeira;
        int j;
        char ent;

        for(i=0; i<10; i++){
            for(j=0; j<11; j++){
                setor1[i][j] = "v";
                setor2[i][j] = "v";
            }
        }
        System.out.println("Para venda de ingresso digite 'A': \nPara exibir o total de ingressos vendidos digite 'B': ");
        ent = (char) entrada.nextInt();

        if(ent == 'A'){
            System.out.println("Escolha o setor (1 ou 2): ");
            setor = entrada.nextInt();

            if(setor == 1){
                setor1[i][j];
            }else{
                setor2[i][j];
            }

            System.out.println("Digite o número da fila desejada: ");
            fila = entrada.nextInt();    

            System.out.println("Digite o número da cadeira: ");
            cadeira = entrada.nextInt();

        }
        else{
            System.out.println("O total de ingressos vendidos é: ");
        }

    }
}
