
import java.util.*;
public class JavaApplication1 {

    public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  System.out.println("Escreva um numero impar positivo: ");
  int tam = input.nextInt();
  int V[]=new int [tam];
  int i,j=tam-1;
int x[]= new int [tam];
  for (i=0;i<V.length;i++){
      System.out.print("Digite um valor: ");
      V[i]=input.nextInt();
  }
  for (i=0;i<j;i++){
     for (j=tam-1;j>i;j--){
     if (V[i]<V[j]){
         int n=V[i];
         int w=V[j];
         V[j]=n;
         V[i]=w;
     }

         }}
     for (i=0;i<V.length;i++){
  System.out.println(V[i]+ " ");
          }

 }
}
