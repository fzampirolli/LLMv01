
import java.util.Scanner;
public class Questao2 {

   public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in); 
       String VetorNome[] = new String [45];
       String VetorDestino[] = new String[45];
       String destino;
       int i;

      for (i=0; i<1; i++){
           System.out.println("Digite o nome:");
           VetorNome[i] = entrada.nextLine();
           System.out.println("Digite o destino:");
           VetorDestino[i] = entrada.nextLine();
           destino = VetorDestino[i];
      }

       System.out.println ("Digite o nome de um destino:");
       destino = entrada.nextLine();

       System.out.println("O destino é:"+PesquisarNome(VetorNome,VetorDestino,destino));
    }
   public static String PesquisarNome (String vN[],String vD[], String destino){
       Scanner entrada = new Scanner (System.in);
       String nome = entrada.nextLine();
       int i;
       for (i=0; i<1; i++){
           System.out.println("Digite o nome:");
           vN[i] = entrada.nextLine();
           System.out.println("Digite o destino:");
           vD[i] = entrada.nextLine();
           destino = vD[i];
       if (vD[i].equals(destino)){
           nome = vN[i];
       }
       else {
           System.out.println("");
       }
    }
       return nome;
  }
}
