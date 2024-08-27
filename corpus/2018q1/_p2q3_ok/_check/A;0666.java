
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print ("Digite o tamanho do vetor: ");
        int tam = teclado.nextInt();
        int vetor[] = new int[tam];
        System.out.print ("\n");
        for (int i=0;i<tam;i++){
            System.out.print ("Digite o valor do "+(i+1)+"o elemento do vetor: ");
            vetor [i] = teclado.nextInt();
        }
        System.out.print ("\n");
        int [][] Matriz = CriarMatriz (vetor);
        ImprimirMatriz (Matriz);
        System.out.print ("A média é: "+MediaMatriz(Matriz)+"\n");
    }
    public static int [][] CriarMatriz(int vetor[]){
        Scanner teclado = new Scanner (System.in);
        int tam = vetor.length;
        int Matriz[][] = new int [tam][tam];
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                if (i==j){
                    Matriz [i][j] = vetor[i];
                }
                else{
                    System.out.print ("Digite o valor referente à posiçao "+i+","+j+" da matriz: ");
                    Matriz [i][j] = teclado.nextInt();
                }
            }
        }
        System.out.print ("\n");
        return Matriz;
    }
    public static void ImprimirMatriz(int Matriz[][]){
        int tam = Matriz.length;
        System.out.print ("Matriz:\n");
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                System.out.print (Matriz[i][j]+" ");
            }
        System.out.print("\n");
        }
    }
    public static float MediaMatriz (int Matriz[][]){
        int tam = Matriz.length;
        float soma=0, media, pares=0;
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                if (Matriz[i][j]%2==0){
                    soma = soma + Matriz[i][j];
                    pares++;
                }
            }
        }
        media = soma/pares;
        return media;
    }
}