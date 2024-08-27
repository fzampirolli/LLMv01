
import java.util.Scanner;

public class JavaApplication2 {
static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        int n2=45;
        String[] vetorDestino=new String[n2], vetorNome = new String[n2];
        System.out.println("Nomes:");
        leVet(vetorNome);

        System.out.println("Destinos:");
        leVet(vetorDestino);

        System.out.println("Qual o destino do usuário?");
        String nome=sc1.nextLine();
        if (pesquisarNome(vetorNome,vetorDestino,nome).equals("")){
            System.out.println("Destino inexistente");
        }
        else{
            System.out.printf("\nO usuário é %s.\n", pesquisarNome(vetorNome,vetorDestino,nome));
        }        
    }
    public static String pesquisarNome(String[] n, String[] d, String des){
        String nom="";
        for(int i=0;i<d.length;i++){
           if (d[i].equals(des)){
               nom = n[i];
           } 
        }
        return nom;
    }
    public static void leVet(String[] v){
        for (int i=0; i<v.length;i++){
            v[i]=sc1.nextLine();
        }    
    }    
}