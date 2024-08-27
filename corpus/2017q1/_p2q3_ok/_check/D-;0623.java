
import java.util.Scanner;
public class Exercicio2 {  
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0; 
        System.out.println("Quantas linhas havera a matriz?");
        n= sc.nextInt();
        int m = 0;
        System.out.println("Quantas colunas havera a matriz?");
        m= sc.nextInt();

        int A[][] = new int[n][m];
        int B[][] = new int[n][m];

        NewMatriz(A, n, m);

        Imp(A,B,n,m);

}

public static void NewMatriz(int VA[][], int n, int m) {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.println("Digite os valores da matriz A ["+i+"] ["+j+"]");
             VA[i][j] = sc.nextInt();}}
    }

    public static int NewB(int VB[][], int VA[][], int n, int m) {       
    int maior = 0;
    for(int i=0; i<1/2; i++){
        for(int j=0; j<1/2; j++){
            if(VA[i][j]>maior)
                VA[i][j] = maior;}}

}

public static int Imp(int VB[][], int VA[][], int n, int m) {  
        Scanner sc = new Scanner(System.in);  
           for(int i=0; i<n; i++){
             for(int j=0; j<m; j++){
             System.out.println("Digite os valores da matriz A ["+i+"] ["+j+"]");
             VA[i][j] = sc.nextInt();}}

           for(int i=0; i<n; i++){
             for(int j=0; j<m; j++){
             System.out.println("Digite os valores da matriz A ["+i+"] ["+j+"]");
             VB[i][j] = sc.nextInt();}}

}

    }
