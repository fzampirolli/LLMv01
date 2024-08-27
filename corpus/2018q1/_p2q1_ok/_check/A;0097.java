
import java.util.Scanner;

public class Provaquestao1 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        int v[], n, k, i, p;
        k=40;

        System.out.println("Insira o tamanho do vetor");
        n = entrada.nextInt();
        v = new int[n];
        for (i=0;i<n;i++){
            System.out.println("Insira um número para o vetor: ");
            v[i]= entrada.nextInt();
        }
        p=comparaVetor (v, n, k);
        if (p==1){
            System.out.println("Existe número igual a 40 neste vetor.");
        }
        else{
            System.out.println("Não existe número igual a 40 neste vetor.");
        }
    }
    public static int comparaVetor(int v[], int n, int k){
        int i,j;
        j=0;
        for (i=0; i<n; i++){
            if (v[i]==k){
                j=1;
            }

        }
        return j;
        }
    }
