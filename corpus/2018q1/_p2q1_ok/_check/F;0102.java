
import java.util.Scanner;

public class P2Q1{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, i;
        int valor = 10;
        boolean retorno = false;

        System.out.print("Digite o tamanho do vetor: /n");
        n = entrada.nextInt();
        int v[] = new int [n];

        for(i=0; i<=n-1; i++){
            System.out.print("Digite um valor para ser adicionado ao vetor: /n");
            i = entrada.nextInt();
           int v[n] = new int v[i];
        }

        if(valor.equals(v[i])){
            retorno = false;
        } else{
            retorno = true;
        }

        System.out.print(" "+retorno+" ");
    }

}
