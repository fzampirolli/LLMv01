
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n=teclado.nextInt(), l,c,somap=0,somab=0,r;
        int A[][] = new int [n][n];
        for(l=0;l<n;l++){
            for (c=0;c<n;c++){
                A[l][c]=teclado.nextInt();
                if (l%2==0){
                    if(c%2==0){
                        somap=somap+A[l][c];
                    }
                    else{
                        somab=somab+A[l][c];
                    }
                }
                if (l%2==1){
                    if(c%2==1){
                        somap=somap+A[l][c];
                    }
                    else{
                        somab=somab+A[l][c];
                    }

                }
            }
        }
        if(somap>somab) {
            r=0;
        }
        else if(somap<somab) {
            r=1;
        }
        else {
            r=2;
        }
        System.out.print(somap+" "+somab+" "+r);
    }

}
