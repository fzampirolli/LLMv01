
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int x=0, ingressos1=0;
        char setor1[][] = new char[10][11];
        char setor2[][] = new char[10][11];

        for (int i = 0; i<10 ;i++){
            for (int j= 0; j<11 ; j++){
                setor1[i][j] = 'v';
                setor2[i][j] = 'v';
            }
        }

        while (x!= 3){
            System.out.println ("Escolha uma das seguintes opções: \n1) Vender ingresso \n2) Exibir o total de ingressos vendidos \n3) Encerrar o programa");
            System.out.print ("\nSua escolha:");
            x= entrada.nextInt();

        if (x==1){
                System.out.print("\nEscolha o setor (1 ou 2) que deseja comprar o ingresso: ");
                int setor = entrada.nextInt();
                System.out.print ("Escolha o numero da fila: ");
                int fila = entrada.nextInt();
                System.out.print("Escolha o numero da cadeira: ");
                int cadeira = entrada.nextInt();

                if (setor == 1){
                    if (setor1[fila][cadeira] != 'p'){
                        setor1[fila][cadeira] = 'p';
                        ingressos1=ingressos1+1;
                    } else{
                        System.out.println ("\nAVISO: Essa cadeira já foi vendida!");
                    }
                }
                if (setor == 2){
                    if (setor2[fila][cadeira] != 'p'){
                        setor2[fila][cadeira] = 'p';
                        ingressos1=ingressos1+1;
                    } else{
                        System.out.println ("Essa cadeira já foi vendida!");
                    }
                }
        }

        if (x==2){
            System.out.println ("\nO total de ingressos vendidos são: "+ ingressos1);
        }

        System.out.println ("\n\n");
        }
    }

}
