
import java.util.Scanner;

public class P2Q3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanho, i, j, n, m,coeficiente, linha, coluna;
        double media = 0.0, resto = 0.0, soma = 0.0;

        System.out.print("Digite o tamanho do vetor: ");
        tamanho = entrada.nextInt();

        for(i=tamanho; i>0; i--){
            int vetor[] = new int[i];
        }
        System.out.print("Seu vetor: " + vetor[i] + " ");

        n = m = tamanho;
        int matriz[][]=new int[n][m];
        System.out.print("Sua matriz: " + matriz[n][m]+ " ");

        for(i=0; i<=n-1; i++){
            for(j=0; j<=m-1; j++){
                matriz[n][m]/5 = resto;
                if(resto != 0){
                    soma = soma + matriz[n][m];
                    coeficiente++;
                }
                media = soma/coeficiente;
            }
        }
        System.out.print("A média é: " +media+ " ");
    }

}
