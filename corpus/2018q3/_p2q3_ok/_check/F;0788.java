
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Escreva um número inteiro ímpar:"); 
       int n = scan.nextInt();
        int vetV[] = new int[n];

        for(int i = 0; i < n; i++){
            vetV[i] = scan.nextInt();
        }
        int n1 = n = vetV[0];
        for (int i = 0; i < n; i++){
            if (n > vetV[0])
                n1 = vetV[0];
          if (n < vetV[0])
                n = vetV[0];

        }

    }

}
