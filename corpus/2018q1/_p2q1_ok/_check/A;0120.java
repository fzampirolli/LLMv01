
import java.util.*;
public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tamanho,i,k;
        boolean conf;

        System.out.print("insira o tamanho do vetor: ");
        tamanho=sc.nextInt();
        int vetor []=new int [tamanho];

        for (i=0;i<tamanho;i++){
            vetor[i]=sc.nextInt();
        }
        System.out.print("insira o numero que deseja conferir ");
        k=sc.nextInt();

         conf = comparaVetor (vetor,tamanho,k);

         if (conf == true){
             System.out.print ("Existe número igual a "+ k + "nesse vetor");
         }   
             else System.out.print ("Não existe número igual a" + k + "nesse vetor");

    }

    public static boolean comparaVetor ( int v[], int tamanho, int k){
        boolean confere=true;

        for (int i=0;i<tamanho;i++){
            if (v[i]==k){
                confere = true;
            }    
            else confere = false;    

    }
        return confere;
}
}
