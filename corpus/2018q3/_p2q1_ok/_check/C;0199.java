
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int tamanho, aux,Indice, j = 0, k;
        tamanho = scan.nextInt();
        Indice = tamanho - 1;
        int v[] = new int[tamanho];
        k = Indice;
        for (int i = 0 ; i < v.length ; i++) {
            v[i] = scan.nextInt();
        }
        while (j < v.length) {
            k = Indice ; 
        if( v[j] < v[k]) {
            aux = v[j];
            v[j] = v[k];
            v[k] = aux; 
        }
        j++;
        k--;
      }
        for (int l = 0 ; l < v.length ; l++) {
            System.out.print(v[l]);
        }
    }
}    
