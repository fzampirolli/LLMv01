
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, preta=0,branca=0,r;
            System.out.println("Insira o tamanho (par) do tabuleiro");
            n = sc.nextInt();

        int[][] Mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Insira o número da posição " + j + " x " + i + " do tabuleiro: ");
                Mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if((i+j)%2==0){
            preta=preta+Mat[i][j];
            }else{
                branca=branca+Mat[i][j];
            }
        }

        }
        if(preta>branca){
            r=0;
        }else if(branca>preta){
            r=1;
        }else{
            r=2;
        }

        System.out.println(preta+"\t"+branca+"\t"+r);

    }

}
