
import java.util.Scanner;

public class 03 {

    static void criarMatriz(int vetor[],int tam,int i,int l, int c){
        int matriz[][] = new int [tam][tam];
        i=0;

        Scanner scan = new Scanner(System.in);

        for(l=0;l<tam;l++){
            for(c=0;c<tam;c++){
                if(l==c){
                    matriz[l][c] = vetor[i];
                    i++;            
                }else{
                    System.out.println("Informe o valor da célula" + (l+1) + "x" + (c+1) + "da matriz.");
                    matriz[l][c] = scan.nextInt();
                }
            }
        }

    }

    static void imprimirMatriz(int matriz[][],int l,int c,int tam){
        System.out.println("Matriz["+tam+"]["+tam+"]");
        for(l=0;l<tam;l++){
            System.out.println("");
            for(c=0;c<tam;c++){
                System.out.print(matriz[l][c] + " ");
            }
        }

    }

    public static void main(String[] args){

        int tam,i,k=0,l=0,c=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor ?");
        tam = scan.nextInt();

        int vetor[] = new int [tam];
        for(i=0;i<tam;i++){
            vetor[i] = tam-k;
            k++;
        }

        criarMatriz(vetor,tam,i,l,c);

    }

}
