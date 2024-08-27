
import java.util.Scanner;

public class Questao3 {
static void GeraMat(char Mat[][] , int nlinhas , int ncolunas){
   char conceitos [] = {'A', 'B' , 'C' , 'D', 'F'};
   int i, j , valor;
     for (i=0 ; i<nlinhas ; i++){
       for(j=0; j < ncolunas ; j++){
       valor = (int)(Math.random()*5);
       Mat[i][j]= conceitos[valor];
       }
     }
}
 public static void ImprimeConceitoFinal(int v[]){
     Scanner entrada = new Scanner(System.in);
     double media;
     for(int i = 0; i<150; i++){
       System.out.printf("Entre com a média de (0 a 4) do aluno  %d\n", i);
       media = entrada.nextDouble();
        if(media < 0.8){
        System.out.println("CONCEITO FINAL F");
        }
        else if(media < 1.5 ){
            System.out.println("CONCEITO FINAL D");
     }
        else if(media < 2.5 ){
            System.out.println("CONCEITO FINAL C");
     }
        else if(media < 3.6){
            System.out.println("CONCEITO FINAL B");
     }
        else {
            System.out.println("CONCEITO FINAL A");
     }
     }

 }    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x [] = new int [150];
        ImprimeConceitoFinal(x);

    }

}
