
import java.util.Scanner;
public class q3 {

    public class SomaColK{

    public static void main(String[] args) {
        int A[][] = new int [3][3];
        int B[][]= new int [4][4];
        int k=0, soma1, soma2;
        LeMatriz(A,3);
        LeMatriz(B,4);
        soma1=SomaElementosColuna(A,3,k);
        soma2=SomaElemtosColuna(B,4,k);
        System.out.println("A soma da coluna" +k+ ", da matriz A="+soma1);
        System.out.println("A soma da coluna" +k+ ", da matriz B="+soma2);
    }

}
    public static void LeMatriz(int m[][], int n){
        int i, j;
        Scanner scan= new Scanner(System.in);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("Digite o elemento da matriz");
                m[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matriz inserida com sucesso!");
    }

    public static int
            SomaElementosColuna(int m[][], int n,int k){
        int i, soma=0;
        for(i=0;i<n;i++){
            soma=soma+m[i][k];
        }
        return soma;

    }
