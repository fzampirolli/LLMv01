
import java.util.Scanner;

public class GuilhermeAlvesCeobaniukZaluchi__guilherme_zaluchi__provaQ2{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int n, gp = 0, gb = 0, r = 2;

			n = scan.nextInt();

		int[][] A = new int[n][n];

		int i, j;

		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++) A[i][j] = scan.nextInt();
		}

		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){

				if((i + j) % 2 == 0) gb += A[i][j];

				else gp += A[i][j];
			}
		}

		if(gp > gb) r = 0;
		else if(gp < gb) r = 1;

		System.out.printf("%d\t%d\t%d\n", gp, gb, r);
	}
}
