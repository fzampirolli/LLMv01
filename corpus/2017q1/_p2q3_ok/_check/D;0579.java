
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        	int i, j;
		int A[][] = new int [4][4];
		int B[][] = new int [4][4];
		for(i=0; i<4; i=i+1){
			for(j=0; j<4; j = j+1){
				System.out.println(" Digite o elemento da linha "+ (i+1)+ " e coluna "+ (j+1)+ " da matriz: ");
				A[i][j]= entrada.nextInt();
			}
		}
		for (i=0; i<3; i=i+1){
			for (j=2; j<4; j= j+1){
				B[i][j]= A[i][j];
			}
		}
		for (i=0; i<4; i=i+1){
			for (j=0; j<2; j= j+1){
				B[i][j]=0;
			}
		}
		for (i=2; i<4; i=i+1){
			for (j=2; j<4; j= j+1){
				B[i][j]=0;
			}
		}
		for(i=0; i<4; i=i+1){
			for(j=0; j<4; j = j+1){
				System.out.println(" \n O elemento ["+ (i+1)+ "]["+ (j+1)+ "] da matriz A = "+ A[i][j]);
			}
		}
		for(i=0; i<4; i=i+1){
			for(j=0; j<4; j = j+1){
				System.out.println(" \n O elemento ["+ (i+1)+ "]["+ (j+1)+ "] da matriz B = "+ B[i][j]);
			}
		}

    }

}
