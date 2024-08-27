
import java.util.Scanner;
public class ProvaPI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[] = new int [3];
        System.out.println("verificador de numero menor que 30 no vetor: ");
        System.out.println("Digite os valores do vetor: ");
        for(int i = 0; i<A.length;i++){
            A[i] = input.nextInt();
        }
        comparaVetor(A, 3, 30);

    }
    public static boolean comparaVetor(int v[], int n, int k){
        boolean num = false;
        int a = 0, b =0;

        for(int i=0; i<v.length; i++){
            if(v[i] < 30){
                a = a + 1;
                num = true;
            }
            else{
                num = false;
                b = b + 1;
            }
        }   
            if(a>0){
               System.out.println("Existe número menor a 30 nesse vetor.");
            }
            else{
                    System.out.println("Nao existe número menor a 30 nesse vetor.");

            }
        return num;
    }
}
