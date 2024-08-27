
import java.util.Arrays;
import java.util.Scanner;

public class NathaliaCarolinedeOliveiraPinto_Questao 1 P2_PI {

     public static void main(String[] args) {
     Scanner Teclado = new Scanner (System.in);

         System.out.println("Digite o tamanho do vetor: ");
         int n = Teclado.nextInt();
         int A[]= new int[n];
         int B[]= new int[n];
         int C[]= new int[n];

         for (int i = 0; i < n; i++) {
             System.out.println("Digite os valores do vetor A: ");
             A[i]=Teclado.nextInt();
         }
         for (int j = 0; j < n; j++) {
             System.out.println("Digite os valores do vetor B: ");
             B[j]=Teclado.nextInt();
         }

          System.out.println("a) O Vetor A é: " + Arrays.toString(A));
          System.out.println("O Vetor B é: " + Arrays.toString(B));

          C= MaioresElementos(A,B,n);

    }

     public static int []MaioresElementos (int Vet1[], int Vet2[], int n) { 
        int[] Vet3= new int[n];

         for (int i = 0; i <n; i++) {
             if (Vet1[i]>Vet2[i]) {
                Vet3[i]=Vet1[i]; 
             }
             else {
                 Vet3[i]=Vet2[i];
             }
         }
         System.out.println("O Vetor C é: " + Arrays.toString(Vet3));
         return Vet3; 
     }
}
