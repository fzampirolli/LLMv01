import java.util.Scanner;
public class P2 {
    public static void main(String[] args) 
    {
        int n, aux;
        Scanner p2=new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        n=p2.nextInt();
        int A[]=new int[n];

        for(aux=0; aux<n; aux++){
            System.out.println("Digite um valor");
            A[aux]=p2.nextInt();
        }

        if(comparaVetor(A, n, 30)){
            System.out.println("Existe numero menor que 30 no vetor");
        }

        System.out.println("Vetor A: \n");
        for(aux=0;aux<n;aux++){
            System.out.println(A[aux]);
        }
    }

    private static boolean comparaVetor(int[] A, int n, int i) {
        int aux, aux1=0;
        for(aux=0; aux<n; aux++){
            if(A[aux]<i){
                aux1++;
            }
        }
        if(aux1>0){
            return true;
        }else{
            return false;
        }
    }  
}