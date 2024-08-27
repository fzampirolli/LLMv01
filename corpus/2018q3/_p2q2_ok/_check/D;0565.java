
import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, r, somab=0, somab1=0, somab2=0,somap1=0, somap2=0, somap=0;
        System.out.println("Digite um nº par de 2 a 22: ");
        n=ler.nextInt();
        int A[][]=new int[n][n];
        System.out.println("Digite quantos grãos tem em cada casa: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=ler.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(int j=0;j<n;j++){ 
                if(A[0][j]%2==0 || A[0][j]==0){
                    somab1=somab1+A[0][j];

                }
        }
        for(int i=0;i<n;i++){ 
            if(A[i][0]%2==0 || A[i][0]==0){
                somab2=somab2+A[i][0];
            }
        }
        somab=somab1+somab2;
        for(int j=0;j<n;j++){ 
                if(A[0][j]%2!=0){
                    somap1=somap1+A[0][j];

                }
        }
        for(int i=0;i<n;i++){ 
            if(A[i][0]%2!=0){
                somap2=somap2+A[i][0];
            }
        }
        somap=somap1+somap2;
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
        System.out.println(somab+" "+somap+" "+r);

    }
}
