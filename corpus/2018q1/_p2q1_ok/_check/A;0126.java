
import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {

  int n = 125; 
  int k = 30;
  int v[] = new int[n];
  boolean resultado = false;

for(int a=0; a<n; a++){
Scanner entrada = new Scanner (System.in); 
System.out.println("Digite um número inteiro: ");
v[a]=entrada.nextInt();
}
resultado = comparaVetor(v, n, k);     
if(resultado=true){
  System.out.println("Existe número menor a 30 nessa vetor. ");

  }else{
      System.out.println("Não existe número menor a 30 nessa vetor. ");

 }
}
    public static boolean comparaVetor(int v[], int n, int k){
    boolean result = false; 

    for(int a=0; a<n; a++){
    if(v[a]< k){
     result = true;
        }
     }
    return result;
  }

}