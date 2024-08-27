
import java.util.Scanner;
public class P2Questao1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o tamanho do vetor");
        int n = leitor.nextInt();
        int V[] = new int[n];
        int aux;
        for (int i=0;i<V.length;i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor");
            V[i]= leitor.nextInt();
        }
        int j = n-1;
        for (int i=0;i<V.length;i++)  {
                if (V[i]<V[j]) {
                aux = V[j]; 
                V[j]=V[i];
                V[i]=aux;
                }
                j--;
        }
        int i = 0;
        System.out.println("O semiparticionado do vetor é: ");
        while(i<V.length) {
            System.out.printf(V[i]+ " ");
            i++;
        }    
 }      
}