
import java.util.Scanner;
public class Questao2 {

	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {

		int lin = 40, cha = 60;
		char s1[][] = new char[lin][cha], s2[][] = new char [lin][cha];
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < cha; j++) {
				s1[i][j] = 'v';
				s2[i][j] = 'v';
			}
		}

		char a = Menu();

		while (a != 'C' && a != 'c') {
			if (a == 'A' || a == 'a') {
				Sell(lin,cha,s1,s2);
			}

			if (a == 'B' || a == 'b') {
				Sold(lin,cha,s1,s2);
			}

			a = Menu();

		}

		System.out.println("\nPrograma Finalizado!");

	}

	public static char Menu() {
		System.out.print("\n================================\n"
				+ "Menu:"
				+ "\nVender ingressos [A]"
				+ "\nExibir total de ingressos vendidos [B]"
				+ "\nEncerrar [C]"
				+ "\n::: ");
		char op = input.next().charAt(0);
		while (op != 'A' && op != 'a' && op != 'B' && op != 'b' && op != 'C' && op != 'c') {
			System.out.print("\nOpção inválida!\n::: ");
			op = input.next().charAt(0);
		}

		return op;
	}

	public static void Sell(int lin, int cha, char s1[][], char s2[][]) {
		System.out.print("\nSetor::: ");
		int s = input.nextInt();
		while (s != 1 && s != 2) {
			System.out.print("\nOpção inválida!\n:::");
			s = input.nextInt();
		}

		System.out.print("\nFileira::: ");
		int f = input.nextInt();
		while (f > lin || f < 1) {
			System.out.print("\nOpção inválida!\n:::");
			f = input.nextInt();
		}

		System.out.print("\nCadeira::: ");
		int c = input.nextInt();
		while (c > cha || c < 1) {
			System.out.print("\nOpção inválida!\n:::");
			c = input.nextInt();
		}

		if (s == 1) {
			if (s1[f-1][c-1] != 'v') {
				System.out.print("\nCadeira já foi vendida!\n");
			}
			else {
				s1[f-1][c-1] = 'p';
				System.out.print("\nIngresso comprado!\nSetor " + s + " Fileira " + f + " Cadeira " + c);
			}
		}

		if (s == 2) {
			if (s2[f-1][c-1] != 'v') {
				System.out.print("\nCadeira já foi vendida!\n");

			}
			else {
				s2[f-1][c-1] = 'p';
				System.out.println("\nIngresso comprado!\nSetor " + s + " Fileira " + f + " Cadeira " + c);
			}
		}

	}

	public static void Sold(int lin, int cha, char s1[][], char s2[][]) {

		int count1 = 0, count2 = 0;

		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < cha; j++) {
				if (s1[i][j] == 'p') {
					count1++;
				}
				if (s2[i][j] == 'p') {
					count2++;
				}
			}
		}

		int total = count1 + count2;
		if (total == 4800) {
			System.out.println("\nIngressos esgotados");
		}
		else {
			System.out.println("\nForam vendidos " + total + " ingressos até o momento.");
		}

	}

}
