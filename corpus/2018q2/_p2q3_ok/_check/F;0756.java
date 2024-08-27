
import java.util.Scanner;

public class JavaApplication2exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

    }
    static void GeraMat(char Mat[][], int nlinhas, int colunas){

    char conceito;
        char conceitos[]={'A','B','C','D','F'};
        int i,j,valor;
        for(i=0;i<nlinhas;i++){
            for(j=0;j<nlinhas;j++){
                valor=(int)(Math.random()*5);
                Mat[i][j]= conceitos[valor];

            }
        }

}
    static void Geramedia(float p1, float media, float projeto, float p2, float atividade){
         Scanner entrada = new Scanner (System.in);

           System.out.println("Digite a nota da p1 ");
           p1=entrada.nextFloat();
           System.out.println("Digite a nota da p2 ");
           p2=entrada.nextFloat();
           System.out.println("Digite a nota da projeto ");
           projeto=entrada.nextFloat();
           System.out.println("Digite a nota da atividade ");
           atividade=entrada.nextFloat();
           media=((38*p1)+(10*atividade)+(15*projeto)+(37*p2))/100

}
