
import java.util.Scanner;
public class tabuleiro {
	public static void main(String[] args){
		Scanner scan= new Scanner (System.in);
		int n, i, j, somap=0, somab=0;
		n= scan.nextInt();
		int A[][]= new int[n][n];
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				System.out.println(i+" "+j);
				A[i][j]= scan.nextInt();
			}
		}
		for(i=0; i<n; i++){
			if(i%2==0){
				for(j=0; j<n; j=j+2){
					somap= somap + A[i][j];
				}
			}else{
				for(j=1; j<n; j=j+2){
					somap= somap + A[i][j];
				}
			}
		}
		for(i=0; i<n; i++){
			if(i%2==0){
				for(j=1; j<n; j=j+2){
					somab= somab + A[i][j];
				}
			}else{
				for(j=0; j<n; j=j+2){
					somab= somab + A[i][j];
				}
			}
		}
		int r;
		if(somap>somab){
			r=0;
		}else if(somap<somab){
			r=1;
		}else{
			r=2;
		}
		System.out.println(somap+" "+somab+" "+r);
	}
}
