import java.util.Scanner;
public class Questao1 {

    public static boolean c;
    public static int cont,tam;
    public static void main(String[] args){
      Scanner leia = new Scanner(System.in); 
      System.out.println("Digite o tamanho do vetor: ");

      tam = leia.nextInt();
      int[] v = new int[tam];

      for(cont=0;cont<tam;cont++){
      System.out.println("Digite um numero inteiro: ");
      v[cont] = leia.nextInt();
      }

      comparaVetor(v,tam);
      if(c=true){
      System.out.println("Existe numero diferente de 10");
      }

     if(c=false){
      System.out.println("Não existe numero diferente de 10");
     }

    }
    public static boolean comparaVetor(int v[], int tam){

        for(cont=0;cont<tam;cont++){

            if(v[cont]!=10){
                c=true;
            }else{
                c=false;
            }

        }
        return c;

    }
}
