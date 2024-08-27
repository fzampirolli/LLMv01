
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {

        int c, tam;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor:");
        tam = entrada.nextInt();

        int vetor[] = new int[tam];
        int matriz [][] = new int[tam][tam];

        for(c=0;c<tam;c++){
            System.out.println("Infome o "+(c+1)+"º elemento do vetor:");
            vetor[c] = entrada.nextInt();
        }
        matriz = CriarMatriz(vetor);
        System.out.println("Matriz:");
        ImprimirMatriz(matriz);
        System.out.println("A média é: "+(MediaMatriz(matriz)));

    }
    public static int [][] CriarMatriz(int v[]){
        int i, j, m[][] = new int [v.length][v.length];
        Scanner entrada = new Scanner(System.in);

        for(i=0;i<v.length;i++){
            for(j=0;j<v.length;j++){
                System.out.println("Infome o elemento "+(i+1)+"x"+(j+1)+" da matriz:");
                m[i][j] = entrada.nextInt();
            }
        }
        j=0;
        for(i=0;i<v.length;i++){
            m[i][j] = v[i];
            j++;
        }
        return m;
    }
    public static void ImprimirMatriz(int m[][]){
        int i, j;

        for(i=0;i<m.length;i++){
            for(j=0;j<m.length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static float MediaMatriz(int m[][]){
        int i, j, cont = 0; 
        float somatorio = 0;

        for(i=0;i<m.length;i++){
            for(j=0;j<m.length;j++){
                if(m[i][j]%2 == 0){
                    somatorio += m[i][j];
                    cont++;
                }
            }
        }
        return somatorio/cont;    
    }
}