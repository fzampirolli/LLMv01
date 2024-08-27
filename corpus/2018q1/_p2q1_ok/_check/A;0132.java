
import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int n=135,k=20;
        int vetor[]=new int[n];
        boolean resultado;

        for (int i=0;i<n;i++){
            System.out.println("Insira um valor para o vetor: ");
            vetor[i]=entrada.nextInt();
        }

        resultado= comparaVetor(vetor,n,k);

        if(resultado==true){
            System.out.println("Existe um número maior a 20 neste vetor.");
        }
        else{
            System.out.println("Não há um número maior que 20 nesse vetor.");
        }

    }

    public static boolean comparaVetor(int v[], int n,int k){
      boolean result=true;
      int a=0;
        for (int i=0;i<n;i++){
          if (v[i]>k){
              result=true;
              a++;
          }
          else{
              result=false;
          }

      }
        if (a!=0){
            result=true;
        }
   return result; }

}
