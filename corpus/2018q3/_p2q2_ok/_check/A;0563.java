
import java.util.Scanner;

public class exerc2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, r, branco=0, preto=0;

        n = entrada.nextInt();

        int tabuleiro[][] = new int [n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                tabuleiro[i][j] = entrada.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i%2==1&&j%2==0)||(i%2==0&&j%2==1)){
                    preto = tabuleiro[i][j] + preto;
                } else{
                    branco = tabuleiro[i][j] + branco;
                }
            }
        }

        if(branco>preto){
            r = 0;
        }else if(preto>branco){
            r = 1;
        }else{
            r = 2;
        }

        System.out.printf("%d %d %d", branco, preto, r);
    }

}
