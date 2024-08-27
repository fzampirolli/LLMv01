
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int i;
        String vetorNome[] = new String [45];
        String vetorDestino[] = new String [45];
        String nnn;
        for (i=0;i<45;i++){
            System.out.println ("Digite o nome do passageiro");
            vetorNome[i] = p.next();
    }
        for (i=0;i<45;i++){
            System.out.println ("Digite o destino do passageiro");
            vetorDestino[i] = p.next();  
    }
        System.out.println ("Digite o destino a ser pesquisado");
        String destino = p.next();
        nnn = pesquisarNome(vetorNome,vetorDestino,destino);
        System.out.println (nnn);
    }

    public static String pesquisarNome(String vetorNome[],String vetorDestino[],String destino){
        String g = "";
        int y;
        for (y=0;y<45;y++){
            if (destino.equals(vetorDestino[y])){
                g = (vetorNome[y]);
            }
        }
    return g;
    }
}
