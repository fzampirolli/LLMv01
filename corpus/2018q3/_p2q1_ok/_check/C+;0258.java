
import java.util.Arrays;
import java.util.Scanner;
public class JavaApplication1 {

    public static int[] particiona(int[] v){
        int esquerda, direita, aux;
        esquerda = 1;
        direita = v.length - 1;
        while(esquerda < direita){
            esquerda ++;
            direita --;
            if(v[esquerda] > v[direita]){
                for(int i = 0; i < v.length; i++){
                    for(int j = 0; j < i; j++){
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    } 
               } 
            }
        }
        return v;
    }

    public static void imprime(int[] v){
        System.out.println("Vetor semiparticionado:");
        System.out.println(Arrays.toString(v));   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, v[];
        System.out.println("Digite o tamanho do vetor: ");
        n = sc.nextInt();

        v = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Digite os elementos do vetor " +i+ ":");
            v[i] = sc.nextInt();
        }
        particiona(v);
        imprime(v);        
    }     
}
