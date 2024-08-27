import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        String []vetorDestino =new String[45];
        String []vetorNome =new String[45];
        String destino;
        Scanner src= new Scanner(System.in);

        System.out.println("A seguir digite o destino indicado");
        for (int i=0;i<vetorDestino.length;i++){
            System.out.println("Digite o "+(i+1)+"° destino:");
            vetorDestino[i]=src.nextLine();
        }
        System.out.println("A seguir digite o nome indicado");
        for (int i=0;i<vetorNome.length;i++){
            System.out.println("Digite o "+(i+1)+"° Nome:");
            vetorNome[i]=src.nextLine();
        }
        System.out.println("Digite o destino a ser pesquisado");
        destino=src.nextLine();

        String nome=pesquisarNome(vetorDestino, vetorNome, destino);

        if(nome==""){
            System.out.println("Destino não existe");
        }else   {
            System.out.println("O nome do passageiro: "+nome);
            System.out.println("O destino do passageiro: "+destino);
        }
    }

    public static String pesquisarNome(String[] vDestino, String[] vNome, String destino){
        for (int i=0;i<vDestino.length;i++){
            if(vDestino[i].matches(destino)) {
                return vNome[i];
            }
        }
        return "";
    }

}
