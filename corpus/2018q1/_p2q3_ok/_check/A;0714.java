import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Por favor insira o tamanho do vetor");
		int TAMANHO_VETOR  = leitor.nextInt();

		int v[] = new int[TAMANHO_VETOR];

		for(int i=0; i<= TAMANHO_VETOR-1 ; i++){
			System.out.println("Por favor Insira o elemento de posição ["+ i +"] do vetor");
			v[i] = leitor.nextInt();
		}

		int VETOR_RETORNO[][] = criarMatriz(v);

		ImprimirMatriz(VETOR_RETORNO);

		double MEDIA = MediaMatriz(VETOR_RETORNO);
		System.out.println("A média dos elementos PARES foi --> " + String.format("%.2f", MEDIA) );
	}

	public static int[][] criarMatriz(int v[]){
		Scanner entrada = new Scanner(System.in);
		int DIMENSAO = v.length;
		int MATRIZ[][] = new int[DIMENSAO][DIMENSAO];
		for(int j=0; j<= DIMENSAO-1; j++){
			for(int k=0; k<= DIMENSAO-1; k++){
				if( j == k){
					MATRIZ[j][k] = v[j];
				} else {
					System.out.println("Por favor Insira o elemento de posição ["+ j +"]["+ k +"] do vetor");
					MATRIZ[j][k] = entrada.nextInt();
				}
			}
		}
		return MATRIZ; 
	}

	public static void ImprimirMatriz(int VETOR_RETORNO[][]){
		System.out.println(" \n ============ IMPRIMINDO MATRIZ ============= ");
		int tamanho = VETOR_RETORNO.length;
		for(int j=0; j <= tamanho-1; j++){
			for(int k=0; k<= tamanho-1; k++){
				System.out.print(VETOR_RETORNO[j][k] + "\t");
			}
			System.out.println("");
		}
		System.out.println(" \n ============ IMPRESSAO COMPLETA ============= ");
	}

	public static double MediaMatriz(int VETOR_RETORNO[][]){
		int tamanho = VETOR_RETORNO.length;
		int somatoria_media = 0;
		int qntd_pares = 0;
		for(int j=0; j <= tamanho-1; j++){
			for(int k=0; k<= tamanho-1; k++){
				if(VETOR_RETORNO[j][k] % 2 == 0){
					somatoria_media = somatoria_media + VETOR_RETORNO[j][k];
					qntd_pares = qntd_pares + 1;
				}
			}
		}
		return somatoria_media / qntd_pares ;
	}

}
