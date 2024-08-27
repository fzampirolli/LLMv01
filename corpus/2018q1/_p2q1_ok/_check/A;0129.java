
import java.util.Scanner;

public class P2Ex1 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int t,i,k = 40;
        boolean g;
        System.out.println("O tamanho do vetor será: ");
        t = e.nextInt();

        int A[] = new int[t];

        for (i=0;i<t;i++){
            System.out.println("Digite o número que deverá estar na posição "+(i+1));
            A[i]= e.nextInt();
        }
        g = comparaVetor(A,t,k);
        if(g == false){
            System.out.println("Não há o número 40 nesse vetor");
        }else if(g == true){
            System.out.println("Há o número 40 nesse vetor");
        }

    }
    public static boolean comparaVetor(int A[],int t,int k){
        boolean g=false;

        for (int i=0;i<t;i++){
            if(A[i]==k){
                g=true;
            }

        }
        return g;
    }
}
