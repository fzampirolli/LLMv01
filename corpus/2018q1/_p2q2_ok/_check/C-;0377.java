
import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tam = 2;
        String nome;
        String vetorNome[] = new String[2];
        String vetorDestino[] = new String[2];
        for(int i=0;i<tam;i++){
            preencherVetorNome(vetorNome, i);
            preencherVetorDestino(vetorDestino, i);
        }
        System.out.println("Qual o nome?");
        nome = sc.nextLine();
        pesquisarDestino(vetorDestino, vetorNome, nome);
        System.out.println(Arrays.toString(vetorDestino));

    }

    public static String pesquisarDestino(String Vd[], String Vn[], String nome){
        boolean p = false;
        String a, c;
        int tam =2, b=1000;

            for(int j=0;j<tam;j++){
                if(nome.equals(Vn[j])){
                    a = Vn[j];
                    b = j;
                    p = true;
                    break;
                }
                else{
                    System.out.println("Passageiro não encontrado!");
                    p= false;
                }
            }
            if(p){

            }

    return Vd[b];
    }

    public static String[] preencherVetorNome(String[] vetorNome, int k){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        vetorNome[k] = sc.nextLine();

        return vetorNome;
    }
    public static String[] preencherVetorDestino(String[] vetorDestino, int k){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu destino?");
        vetorDestino[k] = sc.nextLine();

        return vetorDestino;
    }
}
