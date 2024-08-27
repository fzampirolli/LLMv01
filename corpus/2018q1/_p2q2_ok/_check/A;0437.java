
import java.util.Scanner;

public class questao2 {
    static Scanner ent=new Scanner(System.in);    

    public static void main(String[] args) {
        int k=25; 
        String[] vetorNome = new String[k];
        String[] vetorDestino = new String[k];
        String nome;

        preencherVetor(vetorNome, vetorDestino, k);

        System.out.print("\nInsira o nome do passageiro para pesquisarmos"
                + " seu destino: ");
        nome = ent.next();

        String destinoProcurado = pesquisarDestino(vetorNome,
                vetorDestino, nome, k);

        if (destinoProcurado.equals(" ")) {
            System.out.println("\n O passageiro nao exsiste");
        }
        else {
            System.out.printf("Nome: %s"
                    + "\nDestino: %s \n",nome,destinoProcurado);
        }              
    }

    public static void preencherVetor(String[] vetorNome, String[] vetorDestino,
            int k) {
        for (int i=0;i<k;i++) {
            System.out.printf("\nposicao %d "
                    + "\n Insira o nome do passageiro: ",i);
            vetorNome[i] = ent.next();

            System.out.print("Agora, insira o destino do passageiro: ");
            vetorDestino[i] = ent.next();            
        }
    }

    public static String pesquisarDestino(String[] vetorNome,
            String[] vetorDestino,String nome,int k) {
        String destino = " ";
        for (int i = 0; i<k; i++) {
            if (nome.equalsIgnoreCase(vetorNome[i])){
                destino = vetorDestino[i];
            }
        }
        return destino;
    }
}
