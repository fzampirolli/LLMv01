
import java.util.Scanner;  

public class JavaApplication1exerci1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAX = 50;
        int V[]= new int[MAX];
        System.out.println("Preencher o vetor : ");
        for (int i=0; i<MAX;i++){
        V[i]=(int)(Math.random()*72-21);
        }
        System.out.println("Vetor");
        for( int i=0;i<50;i++){
            System.out.print(V[i]+" ");
        }
            System.out.println();

        System.out.println("O indice 11 é ");
        for( int i=11;i<12;i++){   
            System.out.print("" +V[11]);
        }
            System.out.println();
            for( int i=0;i<11;i++){    
            int maior=0;
            V[11]=(int)(Math.random()*72-21);  
            if(V[11]<maior){      
             maior=i++;        

            }

          System.out.println("quantidade de numero maior é "+maior); 
       } 
          int valork;  
          System.out.println("Digite um valor inteiro ");
          valork=entrada.nextInt();
          for(int i=0;i<MAX;i++){
          if (valork==V[i]){
          System.out.println("K ocorreu na posição " +V[i]);
          }
          else{
              System.out.println("K nao foi encontrado ");  

                  }

    }

}
}
