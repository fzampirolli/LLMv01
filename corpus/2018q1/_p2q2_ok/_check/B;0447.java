
import java.util.Scanner;
public class EX2 {

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        String vN[]=new String [45];
        String vD[]=new String [45];
        System.out.println("\nDigite os 45 nomes e seus respectivos destinos");
        for(i=0;i<45;i++){
            vN[i]=scan.nextLine();
            vD[i]=scan.nextLine();
        }
        System.out.println(pesquisarNome(vD,vN));
    }
    public static String pesquisarNome(String vD[],String vN[]){
        int i;
        Scanner scan = new Scanner(System.in);
        String D, N="";
        System.out.println("\nDigite o destino do passageiro a ser pesquisado");
        D=scan.nextLine();
        for(i=0;i<45;i++){
            if(vD[i]==D){
                N=vN[i];
            }
            else{
                System.out.println("\n.");
            }
        }
        return N;
    }

}
