import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		char[][] sector1 = new char[9][10];
		char[][] sector2 = new char[9][10];
		int menu;
		int sector;
		int lin;
		int col;
		int sell = 0;
		boolean finish = false;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				sector1[i][j] = 'v';
				sector2[i][j] = 'v';
			}
		}

		do {
			System.out.println("Digite o número da opção desejada");
			System.out.println("1 - Vender ingresso");
			System.out.println("2 - Exibir total de ingressos vendidos");
			System.out.println("3 - Encerrar o programa");
			menu = s.nextInt();
			if (menu == 1) {
				System.out.print("Qual setor desejado? (1 ou 2): ");
				sector = s.nextInt();
				System.out.print("Qual o número da fileira? (0 a 9): ");
				lin = s.nextInt();
				System.out.print("Qual o número da cadeira? (0 a 10): ");
				col = s.nextInt();
				if (sector == 1) {
					if (sector1[lin][col] == 'v') {
						sector1[lin][col] = 'p';
					} else {
						System.out.println("cadeira já foi vendida");
					}
				} else if (sector == 2) {
					if (sector2[lin][col] == 'v') {
						sector2[lin][col] = 'p';
					} else {
						System.out.println("cadeira já foi vendida");
					}
				}
				System.out.println("Venda efetuada com sucesso!");
				sell++;
			} else if (menu == 2) {
				System.out.println("O total de ingressos vendidos até agora foi: " + sell);
			} else if (menu == 3) {
				finish = true;
			} else {
				System.out.println("Essa opção não existe, escolha novamente!");
			}
		} while (finish == false);
		System.out.println("O programa foi encerrado");
	}
}