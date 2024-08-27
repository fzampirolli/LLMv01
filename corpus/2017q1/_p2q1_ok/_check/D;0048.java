
import java.util.Scanner;

public class VetoresEModulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A[] = new int[6];
        int B[] = new int [6];
        int C[] = new int[6];

        for(int i=0;i<6;i++){
            System.out.println("informe o valor da posiçao A["+i+"]");
            A[i]= input.nextInt();
        }
        for(int i=0;i<6;i++){
            System.out.println("informe o valor da posiçao B["+i+"]");
            B[i]= input.nextInt();
        }

        ImprimeVetor(A);
        ImprimeVetor(B);

        C= MaiorElemento(A,B);
        Imprime(C);

    }
    public static void ImprimeVetor(int V[]) { 
        System.out.println("Os valores do vetos sao ");
        for(int i=0;i<6;i++){
            System.out.print(V[i]+" ");               
        }
        System.out.println();
    }
    public static int [] MaiorElemento(int V1[],int V2[]) { 

    }

}
