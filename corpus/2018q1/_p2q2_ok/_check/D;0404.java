
import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tam=2;
        String vetNome[] = new String[tam];
        String vetDestino[] = new String[tam];
        String destin;
        System.out.println("digite um destino:");
        destin = entrada.next();
        preencherVetores(vetNome,tam);
        preencherVetores(vetDestino,tam);
        pesquisarNome(vetNome,vetDestino,destin);
    }
    public static String pesquisarNome(String vetorNome,String vetorDestino,String destino){
       Scanner entrada = new Scanner(System.in);
       int tamanho = 2;
       String nome;
       System.out.println("digite o destino");
       destino=entrada.next();
       for(int i=0;i<tamanho;i++){
           if(destino==vetorDestino[i]){
               nome=vetorNome[i];
           }
           else{
               System.out.println(" '' ");
           }
       }
       return vetorNome;
    }
    public static String preencherVetores(String vetorzinho[],int tamanho){
        Scanner entrada = new Scanner(System.in);
        for(int j=0;j<tamanho;j++){
            System.out.println("digite uma linha de 1 a "+tamanho);
            int i = entrada.nextInt();
            while(i<0||i>tamanho){
                System.out.println("digite uma palavra: ");
                vetorzinho[i]=entrada.next();       
            }    
        }

        return vetorzinho[tamanho];
    }
}
