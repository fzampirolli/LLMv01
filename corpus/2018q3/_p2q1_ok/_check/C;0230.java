
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int n,i,aux;
        int V[];

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        V = new int[n];
        for(i=0;i<n;i++){ 
            V[i] = s.nextInt();
        }

        for(i=0;i<(int)(n/2);i++){
            if((V[i] < V[(int)(n-1)])){
                aux = V[i];
                V[i] = V[n-i];
                V[n-i] = aux;
            }
        }
        for(i=0;i<n;i++){
            System.out.printf(V[i] + "\n");
        }

    }

}
