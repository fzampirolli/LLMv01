
import java.util.Scanner;

public class Questao1 {
static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
  int n,k=0;

  System.out.println("Digite 125 valores para o vetor");
  n=entrada.nextInt();

  comparaVetor(n,k);

    }

public static void comparaVetor(int n, int k){

       int v[];
    v = new int [125];

       for (int i=0;i<125;i++){
           n=entrada.nextInt();
           v[i]=n;
           if ((n<30)==true){               
           System.out.println("Existe número menor que 30");      
           }
           if ((n>=30)==false){     
}
       }

}
}
