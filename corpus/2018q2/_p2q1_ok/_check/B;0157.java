import java.util.Scanner;
public class 1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        final int MAX = 50;
        int V[] = new int[MAX];
        int maiores=0, k;
        System.out.println("Preencher vetor: ");
        for (int i=0; i<MAX; i++){

            V[i] = (int)(Math.random()*72-21);
        }
        for (int i=0; i<MAX; i++){
            System.out.println(V[i]);
        }
        System.out.println("O elemento de índice 7 é: "+V[7]);
        for (int i=0; i<MAX; i++){
            if (V[7] > V[i]){  
                maiores++;
            }
        }
        System.out.println("A quantidade de números maiores que o elemento de índice 7 é: "+maiores);
        System.out.println("Informe um número inteiro: ");
        k = entrada.nextInt();
        for (int i=0; i<MAX; i++){
            if(k==V[i]){
                System.out.println("O número "+k+" ocorreu na posição "+i);
            }
            else{
                System.out.println(k+" não foi encontrado");  
            }
        }

    }

}
