
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String ans = "a";
        String set1[][] = new String[10][11];
        String set2[][] = new String[10][11];
        int setor, numfila, numcad;
        int vend = 0;

        for (int l = 0; l < set1.length; l++) {
            for (int c = 0; c < set1.length; c++) {
                set1[l][c] = "v";
            }
        }

        for (int l = 0; l < set2.length; l++) {
            for (int c = 0; c < set2.length; c++) {
                set2[l][c] = "v";
            }
        }

        while (!"c".equals(ans))
        {
            System.out.println("\n Digite a opção desejada: ");
            System.out.println("a - Vender ingresso");
            System.out.println("b - Exibir o total de ingressos vendidos");
            System.out.println("c - Encerrar o programa");
            ans = scan.nextLine();

            if ("a".equals(ans)) {
                System.out.println("Digite o setor: ");
                setor = scan.nextInt();
                System.out.println("Digite o número da fila: ");
                numfila = scan.nextInt();
                System.out.println("Digite o número da cadeira: ");
                numcad = scan.nextInt();

                if (setor == 1) {
                    if (set1[numfila][numcad] == "v") {
                        set1[numfila][numcad] = "p";
                    }
                    else
                    {
                        System.out.println("cadeira já vendida");
                    }
                    System.out.println("Vendido!");
                }

                if (setor == 2) {
                    if (set2[numfila][numcad] == "v") {
                        set2[numfila][numcad] = "p";
                    }
                    else
                    {
                        System.out.println("cadeira já vendida");
                    }
                    System.out.println("Vendido!");
                }
            }

            if ("b".equals(ans)) {
                for (int l = 0; l < set1.length; l++) {
                    for (int c = 0; c < set1.length; c++) {
                        if (set1[l][c] == "p") {
                            vend++;
                        }
                    }
                }
                for (int i = 0; i < set2.length; i++) {
                    for (int j = 0; j < set2.length; j++) {
                        if (set2[i][j] == "p") {
                            vend++;
                        }
                    }
                }
                System.out.println("Total de ingressos vendidos: "+ vend);
            }
        }
    }
}
