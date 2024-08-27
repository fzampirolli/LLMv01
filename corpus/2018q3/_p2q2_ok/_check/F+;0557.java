
import java.util.Scanner;
public class Q2p2 {

    public static void main(String[] args) {
         int n;

         Scanner teclado = new Scanner(System.in);

         System.out.print("Digite um inteiro par de 2 a 24: ");
         n = teclado.nextInt();

         System.out.println("Digite os elementos da sua matriz "+n+ " x " +n);
         int A[][] = new int[n][n];
         for (int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 A[i][j]=teclado.nextInt();
             }
         }

         int somapreta = 0;
         for (int i=0; i<n; i++){
             for(int j=0; j<n; j=j+2){
                 somapreta = somapreta + A[i][j];
             }

    }

    int somabranca =0;
    for (int i=0; i<n; i++){
             for(int j=1; j<n; j=j+2){
                 somabranca = somabranca + A[i][j];
             }
}

   System.out.println(somapreta + " " + somabranca); 
}

}