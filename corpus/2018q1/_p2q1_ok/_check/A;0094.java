
import java.util.Scanner;
public class P2Questao1MelissaSantos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int t;
        int i=0;

        System.out.print("Qual o tamanho do seu vetor?");
        t = teclado.nextInt();

        int A[] = new int [t];

        while (i<t){
            System.out.println("Digite o próximo número do seu vetor: ");
            A[i] = teclado.nextInt();
            i++;
        }
        if (comparaVetor(A,t,30)){

            System.out.println("Existe número menor do que 30 neste vetor.");

    }
        else{

            System.out.println("Não existe número menor do que 30 neste vetor.");
        }

    }

    public static boolean comparaVetor(int v[], int n, int k){
        int x=0;
        boolean maior = false;

        while (x<n){
            if(v[x]<k){
                maior = true;

            }
            x++;

        }
        return maior;

    }

}
