
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n = scan.nextInt();

        int V[]=  new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Digite o valor da posição "+ i);
            V[i]=scan.nextInt();
        }

        for(int i = 0; i < n/2; i++){
            if(V[i] < V[n-1-i]){
                int temp = V[i];
                V[i]=V[n-1-i];
                V[n-1-i] = temp;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.println("O valor da posição "+ i +" é: "+ V[i]);
        }

    }

}
