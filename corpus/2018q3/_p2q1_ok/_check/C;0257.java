
import java.util.*;
public class Questao1 {

    public static void main(String[] args) {

    int v[], n, L,g;
    Scanner sc = new Scanner(System.in);
        System.out.println("digite o tamanho do vetor");
        n=sc.nextInt();
        v = new int [n];
        for (int i=0; i<n; i++){
        System.out.println("digite o valor da posição "+ i); 
        v[i]=sc.nextInt();    
    }
    g = n-1;
        for (int i=0; i<n/2; i++){
            if ( v[i] < v[g-i]){
                L = v[g-i];

                v[g-i] = v[i];
                v[i]=L;

            }

        }
       for (int i=0; i<n; i++){
            System.out.println(v[i]);
       }
    }

}
