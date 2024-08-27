
import java.util.Scanner;
public class EX1 {

    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
       System.out.println("Tamanho");
      int n = scan.nextInt();
       int v[] = new int [n];
       int i, j, aux=0;
       for(i = 0; i < n; i++){
           v[i] = scan.nextInt();
        }
       for(i = 0; i < n; i++){
           if (v[i] > v[n - 1 - i]){
             aux = v[i];
             v[i] = v[n - 1 - i];
             v[n - 1 - i] = aux;
           }
       }   
       System.out.println(".");
       for(i = 0; i < n; i++){
           System.out.println(v[i]);
        }
    }

}
