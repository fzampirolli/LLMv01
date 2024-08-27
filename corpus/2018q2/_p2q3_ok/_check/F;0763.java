
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
    int geramedia [] = new int[150];
    int media, soma = 0;
    int ind = 0, contA=0;
    geramedia = (int) (Math.random()*149); 

     static void GeraMatriz(char Mat[][], int nlinhas, int colunas){
           char conceitos []= { 'A', 'B', 'C', 'D', 'F'};
           int i, j, valor;
           for(i = 0; i< nlinhas, i++) {
               for (j = 0; j< ncolunas, j++) { 
               valor = (int)(Math.random()*5);
                Mat[i][j] = conceitos[valor];
               }
           }
     }  
     if (valor < 0.8) {
    System.out.println("Seu conceito é: "+ 'F');
}
     if (valor < 1.5 && valor > 0.8) {
    System.out.println("Seu conceito é: "+ 'D');
}
     if (valor < 2.5 && valor > 1.5) {
    System.out.println("Seu conceito é: "+ 'C');
}
     if (valor < 3.6 && valor > 2.5 ) {
    System.out.println("Seu conceito é: "+ 'B');
}
     if (valor > 3.6) {
    System.out.println("Seu conceito é: "+ 'A');
}
    }
}
