import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max =50, sum=0, k;

		int v[] = new int [max];
		System.out.println("Preencher vetor: ");
		for(int i =0; i< max;i++){
			v[i] = (int)(Math.random()*72-21);
		}

		for(int i =0; i< max;i++){
			System.out.println("1. " + v[i]);
		}

		System.out.println("2. " + v[6]);

		for(int i =0; i< max;i++){
			if(v[i]>v[6]){
				sum = sum +1;
			}
		}
		System.out.println("3. " + sum);

		System.out.println("Escreva o valor de uma constante K: ");
		k =sc.nextInt( ); 

		for(int i =0; i< max;i++){
			if(k==v[i]){
				System.out.println("4. " + i);
			}
			else {
				System.out.println("K n�o foi encontrado no vetor");  
			}
		}

	}
}
