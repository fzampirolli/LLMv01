
import java.util.Scanner;
public class Exerc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N,somapreto=0,somabranco=0,r;
        N=entrada.nextInt();
        int A[][] = new int [N][N];
        for(int g = 0; g < N; g++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.println("["+g+"]"+"["+j+"]");
                A[g][j] = entrada.nextInt();
            }
        }
        for (int p=0; p<N; p++){
            for (int b=0; b<N; b++){
                if ((p%2==0)&&(b%2==0)){
                    somapreto= A[p][b]+ somapreto;
                }
                else {
                    somabranco= A [p][b]+somabranco;
                }
            }
        }
        if (somabranco==somapreto){
            r=2;
            System.out.print(somapreto+ "  " +somabranco+ "  " +r);
                    }
        if (somabranco<somapreto){
            r=0;
            System.out.print(somapreto+ "  " +somabranco+ "  " +r);
                    }
        if (somabranco>somapreto){
            r=1;
            System.out.print(somapreto+ "  " +somabranco+ "  " +r);
                    }
    }
}
