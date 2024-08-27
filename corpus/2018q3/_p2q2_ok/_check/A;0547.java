import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int somaBranco=0,somaPreto=0;
        int r;

        n =teclado.nextInt();
        System.out.println("");

        int A[][]= new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j]= teclado.nextInt();
            }
            System.out.println("");
        }

        for(int i=0; i<n; i++){
            if (i%2==0){
                for( int j=0; j<n; j=j+2){
                    somaBranco=somaBranco+A[i][j];
                }
            }
            else{
                for( int j=1; j<n; j=j+2){
                    somaBranco=somaBranco+A[i][j];
                }
            }
        }

        for(int i=0; i<n; i++){
            if (i%2==0){
                for( int j=1; j<n; j=j+2){
                    somaPreto=somaPreto+A[i][j];
                }
            }
            else{
                for( int j=0; j<n; j=j+2){
                    somaPreto=somaPreto+A[i][j];
                }
            }
        }

        if(somaBranco>somaPreto){
            r=0;
        }
        else if(somaPreto>somaBranco){
            r=1;
        }
        else{
            r=2;
        }

        System.out.print(somaBranco+"  ");
        System.out.print(somaPreto+"  ");
        System.out.print(r);

    }

}
