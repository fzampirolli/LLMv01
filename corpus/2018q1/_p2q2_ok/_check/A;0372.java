
import java.util.*;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String VetorNome[] = new String [45];
        String VetorDestino[] = new String [45];
        String destino, nomepas;

        LeNome(VetorNome);
        LeDestino (VetorDestino);

        System.out.print("Insira um destino: ");
        destino=sc.next();

         nomepas = PesquisaNome(VetorNome, VetorDestino, destino);

         System.out.print ("Para o destino"+ destino+ "foi encontrado o nome: " + nomepas);     

    }

    public static void LeNome (String vnome[]){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite os nomes: ");
        for(int i=0;i<45;i++){
            vnome[i]=sc.next();
        }
    }

    public static void LeDestino (String vdestino[] ){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite os destinos: ");
        for(int i=0;i<45;i++){
            vdestino[i]=sc.next();
        }
    }

    public static String PesquisaNome (String vnome[], String vdestino[], String destino){
        Scanner sc = new Scanner (System.in);
        String nomepas = null ;

        for(int i=0;i<45;i++){
            if (vdestino[i]==destino){
                nomepas = vnome[i];
            }    
            else System.out.print("O destino não existe"); 

        }
       return nomepas;

    }
}
