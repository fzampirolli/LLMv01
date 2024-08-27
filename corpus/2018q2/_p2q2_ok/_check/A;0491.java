
import java.util.Scanner;
import java.util.Random;
public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Random rand = new Random ();

        int setor = 2;
        int fileira = 10;
        int cadeira = 11;
        int S=0;

        String M[][][] = new String [setor][fileira][cadeira];
        p(M, setor, fileira, cadeira);

        int programa = 3;
        System.out.println("Bem vindo ao estádio!");

        while (programa !=0) {
            System.out.println("\nDigite 1 para comprar ingressos; \n2 para "
                    + "exibir a quantidade de ingressos vendidos e; \n0 para sair.");
            System.out.println(" ");

            programa = entrada.nextInt();

            if (programa == 1) {
                        Compra(M);
            } else if (programa == 2) {
                        System.out.println("Já vendemos um total de " 
                                +Vendidos(M, setor, fileira, cadeira, S)+ " ingressos.");
            }
        }
        System.out.println("Agradecemos a visita!");

    }
    public static void p(String M[][][], int setor, int fileira, int cadeira) {
        for (int i=0; i<setor; i++) {
            for (int j=0; j<fileira; j++) {
                for (int k=0; k<cadeira; k++) {
                    M[i][j][k] = "v";
                }
            }
        }
    }
    public static void Compra(String M[][][]) {
                Scanner entrada = new Scanner (System.in);
                System.out.print("Digite o setor (1 ou 2): ");
                int a = entrada.nextInt();
                System.out.print("Digite a fileira (1 a 10): ");
                int b = entrada.nextInt();
                System.out.print("Digite a cadeira (1 a 11): ");
                int c = entrada.nextInt();

                if (M[a-1][b-1][c-1].equals("v")) {
                    M[a-1][b-1][c-1] = "p";
                    System.out.println("\nObrigado pela compra!!!");
                } else {
                    System.out.println("\nEsta cadeira ja foi vendida. Por "
                            + "favor, escolha outro lugar.");
                }

    }
    public static int Vendidos(String M[][][], int setor, int fileira, int cadeira, int S) {
        for (int i=0; i<setor; i++) {
            for (int j=0; j<fileira; j++) {
                for (int k=0; k<cadeira; k++) {
                    if (M[i][j][k].equals("p")) {
                        S=S+1;
                    }
                }
            }
        }
        return(S);
    }

}
