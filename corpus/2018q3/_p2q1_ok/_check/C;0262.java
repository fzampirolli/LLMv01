
import java.util.Scanner;
public class Exerc1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0, b = 0, c = 0, a;
        System.out.println("Digite o tamanho do vetor: ");
        a= entrada.nextInt();
        int V[] = new int[a];
        while(i<a) {
            System.out.println("Digite o elemento " +i);
            V[i] = entrada.nextInt();
            i++;
        }
        while(a>0){
            if (V[c]<V[a]) {
                b=V[0];
                V[0]=V[(a)];
                V[(a)]=b;    
        }
        a--;
        c++;
        }
        for(int d = 0; d<a; d++){
            System.out.print("Semiparticionado total de V: " + V[d]);
        }  
    } 
}