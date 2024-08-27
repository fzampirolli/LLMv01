
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        int A[][] = new int [60][40];
        int B[][] = new int [60][40];
        int i, j, opcao, setor, a, b, i1 = 0, i2 = 0, total;
        Scanner entrada = new Scanner(System.in);
        for (i=0; i < 60; i++) {
            for (j=0; j < 40; j++) {
                A[i][j] = 'v';
                B[i][j] = 'v';
            }
        }
        System.out.println("1) Vender Ingresso");
        System.out.println("2) Exibir o total de ingressos vendidos");
        System.out.println("3) Encerrar o Programa");
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();
        while (opcao != 3) {
            System.out.println("1) Vender Ingresso");
            System.out.println("2) Exibir o total de ingressos vendidos");
            System.out.println("3) Encerrar o Programa");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o setor: ");
                setor = entrada.nextInt();
                System.out.print("Digite o número da fileira: ");
                b = entrada.nextInt();
                System.out.print("Digite o número da cadeira: ");
                a = entrada.nextInt();
                while (A[a][b] == 'p' || B[a][b] == 'p') {
                    System.out.println("Cadeira já foi vendida.");
                }
                if (setor == 1) {
                    A[a][b] = 'p';
                    i1++;
                }
                else {
                    B[a][b] = 'p';
                    i2++;
                }
            }
            else {
                if (opcao == 2) {
                    total = i1 + i2;
                    System.out.println("Foram vendidos "+total+" ingressos no total.");
                }
            }
        }
        System.out.println("Programa encerrado.");
    }
}
