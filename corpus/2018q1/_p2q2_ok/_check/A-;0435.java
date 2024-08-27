import java.util.Scanner;
public class P22 {
    static int TAM=15;
    public static void main(String[] args) 
    {
        String N[]=new String[TAM], A[]=new String[TAM];
        String nome;
        Scanner nom=new Scanner(System.in);

        PreencheVetorN(N, A);
        System.out.println("Digite o nome da pessoa:");
        nome=nom.next();

        PesquisarAcento(N, A, nome, TAM);

    }

    private static void PreencheVetorN(String[] N, String[] A) {
        int aux;
        Scanner nom=new Scanner(System.in);
        for(aux=0;aux<TAM; aux++){
            System.out.println("Digite o nome do passageiro");
            N[aux]=nom.next();
            System.out.println("Digite o assento do passageiro");
            A[aux]=nom.next();
        }
    }

    private static void PesquisarAcento(String[] N, String[] A, String nome, int n) {
        int aux, aux1=0;
        for(aux=0; aux<n;aux++){
            if(N[aux].equals(nome)){
                System.out.println("O passageiro "+nome+" está sentado no assento "+A[aux]);
                aux1++;
            }
        }
        if(aux1==0){
            System.out.println("Passageiro não existe");
        }
        aux1=0;
    }

}
