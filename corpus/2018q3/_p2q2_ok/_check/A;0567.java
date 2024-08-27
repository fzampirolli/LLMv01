
import java.util.Scanner;

public class Questaodois {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int n, i, j, somap, somab, r;
        somap=0;
        somab=0;
        System.out.println("Digite o valor de N: ");
        n= Entrada.nextInt();
        int A[][];
        A = new int[n][n];
        System.out.println("Digite os valores da matriz NxN ");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                A[i][j]=Entrada.nextInt();
                if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0 ) )
                    somap=somap+A[i][j];
                else
                    somab=somab+A[i][j];
                    }

            }
        if(somab>somap){
            r=0;
        }
        else{
            if(somap>somab){
                r=1;
                }
                else{
                r=2;
            }
                }
        System.out.println(somab + " " + somap+ " "+r);
            }

    }
