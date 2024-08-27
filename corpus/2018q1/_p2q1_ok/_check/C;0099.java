
import java.util.*;
public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int indice = 0;
        int v [] = new int[115];

       while(indice <115){
           System.out.println("Digite um número:");
           v[indice]= entrada.nextInt();
       }

       comparaVetor(v,115,40);

       if(comparaVetor(v,115,40) == true){
            System.out.println("Existe número igual a 40 nesse vetor");
       }else{
           System.out.println("Não existe número igual a 40 nesse vetor");
       }

    }

    public static boolean comparaVetor (int v[], int n, int k){

        int i = 0;
        while(i<n){
            if(v[i]==k){
             return true;
            }
        }
        return false;
    }
}
