
public class Questao3 {

	public static void main(String[] args) {

		int alunos = 150, avaliacoes = 4;
		char matConceitos[][] = new char[alunos][avaliacoes];
		double MEDIA[] = new double [alunos];
		GeraMat(matConceitos, alunos, avaliacoes);
		GeraMedia(matConceitos, alunos, avaliacoes, MEDIA);
		ImprimeConceitoFinal(alunos,MEDIA);

	}

	static void GeraMat(char Mat[][], int nlinhas, int ncolunas) {
		char conceitos[] = {'F', 'D', 'C', 'B', 'A'};
		int i, j, valor;
		for (i = 0; i < nlinhas; i++) {
			for (j = 0; j < ncolunas; j++) {
				valor = (int)(Math.random()*5);
				Mat[i][j] = conceitos[valor];
			}
		}
	}

	static void GeraMedia(char Mat[][], int nlinhas, int ncolunas, double MEDIA[]) {
		double ConceitoNum[][] = new double[nlinhas][ncolunas];
		for (int i = 0; i < nlinhas; i++) {
			for (int j = 0; j < ncolunas; j++) {
				if (Mat[i][j] == 'A') {
					ConceitoNum[i][j] = 4;
				}
				else {
					if (Mat[i][j] == 'B') {
						ConceitoNum[i][j] = 3;
					}
					else {
						if (Mat[i][j] == 'C') {
							ConceitoNum[i][j] = 2;
						}
						else {
							if (Mat[i][j] == 'D') {
								ConceitoNum[i][j] = 1;
							}
							else {
								ConceitoNum[i][j] = 0;
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < nlinhas; i++) {
			MEDIA[i] = ((ConceitoNum[i][0] * 35) + (ConceitoNum[i][1] * 10) + (ConceitoNum[i][2] * 15) + (ConceitoNum[i][3] * 40))/100;
		}

	}

	static void ImprimeConceitoFinal(int ncolunas, double MEDIA[]) {
		System.out.print("CONCEITOS");
		for (int j = 0; j < ncolunas; j++) {
			if (MEDIA[j] < 0.8) {
				System.out.print("\nAluno " + (j+1) + ": F");
			}
			else {
				if (MEDIA[j] < 1.5) {
					System.out.print("\nAluno " + (j+1) + ": D");
				}
				else {
					if (MEDIA[j] < 2.5) {
						System.out.print("\nAluno " + (j+1) + ": C");
					}
					else {
						if (MEDIA[j] < 3.6) {
							System.out.print("\nAluno " + (j+1) + ": B");
						}
						else {
							System.out.print("\nAluno " + (j+1) + ": A");
						}
					}
				}
			}
		}
	}

}
