
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int somaB = 0, somaP = 0, res = 0;

        System.out.println("Digite o valor de n");
        int n = scan.nextInt();

        int M[][] = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.println("Digite o valor da posição ["+ i +"]["+ j +"]");
                M[i][j] = scan.nextInt();
            }
        }

        int j, k;
        for(int i = 0; i<n; i++){
            double t = i%2;
            if (t==0){
                j=0;
                k=1;
            }else{
                j=1;
                k=0;
            }
            for(;j<n; j=j+2, k=k+2){
                somaB=somaB+M[i][j];
                somaP=somaP+M[i][k];
            }
        }

        if(somaB>somaP)
            res=0;
        else if(somaB<somaP)
            res = 1;
        else
            res = 2;

        System.out.println(somaB + " " + somaP + " " + res);

    }

}
