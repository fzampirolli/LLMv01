
import java.util.Scanner;

public class Questao1 {

    private final static int TOTAL_POSICOES = 125;

    public static void main(String[] args) {
        int[] v = new int[TOTAL_POSICOES];
        System.out.printf("Digite as %d posições do vetor:\n\n",TOTAL_POSICOES);
        lerVetor(v);
        if(comparaVetor(v, TOTAL_POSICOES, 30)){
            System.out.println("Existe número menor a 30 nesse vetor.");
        }else{
            System.out.println("Não existe número menor a 30 nesse vetor.");
        }
    }

    public static void lerVetor(int[] v){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < TOTAL_POSICOES; i++) {
            System.out.printf("Digite a posição %d:",i+1);
            v[i] = sc.nextInt();
        }
    }

    public static boolean comparaVetor(int v[],int n,int k){
        for (int i = 0; i < TOTAL_POSICOES; i++) {
            if(v[i]< 30)
                return true;
        }
        return false;
    }

}
