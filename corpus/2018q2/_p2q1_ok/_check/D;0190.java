
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        final int MAX = 50;
        int V[]= new int[50];
        int i,k,maior;

        Scanner input = new Scanner (System.in);

        System.out.println("Preencher vetor: ");
        for(i=0; i< MAX ;i++){
            V[i] = (int)(Math.random()*72-21);  
        }

        System.out.print("Os valores do vetor são: ");
        for (i=0; i< MAX ;i++){
            System.out.print(V[i]+ " ");
        }

        System.out.println("O elemento do índice 12: ");
        for (i=0; i< MAX ;i++){
            System.out.print(V[12]+ " ");   
        }

        maior = V[12];

        System.out.println("A quantidade de números maiores: ");
        for (i=0; i< MAX ;i++){
            if(V[i]<maior);   
            maior=V[i];
            System.out.print(maior+" ");    
        }
    }

}
