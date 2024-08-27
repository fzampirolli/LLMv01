
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        int tam, media;
        System.out.print("Digite o tamanho do vetor: ");
        tam=ent.nextInt();
        int vetor[]=new int[tam];
        int M[][];
        LerVetor(vetor,tam);
        M=CriarMatriz(vetor,tam);
        ImprimirMatriz(M,tam);
        media=MediaMatriz(M,tam);
        System.out.println("A média é: "+media);

    }
    public static void LerVetor(int A[], int T){
        Scanner ent=new Scanner(System.in);
        int i;
        for(i=0;i<T;i++){
            System.out.print("Digite o elemento "+i+" do vetor: ");
            A[i]=ent.nextInt();
        }
    }
    public static int[][] CriarMatriz(int A[], int T){
        Scanner ent=new Scanner(System.in);
        int i,j;
        int M[][]=new int [T][T];
        for(i=0;i<T;i++){
            for(j=0;j<T;j++){
                if(i==j){
                    M[i][j]=A[i];
                }else{
                    System.out.print("Digite o elemento "+i+" "+j+" da matriz: ");
                    M[i][j]=ent.nextInt();
                }
            }
        }
        return M;
    }
    public static void ImprimirMatriz(int M[][],int T){
        Scanner ent=new Scanner(System.in);
        int i,j;
        System.out.println("Matriz: ");
        for(i=0;i<T;i++){    
            for(j=0;j<T;j++){
                System.out.print(M[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static int MediaMatriz(int M[][], int T){
        Scanner ent=new Scanner(System.in);
        int i, j, soma=0,cont=0, media=0;
        for(i=0;i<T;i++){
            for(j=0;j<T;j++){
                if(M[i][j]%2==0){
                    soma=soma+M[i][j];
                    cont++;
                }
            }
        }
        media=(soma/cont);
        return media;
    }
}
