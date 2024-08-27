
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int A[][], B[][];
    System.out.println("Digite um numero par de linhas: ");
    int L = entrada.nextInt();
    System.out.println("Digite um numero par de colunas: ");
    int C = entrada.nextInt();
    A = new int[L][C];

    Ler(A, L, C);
    Imprimir(A, L, C);
    }
    public static void Ler(int Mat[][], int L, int C){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<L; i++){
            for(int j=0; j<C; j++){
                System.out.println("Digite o valor da posição ("+i+","+j+")");
                Mat[i][j] = entrada.nextInt();
        }}}

    public static void Imprimir(int M[][], int L, int C){
    Scanner entrada = new Scanner(System.in);
    int n=0;
        while(n<L){
        for(int j=0; j<C; j++){
            for(int i=0; i<L; i++){
            System.out.println(M[i][j]);
            }               
        }}