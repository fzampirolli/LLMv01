
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, k=20;

        System.out.print("Digite o tamanho do vetor V : ");
        n = entrada.nextInt();

        int[] V = new int [n];

        for(int i=0; i<n; ++i){
            System.out.print("Digite o valor para a posição "+(i+1)+"ºdo vetor V : ");
            V [i] = entrada.nextInt();
        }
        if (comparaVetor(V[],n,k) == false)
        System.out.print(comparaVetor);

    }
    public static boolean comparaVetor(int V[], int n, int k ){

        boolean controle = false;

        for (int i=0; i<n; ++i){
            if(V[i]>k){
                controle = true;
            }
            else{
                controle = false;

            }
        } 
    return controle;      
    }

}
