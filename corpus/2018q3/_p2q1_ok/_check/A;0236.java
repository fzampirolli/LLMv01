
import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        int tamanho,n=2,x = 1;
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor (positivo e impar)");
        tamanho = ent.nextInt();
        int V[] = new int[tamanho];
        for (int i =0; i<tamanho; i ++){
            System.out.print("Digite um valor para a "+i+ " º casa");
            V[i] = ent.nextInt();
        }
        while(x<(tamanho-n)){
            int aux=0;
            if(V[x]>V[tamanho-n]){
                aux = V[x];
                V[x] = V[tamanho-n];
                V[tamanho-n] = aux;
            }
            x = x+2;
            n= n+2;
        }
            System.out.print("[");
        for (int i =0; i<tamanho; i ++){
            System.out.print(V[i]+" ");
        }
        System.out.print("]");
    }

}
