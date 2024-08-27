
import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        int n, i, m2[][];
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite o parÃ¢metro do vetor");
        n=scan.nextInt();
        int v[]=new int [n];
        System.out.println("\nDigite os "+n+" elementos do vetor");
        for(i=0;i<n;i++){
            v[i]=scan.nextInt();
        }
        m2=criaMatriz(v,n);
        System.out.println("\n"+imprimeMatriz(m2,n));
        System.out.println("\n"+CA(m2,n));

    }
    public static int[][] criaMatriz(int v[], int n){
        int i, j;
        int m1[][]=new int [n][n];
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite os elementos da matriz além da diagonal principal");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    m1[i][j]=v[i];
                }
                else{
                    m1[i][j]=scan.nextInt();
                }
            }
        }
        return m1;
    }
    public static String imprimeMatriz(int m[][], int n){
        int i, j, a=0;
        String M="";
        for(j=0;j<n;j++){
            for(i=0;i<n;i++){               
                if(a!=j){
                    M=M="\n";
                    a=j;
                }
                M=M+" "+m[i][j];
            }
        }
        return M;
    }
    public static int CA(int m2[][], int n){
        int i, j, a=0, b=0;
        for(j=0;j<n;j++){
            for(i=0;i<n;i++){ 
                if(m2[i][j]%2==0){
                    a++;
                    b=(m2[i][j]+b)/a;
                }

            }
        }
        return b;
    }
}
