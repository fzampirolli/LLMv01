
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner ler= new Scanner (System.in);
        int x;
        System.out.println("Quantos elementos tem o vetor?");
        x= ler.nextInt();
        int [] v= new int [x];
            for (int i=0; i<x; i++){
                System.out.println("Quais os valores do vetor na posição : " +i);
                v[i]= ler.nextInt();

            }
      comparaVetor(v,x);
    }
    public static boolean comparaVetor (int v[], int n){
        Scanner ler=new Scanner (System.in);
         for (int i=0; i<n; i++){
            if (v[i]==10){
                System.out.println("Não existe número diferente de 10 nesse vetor");
            } else {
                System.out.println(" Existe número diferente de 10 nesse vetor");
            }
        }
        return false; 

    }
}
