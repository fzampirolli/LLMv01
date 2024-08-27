
import java.util.Scanner;

public class QUESTAO1 {

    public static void main(String[] args) {

        int vetor[] = new int [3];
        boolean resultado;
        int i, a = 0, b = 0;

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<3; i++){

        System.out.println("Digite os valores do vetor:");
        vetor[i] = teclado.nextInt();
        }

        resultado = comparaVetor(vetor, a, b);

        if(resultado=true){

            System.out.println("Existe numero menor a 30 nesse vetor");
        }

        else{
        System.out.println("Não existe número menor a 30 nesse vetor");
    }

    }
    public static boolean comparaVetor(int v[], int n, int k){

     int i, tam;
     boolean x, y;
        x = false;

     tam = v.length;

     for(i=0; i<tam; i++){

         x = v[i] < 30;

    } 
        return x;
        }
}
