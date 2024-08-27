
import java.util.Scanner;

public class AnaFlaviaBezerradeOliveira__flavia_oliveira__QuestA£o1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX = 50;
        int V[] = new int[MAX];
        System.out.println("Preencher vetor: ");
        for (int i = 0; i < MAX; i++) {
            V[i] = (int) (Math.random() * 72 - 21);

            System.out.println("" + V[i]);  
            System.out.println(" o elemento de indice 5 do vetor é: " + V[5]); 
            System.out.println(" os numeros maiores que este elemento são : " + i);  

            System.out.println(" digite um valor: "); 
            int k = scan.nextInt();                   
            if (k == V[i]) {         
                System.out.println(" k ocorreu na posição x: " + k); 

            } else {
                System.out.println(" k não foi encontrado no vetor.");  
            }

        }
    }
}
