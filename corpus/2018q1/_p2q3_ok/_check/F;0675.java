
import java.util.Scanner:

public class QUESTAO3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tam, i; 

        System.out.println("Digite o tamnho do vetor:");
        tam = teclado.nextInt();

        int vetor[] = new int[tam];
        int m[][] = new int[tam][tam];
        int resultado; 

        for(i=0; i<tam; i++){

        System.out.println("Digite os valores do vetor:");
        vetor[i] = teclado.nextInt();

        resultado = MATRIZ(m, tam, vetor[]);

    }
    }

        public static int MATRIZ (int matriz[][], int tamanho, int v[]){

            int i, j;

        Scanner teclado = new Scanner(System.in);

        for( i=0; i<tamanho; i++){
            for( j=0; j<tamanho; j++){

            System.out.println("Digite os valores da matriz:");
            matriz[i][j] = teclado.nextInt();

            if(i=0; i<tamanho; i++){
                if(i=0; i<tamanho; i++){

            matriz[i][j] == v[i]; 
            }
            }
        }
            return matriz[i][j];

        }

}
}
