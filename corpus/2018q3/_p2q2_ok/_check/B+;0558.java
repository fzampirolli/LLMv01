import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n=22,i,j,somap=0,somab=0,r=0;
        int A[][]= new int [n][n];

        System.out.print("Insira o valor de casas: ");
        n=teclado.nextInt();

        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.println("Insira o valor de grãos nesta casa: ");
                A[i][j]=teclado.nextInt();        
            }
        }
        for (i=0;i<n;i=i+1){
            if(i%2==0){
		for (j=0;j<n;j=j+2){
		    somap=somap+A[i][j];
		}
            }
            if(i%2!=0){
		for (j=1;j<n;j=j+2){
		    somap=somap+A[i][j];
		}
            }
	}
        for (i=0;i<n;i++){
            if(i%2==0){
		for (j=1;j<n;j=j+2){
		    somab=somab+A[i][j];
		}
            }
            if (i%2!=0){
		for (j=0;j<n;j=j+2){
		    somab=somab+A[i][j];
		}
            }
	}
        if (somap>somab){
            r=0;
        }
        if (somap<somab){
            r=1;
        }
        if (somap==somab){
            r=2;
        }

    System.out.println(somap+" "+somab+" "+r);
}
}
