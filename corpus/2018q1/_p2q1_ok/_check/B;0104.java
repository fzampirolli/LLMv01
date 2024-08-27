
 import java.util.Scanner;

public class Exercicio1P2Pedro11201721462 {

    public static void main(String[] args) {

    int tamanho, n;

    boolean existe;

   Scanner scan = new Scanner(System.in);

   System.out.println("Digite o tamanho do vetor:   ");
   tamanho = scan.nextInt();

   int vetor[];
   vetor=new int[tamanho];

   for(n=0; n<tamanho; n++){
    System.out.println("Digite o elemento "+ (n+1)+ " do vetor:   ");   
    vetor[n] = scan.nextInt();
        }
   existe = true ;
   existe= comparaVetor(vetor);

   if(existe==false){
   System.out.println("não existem numeros diferentes de 10 no vetor  ");   
   }
   else{
   System.out.println("Existem numeros diferentes de 10 no vetor  ");   
   }

   }

 public static boolean comparaVetor(int vet[]){
        boolean existencia = false;
        int i ;
        int j;
        j=vet.length;

        for (i = 0; i < j ; i++) {

            if (vet[i] != 10) {
                existencia = true;

            } 
	    }	

                return existencia;

		}

}
