
import java.util.Scanner;

public class P2Ex3 {

    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);

        int tam;
        System.out.println("Digite o tamanho do vetor");
        tam=e.nextInt();

        int vetor[];
        vetor = new int[tam];
        int A[][] = new int[tam][tam];

        for(int i=0;i<tam; i++){
            System.out.println("O número da posição "+i+" será: ");
            vetor[i]=e.nextInt();
        }
        met(vetor,tam);

        System.out.println("A matriz é"+ met2(A,tam));
        System.out.println("A media é: "+ met3(A,tam));
    }
    public static int[][] met(int vetor[],int tam){
        Scanner e = new Scanner(System.in);

        int A[][] = new int[tam][tam];

        for(int i=0;i<tam;i++){
            for(int j = 0;j<tam;j++){
                if(i!=j){
                    System.out.println("Digite o número da linha "+i+ " e da coluna "+j);
                    A[i][j]= e.nextInt();
                }else if(i==j){
                    int cont=0;
                    A[i][j] = vetor[cont];
                }
            }
        }

        return A;
    }
    public static int[][] met2(int A[][],int tam){
        Scanner e = new Scanner(System.in);
        for(int i=0;i<tam;i++){
            for(int j = 0;j<tam;j++){
                System.out.println("O número da linha "+i+ " e da coluna "+j+" é: ");

            }
        }
        return A;

    }

    public static int met3(int A[][],int tam){
        int media,cont =0;
        int n = 0;
        for(int i=0;i<tam;i++){
            for(int j = 0;j<tam;j++){
                if(A[i][j]%5 != 0){
                    cont = cont + A[i][j];
                    n = n + 1;
                }
            }

        }    
        media = cont/n;
        return media;
    }
}
