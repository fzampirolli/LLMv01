
import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int i,j;
	int n;
	int soma=0, soma2=0;
	System.out.println("Digite o valor da matriz");
	n= entrada.nextInt();
	int matriz[][]= new int[n][n];

	for (i=0;i<n;i++){

	    for(j=0;j<n;j++){
		matriz[i][j]= entrada.nextInt();  

	    }

	}
	for (i=0;i<n;i++){
	    for (j=0;j<n;j++){
		if (i%2==0 ||j%2==0){
		    soma= soma+matriz[i][j];
		}
		else{
		    soma2=soma2+matriz[i][j];
		}
	    }
	}

	System.out.print(soma+" "+soma2+" ");
	if(soma>soma2){
	    System.out.println("0");
	}
	else if(soma2>soma){
	    System.out.println("1");

	}
	else{
	    System.out.println("2");
	}
    }  
}
