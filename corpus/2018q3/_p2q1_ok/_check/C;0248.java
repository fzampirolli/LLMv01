
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          int i , n;

System.out.println("Digite o tamanho ímpar do vetor");
 n = scan.nextInt();

int v[] = new int[n];

for ( i = 0; i < n; i++) {
System.out.println("Digite os valores");
v[i] = scan.nextInt();
}
for (i=0; i<v.length; i++){
    if (v[i] > 0) {
        v[i] = v[i];}
        if(v[i]<0){
            v[i] = v[i];
        }
    }
for (i = 0; i < v.length; i++) {
    if(v[i] == 0){
    }
    System.out.print(v[i]+" ");
}

}
}
