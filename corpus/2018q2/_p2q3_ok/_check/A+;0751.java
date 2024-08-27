public class Exercise3 {

	static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
		char conceitos[] = {'A', 'B', 'C', 'D', 'F'};
		for (int i = 0; i < nlinhas; i++) {
			for (int j = 0; j < ncolunas; j++) {
				int valor = (int)(Math.random() * 5);
				Mat[i][j] = conceitos[valor];
			}
		}
	}

	static float[] GeraMedia(char Mat[][], int lin) {
		float[] gradeIntern = new float[lin];
		for (int i = 0; i < lin; i++) {
			gradeIntern[i] = ((convert(Mat[i][0]) * 30) + (convert(Mat[i][1]) * 10) + (convert(Mat[i][2]) * 15) + (convert(Mat[i][3]) * 45)) / 100;
		}
		return gradeIntern;
	}

	static int convert(char concept) {
		if (concept == 'A') {
			return 4;
		} else if (concept == 'B') {
			return 3;
		} else if (concept == 'C') {
			return 2;
		}	else if (concept == 'D') {
			return 1;
		} else {
			return 0;
		}
	}

	static void ImprimeConceitoFinal(float[] vet, int lin) {
		for (int i = 0; i < lin; i++) {
			System.out.print("Aluno " + i + " -- ");
			if (vet[i] < 0.8) {
				System.out.println("CONCEITO FINAL = F");
			} else if (vet[i] < 1.5) {
				System.out.println("CONCEITO FINAL = D");
			} else if (vet[i] < 2.5) {
				System.out.println("CONCEITO FINAL = C");
			} else if (vet[i] < 3.6) {
				System.out.println("CONCEITO FINAL = B");
			} else {
				System.out.println("CONCEITO FINAL = A");
			}
		}
	}

	public static void main(String[] args) {
		char[][] matriz = new char[150][4];
		float[] grade = new float[150];
		GeraMat(matriz, 150, 4);
		grade = GeraMedia(matriz, 150);
		ImprimeConceitoFinal(grade, 150);
	}
}