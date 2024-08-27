
import java.util.Scanner;
public class P203 {
static int L=0,C=0;
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

	System.out.println ("Insira as dimensões da matriz:");
	L = entrada.nextInt();
        C = entrada.nextInt();
        int A[][] = new int [L][C];
        int B[][] = new int [L][C];

	LER(A,L,C);

	IMPRIME(A,L,C);

	NOVAMATRIZ(A,L,C);

	IMPRIME(B,L,C);
	}
	public static void LER(int A[][], int L, int C){
	Scanner entrada = new Scanner(System.in);
        int i,j, maior=0;
	System.out.println("Insira os elementos da matriz");
		for(i=0;i<L;i++){
			for(j=0;j<C;j++){
			A[i][j] = entrada.nextInt();
			}
		}

	}
    public static void NOVAMATRIZ(int A[][], int L, int C){
	int B[][] = new int [L][C]; 
        int i,j, maior=0;
        for(i=0;i<L/2;i++){
            for(j=0;j<C/2;j++){
                B[i][j]=0;
            }
        }
	 for(i=L/2;i<L;i++){
            for(j=C/2;j<C;j++){
                B[i][j]=0;
            }
        }
         for(i=0;i<L/2;i++){
            for(j=C/2;j<C;j++){
                B[i][j]=0;
            }
        }

         for(i=L/2;i<L;i++){
            for(j=0;j<C/2;j++){
                B[i][j]=A[i][j];
            }
        }

    }
    public static void IMPRIME(int A[][], int L, int C){
	int i,j;
        System.out.println("Elementos da matriz");
	for (i=0;i<L;i++){
	for(j=0;j<C;j++){
		System.out.println("\n"+ A[i][j]);		
				}
			}

	}
}
