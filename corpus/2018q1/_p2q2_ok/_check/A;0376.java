
    import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        int n;
        n = 35;
        String vetorNome[], vetorAcento[], acento, a;
        vetorNome = new String[n];
        vetorAcento = new String[n];

        Scanner sc = new Scanner(System.in);

        preencherVetores(vetorAcento, vetorNome, n);

        System.out.println("Digite o número do acento a pesquisar.");
        acento = sc.next();

        a = pesquisarNome(vetorAcento, vetorNome, acento, n);

        System.out.println(a);
    }

    public static String pesquisarNome (String vetorAcento[], String vetorNome[], String acento, int n){
        int i;
        String a;
        a = "";

        for (i = 0; i < n; i++){
            if (vetorAcento[i].equals(acento)){
                a = vetorNome[i];
            }
        }

        return a;
    }

    public static void preencherVetores (String vetorAcento[],String vetorNome[], int n){
        int i;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < n; i++){
            System.out.println("Digite o nome do passageiro.");
            vetorNome[i] = sc.next();

            System.out.println("Agora digite o acento do passageiro");
            vetorAcento[i] = sc.next();
        }

    }
}
