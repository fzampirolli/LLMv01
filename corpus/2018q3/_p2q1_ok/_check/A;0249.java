
import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,i,aux;
        System.out.print("Digite o tamanho do vetor V: ");
        n = teclado.nextInt();
        int V []=new int [n];
        for (i=0;i<n;i++){
            V[i]=teclado.nextInt();
        }
        for (i=0;i<(n-1)/2;i=i+2){
            if(V[i]<V[n-1-i]){
                aux=V[i];
                V[i]=V[n-1-i];
                V[n-1-i]=aux;
            }
        }
        for(i=0;i<n;i++){
        System.out.print(V[i]+" ");
        }
    }

}
