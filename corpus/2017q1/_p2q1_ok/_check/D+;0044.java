
import java.util.Scanner;

public class p2 {

    public static void ImprimeVetor(int Vet[]){
    int i=0,j=0;
    Scanner entrada = new Scanner(System.in);
         for(i=0;i<Vet.length;i++){
                 System.out.println("Digite o numero da posicao " + i  );
                 Vet[i] = entrada.nextInt();}
         for(j=0;j<Vet.length;j++){
             System.out.println("O numero da posição " + j + " do vetor é " + Vet[j]);
         }
     }

    public static void main(String[] args) {
         int V=0 ;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Tamanho do vetor :");
        V=entrada.nextInt();

        int A[]= new int [V] , i=0 ;
        int B[]= new int [V];

        ImprimeVetor(A);
        ImprimeVetor(B);

    }

}
