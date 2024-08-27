
import java.util.Scanner;
public class Exercisio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("digite o tamanho do vetor: ");
        n = entrada.nextInt();
        int v[] = new int [n];
        for(int k=0; k<n; k++){
          System.out.print("digite o valores do vetor na posição " + k);  
          v[k] = entrada.nextInt();} 
        for(int k=0; k<n; k++){
          if (v[k] ==40){
            System.out.print("existe o numero 40 no vetor ");
        } else System.out.print("existe o numero 40 no vetor ");
}}}
