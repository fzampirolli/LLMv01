
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Quantas linhas terá a matriz");
        int n= scan.nextInt();
        System.out.println("Quantas colunas terá a matriz");
        int m= scan.nextInt();

        int A[][]= new int[n][m];
        int B[][]= new int[n][m];

        LeMatriz(A,n,m);
        ProduzMatriz(B,n,m);        
        ImprimeMatriz(A,n,m);
        ImprimeMatriz(B,n,m);}

public static void LeMatriz(int X[][],int l,int c) {
        Scanner scan= new Scanner(System.in);

     for(int i=0; i<l; i++){
         for(int j=0; j<l; j++){
             System.out.println("Digite os valores da Matriz A ["+i+"] ["+j+"]");
          X[i][j]= scan.nextInt();}}}

public static void ProduzMatriz(int V2[][],int l,int c) {
    for(int i=0; i<l;i++){
    for(int j=0; j<c;j++){
        V2[i][j]=0;}}
    }

public static void ImprimeMatriz(int V[][],int l,int c){

    for(int i=0;i<l;i++){
        for(int j=0;j<c;j++){
            System.out.println("Matriz ["+i+"] ["+j+"] :"+V[i][j]);}}    

        }
    }    
