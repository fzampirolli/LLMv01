
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
    int A [][];
    int i, j, n, v, r = 0, c = 0;
    int somap = 0, somab = 0;
    Scanner entrada = new Scanner (System.in);
    n = entrada.nextInt();
    A = new int [n][n];

    for (j = 0; j < n; j++){
        for (i = 0; i < n; i++){

            v = entrada.nextInt();
            A[i][j] = v;

            if (c == 0){
                somap = somap + v;
		System.out.println("preta");
                        }
            else{
                if (c%2 == 0){
                    somap = somap + v;
		    System.out.println("preta");
			}
                else{
                    somab = somab + v;
		    System.out.println("branca");
                }
            }
            c = c + 1;
            }    
        }
        if (somap > somab){
        r = 0;
        }
        if (somab > somap){
        r = 1;
        }
        if (somab == somap){
        r = 2;
        }

    System.out.println(somap + " " + somab + " " + r);
    } 
}
